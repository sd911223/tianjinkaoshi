package cn.stylefeng.guns.modular.scscore.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.annotion.Permission;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.stylefeng.guns.modular.scscore.model.param.ScScoreParam;
import cn.stylefeng.guns.modular.scscore.service.ScScoreService;
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
 * 综合笔试成绩管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/12 23:45
 */
@Api(tags = "综合笔试成绩管理")
@RestController
public class ScScoreController {

    @Resource
    private ScScoreService scScoreService;
    @Resource
    private SysFileInfoService sysFileInfoService;

    /**
     * 分页查询综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    @ApiOperation("分页查询综合笔试成绩管理")
    @GetMapping("/scScore/page")
    @BusinessLog(title = "综合笔试成绩管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(@RequestParam("pageNo") Integer pageNo,
                             @RequestParam("pageSize") Integer pageSize) {
        ScScoreParam scScoreParam = new ScScoreParam();
        return new SuccessResponseData(scScoreService.page(scScoreParam));
    }

    /**
     * 删除综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    @PostMapping("/scScore/delete")
    @BusinessLog(title = "综合笔试成绩管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@PathVariable("id") Long[] id) {
        List<Long> longList = Arrays.asList(id);
        longList.forEach(e -> {
            ScScoreParam scScoreParam = new ScScoreParam();
            scScoreParam.setId(e);
            scScoreService.delete(scScoreParam);
        });

        return new SuccessResponseData();
    }


    /**
     * 导出综合笔试成绩管理
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导出综合笔试成绩管理")
    @Permission
    @GetMapping("/scScore/export/{id}")
    @BusinessLog(title = "考试成绩_导出", opType = LogAnnotionOpTypeEnum.EXPORT)
    public void export(@PathVariable(value = "id", required = false) Integer[] id) {
        scScoreService.export(id);
    }


    /**
     * 导入考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导入综合笔试成绩管理")
    @Permission
    @PostMapping("/scScore/import")
    @BusinessLog(title = "考试成绩_导入", opType = LogAnnotionOpTypeEnum.IMPORT)
    public void importExcel(@RequestParam("file") MultipartFile file) {

        scScoreService.importExcel(file);
    }

    /**
     * 下载文件
     *
     * @author stylefeng, xuyuxiang
     * @date 2020/6/9 21:53
     */
    @ApiOperation("导入模板下载")
    @GetMapping("/scScore/download")
    @BusinessLog(title = "文件信息表_下载文件", opType = LogAnnotionOpTypeEnum.OTHER)
    public void download(HttpServletResponse response) {
        SysFileInfoParam sysFileInfoParam = new SysFileInfoParam();
        sysFileInfoParam.setId(1348595505906503681L);
        sysFileInfoService.download(sysFileInfoParam, response);
    }


    /**
     * 获取全部综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    @GetMapping("/scScore/list")
    @BusinessLog(title = "综合笔试成绩管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(ScScoreParam scScoreParam) {
        return new SuccessResponseData(scScoreService.list(scScoreParam));
    }

    /**
     * 查看详情综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    @GetMapping("/scScore/detail")
    @BusinessLog(title = "综合笔试成绩管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(ScScoreParam.detail.class) ScScoreParam scScoreParam) {
        return new SuccessResponseData(scScoreService.detail(scScoreParam));
    }

    /**
     * 添加综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    @PostMapping("/scScore/add")
    @BusinessLog(title = "综合笔试成绩管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(ScScoreParam.add.class) ScScoreParam scScoreParam) {
        scScoreService.add(scScoreParam);
        return new SuccessResponseData();
    }


    /**
     * 编辑综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    @PostMapping("/scScore/edit")
    @BusinessLog(title = "综合笔试成绩管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(ScScoreParam.edit.class) ScScoreParam scScoreParam) {
        scScoreService.edit(scScoreParam);
        return new SuccessResponseData();
    }


}
