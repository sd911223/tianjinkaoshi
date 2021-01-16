package cn.stylefeng.guns.modular.scadmission.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.annotion.Permission;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.stylefeng.guns.modular.scadmission.enums.ScAdmissionTypeEnum;
import cn.stylefeng.guns.modular.scadmission.model.param.ScAdmissionParam;
import cn.stylefeng.guns.modular.scadmission.service.ScAdmissionService;
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
 * 师承综合笔试准考证信息/技能准考证信息管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/12 23:31
 */
@Api(tags = "师承综合笔试准考证信息/技能准考证信息管理")
@RestController
public class ScAdmissionController {

    @Resource
    private ScAdmissionService scAdmissionService;
    @Resource
    private SysFileInfoService sysFileInfoService;

    /**
     * 分页查询师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    @ApiOperation("师承综合笔试准考证信息/技能准考证信息管理_分页查询")
    @GetMapping("/scAdmission/page")
    @BusinessLog(title = "师承综合笔试准考证信息/技能准考证信息管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(@RequestParam("pageNo") Integer pageNo,
                             @RequestParam("pageSize") Integer pageSize,
                             ScAdmissionTypeEnum scAdmissionTypeEnum) {
        ScAdmissionParam scAdmissionParam = new ScAdmissionParam();
        scAdmissionParam.setExamType(scAdmissionTypeEnum.getCode());
        return new SuccessResponseData(scAdmissionService.page(scAdmissionParam));
    }

    /**
     * 删除师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    @ApiOperation("删除师承综合笔试准考证信息管理")
    @PostMapping("/scAdmission/delete/{id}")
    @BusinessLog(title = "师承综合笔试准考证信息/技能准考证信息管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@PathVariable("id") Long[] id) {
        List<Long> longList = Arrays.asList(id);
        longList.forEach(e -> {
            ScAdmissionParam scAdmissionParam = new ScAdmissionParam();
            scAdmissionParam.setId(e);
            scAdmissionService.delete(scAdmissionParam);
        });

        return new SuccessResponseData();
    }

    /**
     * 导出考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导出师师承综合笔试准考证信息/技能准考证信息管理")
    @Permission
    @GetMapping("/scAdmission/export/{id}")
    @BusinessLog(title = "考试成绩_导出", opType = LogAnnotionOpTypeEnum.EXPORT)
    public void export(@PathVariable(value = "id", required = false) Long[] id,
                       ScAdmissionTypeEnum scAdmissionTypeEnum) {

        scAdmissionService.export(id, scAdmissionTypeEnum);
    }


    /**
     * 导入考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导入师承综合笔试准考证信息/技能准考证信息管理")
    @Permission
    @PostMapping("/scAdmission/import")
    @BusinessLog(title = "考试成绩_导入", opType = LogAnnotionOpTypeEnum.IMPORT)
    public void importExcel(@RequestParam("file") MultipartFile file, ScAdmissionTypeEnum scAdmissionTypeEnum) {

        scAdmissionService.importExcel(file, scAdmissionTypeEnum);
    }

    /**
     * 下载文件
     *
     * @author stylefeng, xuyuxiang
     * @date 2020/6/9 21:53
     */
    @ApiOperation("导入模板下载")
    @GetMapping("/scAdmission/download")
    @BusinessLog(title = "文件信息表_下载文件", opType = LogAnnotionOpTypeEnum.OTHER)
    public void download(HttpServletResponse response) {
        SysFileInfoParam sysFileInfoParam = new SysFileInfoParam();
        sysFileInfoParam.setId(1348595505906503681L);
        sysFileInfoService.download(sysFileInfoParam, response);
    }


    /**
     * 获取全部师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    @GetMapping("/scAdmission/list")
    @BusinessLog(title = "师承综合笔试准考证信息管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(ScAdmissionParam scAdmissionParam) {
        return new SuccessResponseData(scAdmissionService.list(scAdmissionParam));
    }

    /**
     * 查看详情师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    @GetMapping("/scAdmission/detail")
    @BusinessLog(title = "师承综合笔试准考证信息管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(ScAdmissionParam.detail.class) ScAdmissionParam scAdmissionParam) {
        return new SuccessResponseData(scAdmissionService.detail(scAdmissionParam));
    }

    /**
     * 添加师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    @PostMapping("/scAdmission/add")
    @BusinessLog(title = "师承综合笔试准考证信息管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(ScAdmissionParam.add.class) ScAdmissionParam scAdmissionParam) {
        scAdmissionService.add(scAdmissionParam);
        return new SuccessResponseData();
    }


    /**
     * 编辑师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    @PostMapping("/scAdmission/edit")
    @BusinessLog(title = "师承综合笔试准考证信息管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(ScAdmissionParam.edit.class) ScAdmissionParam scAdmissionParam) {
        scAdmissionService.edit(scAdmissionParam);
        return new SuccessResponseData();
    }


}
