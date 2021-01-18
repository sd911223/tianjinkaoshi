package cn.stylefeng.guns.modular.pdf.controller;

import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.util.PdfUtilTest;
import cn.stylefeng.guns.modular.examsign.entity.ExamSign;
import cn.stylefeng.guns.modular.examsign.model.param.ExamSignParam;
import cn.stylefeng.guns.modular.examsign.service.ExamSignService;
import cn.stylefeng.guns.modular.pdf.enums.CertificateTypeEnum;
import cn.stylefeng.guns.modular.pdf.enums.PdfTypeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "Pdf下载/预览")
public class PdfController {
    //    @Autowired
//    private FreeMarkerConfigurer configurer;
    @Autowired
    private ExamSignService examSignService;

    /**
     * pdf预览
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     */
    @ApiOperation("pdf预览")
    @RequestMapping(value = "/pdf/preview", method = RequestMethod.GET)
    public void preview(HttpServletRequest request, HttpServletResponse response,
                        @RequestParam("id") Long id,
                        PdfTypeEnum pdfTypeEnum,
                        CertificateTypeEnum certificateTypeEnum) throws IOException {

        getPdfInfo(id, pdfTypeEnum, certificateTypeEnum, response);
    }

    /**
     * pdf下载
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     */
    @ApiOperation("pdf下载")
    @RequestMapping(value = "/pdf/download", method = RequestMethod.GET)
    public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        getPdfInfo(id, pdfTypeEnum, certificateTypeEnum, response);
        getPdfInfo(1349391322154315777L, PdfTypeEnum.GAO_JI, CertificateTypeEnum.TRANSCRIPT, response);
    }

    /**
     * @param id
     * @param pdfTypeEnum
     * @param certificateTypeEnum
     * @param response
     */
    private void getPdfInfo(Long id,
                            PdfTypeEnum pdfTypeEnum,
                            CertificateTypeEnum certificateTypeEnum,
                            HttpServletResponse response) throws IOException {
        ByteArrayOutputStream baos = null;
        OutputStream out = null;
        String pdfName = "";
        try {
            // 构造freemarker模板引擎参数,listVars.size()个数对应pdf页数
            List<Map<String, Object>> listVars = new ArrayList<>();
            Map<String, Object> variables = new HashMap<>();
            if (pdfTypeEnum.getCode().equals(PdfTypeEnum.GAO_JI.getCode())) {
                ExamSignParam examSignParam = new ExamSignParam();
                examSignParam.setId(id);
                ExamSign examSign = examSignService.detail(examSignParam);
                variables.put("data", examSign);
                listVars.add(variables);
                //准考证
                if (certificateTypeEnum.getCode().equals(CertificateTypeEnum.ADMISSION_TICKET.getCode())) {
                }
                //成绩单
                if (certificateTypeEnum.getCode().equals(CertificateTypeEnum.TRANSCRIPT.getCode())) {
                    baos = PdfUtilTest.createPDF(variables, "zy_bmb.ftl");
                    pdfName = examSign.getName() + "成绩单";
                }
                //报名表
                if (certificateTypeEnum.getCode().equals(CertificateTypeEnum.ADMISSION_TICKET.getCode())) {
                }

            }
            if (pdfTypeEnum.getCode().equals(PdfTypeEnum.Z_P)) {
                variables.put("title", "测试预览ASGX!");
                listVars.add(variables);
            }
            if (pdfTypeEnum.getCode().equals(PdfTypeEnum.JI_CENG)) {
                variables.put("title", "测试预览ASGX!");
                listVars.add(variables);
            }
            if (pdfTypeEnum.getCode().equals(PdfTypeEnum.SHI_CHENG)) {
                variables.put("title", "测试预览ASGX!");
                listVars.add(variables);
            }
            if (pdfTypeEnum.getCode().equals(PdfTypeEnum.ZHONG_YI)) {
                variables.put("title", "测试预览ASGX!");
                listVars.add(variables);
            }
            if (pdfTypeEnum.getCode().equals(PdfTypeEnum.ZHUAN_YE)) {

            }
            // 设置响应消息头，告诉浏览器当前响应是一个下载文件
            response.setContentType("application/x-msdownload");
            // 告诉浏览器，当前响应数据要求用户干预保存到文件中，以及文件名是什么 如果文件名有中文，必须URL编码
            String fileName = URLEncoder.encode(pdfName + ".pdf", "UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            out = response.getOutputStream();
            baos.writeTo(out);
            baos.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(500, "导出失败：" + e.getMessage());
        } finally {
            if (baos != null) {
                baos.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}
