package cn.ambuf.product.examination.admission.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.annotion.Permission;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.ambuf.product.examination.admission.model.param.JnAdmissionParam;
import cn.ambuf.product.examination.admission.service.JnAdmissionService;
import cn.stylefeng.guns.sys.modular.file.param.SysFileInfoParam;
import cn.stylefeng.guns.sys.modular.file.service.SysFileInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * 专业技能准考证信息管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/16 17:35
 */
@RestController
@Api(tags = "专业技能准考证信息管理")
public class JnAdmissionController {
    @Resource
    private SysFileInfoService sysFileInfoService;
    @Resource
    private JnAdmissionService jnAdmissionService;

    /**
     * 分页查询专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    @ApiOperation("分页查询专业技能准考证信息管理")
    @GetMapping("/jnAdmission/page")
    @BusinessLog(title = "专业技能准考证信息管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(@RequestParam("pageNo") Integer pageNo,
                             @RequestParam("pageSize") Integer pageSize) {
        JnAdmissionParam jnAdmissionParam = new JnAdmissionParam();
        return new SuccessResponseData(jnAdmissionService.page(jnAdmissionParam));
    }

    /**
     * 删除专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    @ApiOperation("删除专业技能准考证信息管理")
    @PostMapping("/jnAdmission/delete/{id}")
    @BusinessLog(title = "专业技能准考证信息管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@PathVariable("id") Long[] id) {
        List<Long> list = Arrays.asList(id);
        list.forEach(e -> {
            JnAdmissionParam jnAdmissionParam = new JnAdmissionParam();
            jnAdmissionParam.setId(e);
            jnAdmissionService.delete(jnAdmissionParam);
        });
        return new SuccessResponseData();
    }


    /**
     * 导出考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导出基础考试成绩")
    @Permission
    @GetMapping("/jnAdmission/export/{id}")
    @BusinessLog(title = "考试成绩_导出", opType = LogAnnotionOpTypeEnum.EXPORT)
    public ResponseData export(@PathVariable(value = "id", required = false) Long[] id) {
        jnAdmissionService.export(id);
        return new SuccessResponseData();
    }


    /**
     * 导入考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导入基础考试成绩")
    @Permission
    @PostMapping("/jnAdmission/import")
    @BusinessLog(title = "考试成绩_导入", opType = LogAnnotionOpTypeEnum.IMPORT)
    public ResponseData importExcel(@RequestParam("file") MultipartFile file) {

        jnAdmissionService.importExcel(file);
        return new SuccessResponseData();
    }

    /**
     * 下载文件
     *
     * @author stylefeng, xuyuxiang
     * @date 2020/6/9 21:53
     */
    @ApiOperation("导入模板下载")
    @GetMapping("/jnAdmission/download")
    @BusinessLog(title = "文件信息表_下载文件", opType = LogAnnotionOpTypeEnum.OTHER)
    public void download(HttpServletResponse response) {
        SysFileInfoParam sysFileInfoParam = new SysFileInfoParam();
        sysFileInfoParam.setId(1348595505906503681L);
        sysFileInfoService.download(sysFileInfoParam, response);
    }


    /**
     * 获取全部专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    @GetMapping("/jnAdmission/list")
    @BusinessLog(title = "专业技能准考证信息管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(JnAdmissionParam jnAdmissionParam) {
        return new SuccessResponseData(jnAdmissionService.list(jnAdmissionParam));
    }

    /**
     * 查看详情专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    @GetMapping("/jnAdmission/detail")
    @BusinessLog(title = "专业技能准考证信息管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(JnAdmissionParam.detail.class) JnAdmissionParam jnAdmissionParam) {
        return new SuccessResponseData(jnAdmissionService.detail(jnAdmissionParam));
    }

    /**
     * 添加专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    @PostMapping("/jnAdmission/add")
    @BusinessLog(title = "专业技能准考证信息管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(JnAdmissionParam.add.class) JnAdmissionParam jnAdmissionParam) {
        jnAdmissionService.add(jnAdmissionParam);
        return new SuccessResponseData();
    }


    /**
     * 编辑专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    @PostMapping("/jnAdmission/edit")
    @BusinessLog(title = "专业技能准考证信息管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(JnAdmissionParam.edit.class) JnAdmissionParam jnAdmissionParam) {
        jnAdmissionService.edit(jnAdmissionParam);
        return new SuccessResponseData();
    }


}
