package cn.stylefeng.guns.modular.admission.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.annotion.Permission;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.stylefeng.guns.modular.admission.model.param.AdmissionParam;
import cn.stylefeng.guns.modular.admission.service.AdmissionService;
import cn.stylefeng.guns.sys.modular.file.param.SysFileInfoParam;
import cn.stylefeng.guns.sys.modular.file.service.SysFileInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * 准考证管理 控制器
 *
 * @author: shiTou
 * @date: 2021/01/12 00:03
 */
@Api(tags = "准考证管理")
@RestController
public class AdmissionController {

    @Resource
    private AdmissionService admissionService;
    @Resource
    private SysFileInfoService sysFileInfoService;

    /**
     * 分页查询准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    @ApiOperation("分页查询准考证")
    @GetMapping("/admission/page")
    @BusinessLog(title = "准考证管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize) {
        AdmissionParam admissionParam = new AdmissionParam();
        return new SuccessResponseData(admissionService.page(admissionParam));
    }

    /**
     * 删除准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    @ApiOperation("删除准考证")
    @DeleteMapping("/admission/delete/{id}")
    @BusinessLog(title = "准考证管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@PathVariable("id") Long[] id) {
        admissionService.delete(id);
        return new SuccessResponseData();
    }


    /**
     * 导出考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导出准考证")
    @Permission
    @GetMapping("/admission/export/{id}")
    @BusinessLog(title = "准考证_导出", opType = LogAnnotionOpTypeEnum.EXPORT)
    public void export(@PathVariable(value = "id", required = false) Integer[] id) {
        admissionService.export(id);
    }


    /**
     * 导入考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导入准考证")
    @Permission
    @PostMapping("/admission/import")
    @BusinessLog(title = "准考证_导入", opType = LogAnnotionOpTypeEnum.IMPORT)
    public void importExcel(@RequestParam("file") MultipartFile file) {

        admissionService.importExcel(file);
    }

    /**
     * 下载文件
     *
     * @author stylefeng, xuyuxiang
     * @date 2020/6/9 21:53
     */
    @ApiOperation("导入模板下载")
    @GetMapping("/admission/download")
    @BusinessLog(title = "文件信息表_下载文件", opType = LogAnnotionOpTypeEnum.OTHER)
    public void download(HttpServletResponse response) {
        SysFileInfoParam sysFileInfoParam = new SysFileInfoParam();
        sysFileInfoParam.setId(1348595505906503681L);
        sysFileInfoService.download(sysFileInfoParam, response);
    }


    /**
     * 获取全部准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    @GetMapping("/admission/list")
    @BusinessLog(title = "准考证管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(AdmissionParam admissionParam) {
        return new SuccessResponseData(admissionService.list(admissionParam));
    }

    /**
     * 查看详情准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    @GetMapping("/admission/detail")
    @BusinessLog(title = "准考证管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(AdmissionParam.detail.class) AdmissionParam admissionParam) {
        return new SuccessResponseData(admissionService.detail(admissionParam));
    }

    /**
     * 添加准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    @PostMapping("/admission/add")
    @BusinessLog(title = "准考证管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(AdmissionParam.add.class) AdmissionParam admissionParam) {
        admissionService.add(admissionParam);
        return new SuccessResponseData();
    }


    /**
     * 编辑准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    @PostMapping("/admission/edit")
    @BusinessLog(title = "准考证管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(AdmissionParam.edit.class) AdmissionParam admissionParam) {
        admissionService.edit(admissionParam);
        return new SuccessResponseData();
    }


}
