package cn.stylefeng.guns.modular.score.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.annotion.Permission;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.stylefeng.guns.modular.score.model.param.ScoreParam;
import cn.stylefeng.guns.modular.score.service.ScoreService;
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
 * 考试成绩 控制器
 *
 * @author: shiTou
 * @date: 2021/01/11 17:27
 */
@RestController
@Api(tags = "考试成绩管理")
public class ScoreController {

    @Resource
    private ScoreService scoreService;
    @Resource
    private SysFileInfoService sysFileInfoService;

    /**
     * 分页查询考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("分页查询考试成绩")
    @GetMapping("/score/page")
    @BusinessLog(title = "考试成绩_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(@RequestParam("pageNo") Integer pageNo,
                             @RequestParam("pageSize") Integer pageSize,
                             @RequestParam("examId") Long examId) {
        ScoreParam scoreParam = new ScoreParam();
        scoreParam.setBelongingExam(examId);
        return new SuccessResponseData(scoreService.page(scoreParam));
    }


    /**
     * 导出考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导出考试成绩")
    @Permission
    @GetMapping("/score/export/{id}")
    @BusinessLog(title = "考试成绩_导出", opType = LogAnnotionOpTypeEnum.EXPORT)
    public void export(@PathVariable(value = "id", required = false) Integer[] id) {
        scoreService.export(id);
    }


    /**
     * 导入考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("导入考试成绩")
    @Permission
    @PostMapping("/score/import")
    @BusinessLog(title = "考试成绩_导入", opType = LogAnnotionOpTypeEnum.IMPORT)
    public void importExcel(@RequestParam("file") MultipartFile file, @RequestParam("examId") Long examId) {

        scoreService.importExcel(file,examId);
    }

    /**
     * 下载文件
     *
     * @author stylefeng, xuyuxiang
     * @date 2020/6/9 21:53
     */
    @ApiOperation("导入模板下载")
    @GetMapping("/score/download")
    @BusinessLog(title = "文件信息表_下载文件", opType = LogAnnotionOpTypeEnum.OTHER)
    public void download(HttpServletResponse response) {
        SysFileInfoParam sysFileInfoParam = new SysFileInfoParam();
        sysFileInfoParam.setId(1348595505906503681L);
        sysFileInfoService.download(sysFileInfoParam, response);
    }


    /**
     * 获取全部考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @GetMapping("/score/list")
    @BusinessLog(title = "考试成绩_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(ScoreParam scoreParam) {
        return new SuccessResponseData(scoreService.list(scoreParam));
    }

    /**
     * 查看详情考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @GetMapping("/score/detail")
    @BusinessLog(title = "考试成绩_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(ScoreParam.detail.class) ScoreParam scoreParam) {
        return new SuccessResponseData(scoreService.detail(scoreParam));
    }

    /**
     * 添加考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @PostMapping("/score/add")
    @BusinessLog(title = "考试成绩_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(ScoreParam.add.class) ScoreParam scoreParam) {
        scoreService.add(scoreParam);
        return new SuccessResponseData();
    }

    /**
     * 删除考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @ApiOperation("删除考试成绩")
    @DeleteMapping("/score/delete/{id}")
    @BusinessLog(title = "考试成绩_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@PathVariable("id") Long[] id) {
        scoreService.delete(id);
        return new SuccessResponseData();
    }

    /**
     * 编辑考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    @PostMapping("/score/edit")
    @BusinessLog(title = "考试成绩_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(ScoreParam.edit.class) ScoreParam scoreParam) {
        scoreService.edit(scoreParam);
        return new SuccessResponseData();
    }


}
