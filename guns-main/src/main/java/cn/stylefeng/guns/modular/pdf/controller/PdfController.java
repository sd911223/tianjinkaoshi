package cn.stylefeng.guns.modular.pdf.controller;

import cn.stylefeng.guns.core.util.PdfUtils;
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
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "Pdf下载/预览")
public class PdfController {
    @Autowired
    private FreeMarkerConfigurer configurer;
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
                        CertificateTypeEnum certificateTypeEnum) {

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
    public void download(HttpServletRequest request, HttpServletResponse response,
                         @RequestParam("id") Long id,
                         PdfTypeEnum pdfTypeEnum,
                         CertificateTypeEnum certificateTypeEnum) {
        getPdfInfo(id, pdfTypeEnum, certificateTypeEnum, response);

    }

    /**
     *
     * @param id
     * @param pdfTypeEnum
     * @param certificateTypeEnum
     * @param response
     */
    private void getPdfInfo(Long id,
                            PdfTypeEnum pdfTypeEnum,
                            CertificateTypeEnum certificateTypeEnum,
                            HttpServletResponse response) {
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
                PdfUtils.preview(configurer, "/gj/z_k_z.ftl", listVars, response);
            }
            //成绩单
            if (certificateTypeEnum.getCode().equals(CertificateTypeEnum.TRANSCRIPT.getCode())) {
                PdfUtils.preview(configurer, "/gj/c_j_d.ftl", listVars, response);
            }
            //报名表
            if (certificateTypeEnum.getCode().equals(CertificateTypeEnum.ADMISSION_TICKET.getCode())) {
                PdfUtils.preview(configurer, "/gj/b_m_b.ftl", listVars, response);
            }

        }
        if (pdfTypeEnum.getCode().equals(PdfTypeEnum.Z_P)) {
            variables.put("title", "测试预览ASGX!");
            listVars.add(variables);
            PdfUtils.preview(configurer, "pdfPage.ftl", listVars, response);
        }
        if (pdfTypeEnum.getCode().equals(PdfTypeEnum.JI_CENG)) {
            variables.put("title", "测试预览ASGX!");
            listVars.add(variables);
            PdfUtils.preview(configurer, "pdfPage.ftl", listVars, response);
        }
        if (pdfTypeEnum.getCode().equals(PdfTypeEnum.SHI_CHENG)) {
            variables.put("title", "测试预览ASGX!");
            listVars.add(variables);
            PdfUtils.preview(configurer, "pdfPage.ftl", listVars, response);
        }
        if (pdfTypeEnum.getCode().equals(PdfTypeEnum.ZHONG_YI)) {
            variables.put("title", "测试预览ASGX!");
            listVars.add(variables);
            PdfUtils.preview(configurer, "pdfPage.ftl", listVars, response);
        }
        if (pdfTypeEnum.getCode().equals(PdfTypeEnum.ZHUAN_YE)) {

        }
    }

}
