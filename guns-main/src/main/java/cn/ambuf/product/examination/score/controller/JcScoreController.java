package cn.ambuf.product.examination.score.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.annotion.Permission;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.ambuf.product.examination.score.model.param.JcScoreParam;
import cn.ambuf.product.examination.score.service.JcScoreService;
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
 * 基础考试成绩 控制器
 *
 * @author: shiTou
 * @date: 2021/01/12 22:59
 */
@RestController
@Api(tags = "基础考试成绩")
public class JcScoreController {

    @Resource
    private JcScoreService jcScoreService;
    @Resource
    private SysFileInfoService sysFileInfoService;

    /**
     * 分页查询基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    @ApiOperation("分页查询基础考试成绩")
    @GetMapping("/jcScore/page")
    @BusinessLog(title = "基础考试成绩_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(@RequestParam("pageNo") Integer pageNo,
                             @RequestParam("pageSize") Integer pageSize) {
        JcScoreParam jcScoreParam = new JcScoreParam();
        return new SuccessResponseData(jcScoreService.page(jcScoreParam));
    }

    /**
     * 删除基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    @ApiOperation("删除基础考试成绩")
    @PostMapping("/jcScore/delete/{id}")
    @BusinessLog(title = "基础考试成绩_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@PathVariable(value = "id",required = false) Long[] id) {
        List<Long> list = Arrays.asList(id);
        list.forEach(e -> {
            JcScoreParam jcScoreParam = new JcScoreParam();
            jcScoreParam.setId(e);
            jcScoreService.delete(jcScoreParam);
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
    @GetMapping("/jcScore/export/{id}")
    @BusinessLog(title = "考试成绩_导出", opType = LogAnnotionOpTypeEnum.EXPORT)
    public ResponseData export(@PathVariable(value = "id", required = false) Long[] id) {
        jcScoreService.export(id);
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
    @PostMapping("/jcScore/import")
    @BusinessLog(title = "考试成绩_导入", opType = LogAnnotionOpTypeEnum.IMPORT)
    public ResponseData importExcel(@RequestParam("file") MultipartFile file) {

        jcScoreService.importExcel(file);
        return new SuccessResponseData();
    }

    /**
     * 下载文件
     *
     * @author stylefeng, xuyuxiang
     * @date 2020/6/9 21:53
     */
    @ApiOperation("导入模板下载")
    @GetMapping("/jcScore/download")
    @BusinessLog(title = "文件信息表_下载文件", opType = LogAnnotionOpTypeEnum.OTHER)
    public void download(HttpServletResponse response) {
        SysFileInfoParam sysFileInfoParam = new SysFileInfoParam();
        sysFileInfoParam.setId(1350443722625720322L);
        sysFileInfoService.download(sysFileInfoParam, response);
    }


    /**
     * 获取全部基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    @GetMapping("/jcScore/list")
    @BusinessLog(title = "基础考试成绩_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(JcScoreParam jcScoreParam) {
        return new SuccessResponseData(jcScoreService.list(jcScoreParam));
    }

    /**
     * 查看详情基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    @GetMapping("/jcScore/detail")
    @BusinessLog(title = "基础考试成绩_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(JcScoreParam.detail.class) JcScoreParam jcScoreParam) {
        return new SuccessResponseData(jcScoreService.detail(jcScoreParam));
    }

    /**
     * 添加基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    @PostMapping("/jcScore/add")
    @BusinessLog(title = "基础考试成绩_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(JcScoreParam.add.class) JcScoreParam jcScoreParam) {
        jcScoreService.add(jcScoreParam);
        return new SuccessResponseData();
    }


    /**
     * 编辑基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    @PostMapping("/jcScore/edit")
    @BusinessLog(title = "基础考试成绩_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(JcScoreParam.edit.class) JcScoreParam jcScoreParam) {
        jcScoreService.edit(jcScoreParam);
        return new SuccessResponseData();
    }


}
