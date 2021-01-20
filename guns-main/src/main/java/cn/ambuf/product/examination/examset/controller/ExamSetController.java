package cn.ambuf.product.examination.examset.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.ambuf.product.examination.examset.model.param.ExamSetParam;
import cn.ambuf.product.examination.examset.service.ExamSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 高级/基层 控制器
 *
 * @author: shiTou
 * @date: 2021/01/12 22:20
 */
@RestController
@Api(tags = "高级/基层 考试设置管理")
public class ExamSetController {

    @Resource
    private ExamSetService examSetService;

    /**
     * 分页查询考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    @GetMapping("/examSet/page")
    @BusinessLog(title = "考试设置_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(ExamSetParam examSetParam) {
        return new SuccessResponseData(examSetService.page(examSetParam));
    }

    /**
     * 获取全部考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    @GetMapping("/examSet/list")
    @BusinessLog(title = "考试设置_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(ExamSetParam examSetParam) {
        return new SuccessResponseData(examSetService.list(examSetParam));
    }

    /**
     * 查看详情考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    @ApiOperation("查看详情考试设置")
    @GetMapping("/examSet/detail/{examId}")
    @BusinessLog(title = "考试设置_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@PathVariable("examId") Long examId) {
        ExamSetParam examSetParam = new ExamSetParam();
        examSetParam.setExamId(examId);
        return new SuccessResponseData(examSetService.detail(examSetParam));
    }

    /**
     * 添加 高级/基层考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    @ApiOperation("添加 高级/基层考试设置")
    @PostMapping("/examSet/add")
    @BusinessLog(title = "考试设置_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(ExamSetParam.class) ExamSetParam examSetParam) {
        examSetService.add(examSetParam);
        return new SuccessResponseData();
    }

    /**
     * 删除考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    @PostMapping("/examSet/delete")
    @BusinessLog(title = "考试设置_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@RequestBody @Validated(ExamSetParam.class) ExamSetParam examSetParam) {
        examSetService.delete(examSetParam);
        return new SuccessResponseData();
    }

    /**
     * 编辑考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    @ApiOperation("编辑考试设置")
    @PostMapping("/examSet/edit")
    @BusinessLog(title = "考试设置_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(ExamSetParam.class) ExamSetParam examSetParam) {
        examSetService.edit(examSetParam);
        return new SuccessResponseData();
    }


}
