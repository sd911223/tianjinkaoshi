package cn.stylefeng.guns.modular.score.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.annotion.Permission;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.stylefeng.guns.modular.score.model.param.JnScoreParam;
import cn.stylefeng.guns.modular.score.service.JnScoreService;
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
 * 专业技能成绩管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/17 18:10
 */
@Api(tags = "专业技能成绩管理")
@RestController
public class JnScoreController {

    @Resource
    private JnScoreService jnScoreService;
    @Resource
    private SysFileInfoService sysFileInfoService;

    /**
     * 分页查询专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    @ApiOperation("分页查询专业技能成绩管理")
    @GetMapping("/jnScore/page")
    @BusinessLog(title = "专业技能成绩管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(@RequestParam("pageNo") Integer pageNo,
                             @RequestParam("pageSize") Integer pageSize) {
        JnScoreParam jnScoreParam = new JnScoreParam();
        return new SuccessResponseData(jnScoreService.page(jnScoreParam));
    }

    /**
     * 删除专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    @ApiOperation("删除专业技能成绩管理")
    @PostMapping("/jnScore/delete/{id}")
    @BusinessLog(title = "专业技能成绩管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@PathVariable(value = "id") Long[] id) {
        List<Long> list = Arrays.asList(id);
        if (!list.isEmpty()) {
            list.forEach(e -> {
                JnScoreParam jnScoreParam = new JnScoreParam();
                jnScoreParam.setId(e);
                jnScoreService.delete(jnScoreParam);
            });

        }
        return new SuccessResponseData();
    }

    /**
     * 导出专业技能成绩管理
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导出专业技能成绩管理")
    @Permission
    @GetMapping("/jnScore/export/{id}")
    @BusinessLog(title = "专业技能成绩_导出", opType = LogAnnotionOpTypeEnum.EXPORT)
    public ResponseData export(@PathVariable(value = "id", required = false) Long[] id) {
        jnScoreService.export(id);
        return new SuccessResponseData();
    }


    /**
     * 导入专业技能成绩管理
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导入专业技能成绩管理")
    @Permission
    @PostMapping("/jnScore/import")
    @BusinessLog(title = "专业技能成绩_导入", opType = LogAnnotionOpTypeEnum.IMPORT)
    public ResponseData importExcel(@RequestParam("file") MultipartFile file) {

        jnScoreService.importExcel(file);
        return new SuccessResponseData();
    }

    /**
     * 下载文件
     *
     * @author stylefeng, xuyuxiang
     * @date 2020/6/9 21:53
     */
    @ApiOperation("导入模板下载")
    @GetMapping("/jnScore/download")
    @BusinessLog(title = "专业技能成绩_下载文件", opType = LogAnnotionOpTypeEnum.OTHER)
    public void download(HttpServletResponse response) {
        SysFileInfoParam sysFileInfoParam = new SysFileInfoParam();
        sysFileInfoParam.setId(1350443722625720322L);
        sysFileInfoService.download(sysFileInfoParam, response);
    }


    /**
     * 获取全部专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    @GetMapping("/jnScore/list")
    @BusinessLog(title = "专业技能成绩管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(JnScoreParam jnScoreParam) {
        return new SuccessResponseData(jnScoreService.list(jnScoreParam));
    }

    /**
     * 查看详情专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    @GetMapping("/jnScore/detail")
    @BusinessLog(title = "专业技能成绩管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(JnScoreParam.detail.class) JnScoreParam jnScoreParam) {
        return new SuccessResponseData(jnScoreService.detail(jnScoreParam));
    }

    /**
     * 添加专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    @PostMapping("/jnScore/add")
    @BusinessLog(title = "专业技能成绩管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(JnScoreParam.add.class) JnScoreParam jnScoreParam) {
        jnScoreService.add(jnScoreParam);
        return new SuccessResponseData();
    }


    /**
     * 编辑专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    @PostMapping("/jnScore/edit")
    @BusinessLog(title = "专业技能成绩管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(JnScoreParam.edit.class) JnScoreParam jnScoreParam) {
        jnScoreService.edit(jnScoreParam);
        return new SuccessResponseData();
    }


}
