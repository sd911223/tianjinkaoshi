package cn.stylefeng.guns.modular.controller;


import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.stylefeng.guns.modular.entity.Exam;
import cn.stylefeng.guns.modular.enums.ExamStatusEnum;
import cn.stylefeng.guns.modular.model.param.ExamParam;
import cn.stylefeng.guns.modular.service.ExamService;
import cn.stylefeng.guns.sys.modular.dict.entity.SysDictData;
import cn.stylefeng.guns.sys.modular.dict.param.SysDictDataParam;
import cn.stylefeng.guns.sys.modular.dict.service.SysDictDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 考试 控制器
 *
 * @author: shiTou
 * @date: 2021/01/10 19:37
 */
@RestController
@Api(tags = "考试管理")
public class ExamController {

    @Resource
    private ExamService examService;
    @Resource
    private SysDictDataService sysDictDataService;

    /**
     * 分页查询tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    @ApiOperation("分页查询考试")
    @GetMapping("/exam/page")
    @BusinessLog(title = "tj_exam_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize) {
        ExamParam examParam = new ExamParam();
        PageResult<Exam> page = examService.page(examParam);
        List<Exam> list = page.getRows();
        getListExam(list);
        return new SuccessResponseData(page);
    }

    /**
     * 获取全部tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    @ApiOperation("获取全部考试")
    @GetMapping("/exam/list")
    @BusinessLog(title = "tj_exam_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(ExamParam examParam) {
        List<Exam> list = examService.list(examParam);
        getListExam(list);
        return new SuccessResponseData();
    }

    /**
     * 查看详情tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    @ApiOperation("查看详情考试")
    @GetMapping("/exam/detail")
    @BusinessLog(title = "tj_exam_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(ExamParam.detail.class) ExamParam examParam) {
        Exam detail = examService.detail(examParam);
        SysDictDataParam sysDictDataParam = new SysDictDataParam();
        sysDictDataParam.setId(Long.valueOf(detail.getExamType()));
        SysDictData dictData = sysDictDataService.detail(sysDictDataParam);
        detail.setExamType(dictData.getValue());
        detail.setExamStatus(ExamStatusEnum.valueOf(detail.getExamStatus()).getMessage());
        return new SuccessResponseData(detail);
    }

    /**
     * 添加tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    @ApiOperation("添加考试")
    @PostMapping("/exam/add")
    @BusinessLog(title = "tj_exam_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(ExamParam.add.class) ExamParam examParam) {
        examService.add(examParam);
        return new SuccessResponseData();
    }

    /**
     * 删除tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    @ApiOperation("删除考试")
    @DeleteMapping("/exam/delete/{id}")
    @BusinessLog(title = "tj_exam_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@PathVariable("id") Long[] id) {
        examService.delete(id);
        return new SuccessResponseData();
    }

    /**
     * 撤销发布
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    @ApiOperation("撤销发布")
    @GetMapping("/exam/revoke/{id}")
    @BusinessLog(title = "tj_exam_撤销发布", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData revoke(@PathVariable("id") Long[] id) {
        examService.revoke(id);
        return new SuccessResponseData();
    }

    /**
     * 编辑tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    @ApiOperation("编辑考试")
    @PostMapping("/exam/edit")
    @BusinessLog(title = "tj_exam_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(ExamParam.edit.class) ExamParam examParam) {
        examService.edit(examParam);
        return new SuccessResponseData();
    }

    private void getListExam(List<Exam> list) {
        if (!list.isEmpty()) {
            list.stream().filter(a -> a.getExamType() != null).forEach(e -> {
                SysDictDataParam sysDictDataParam = new SysDictDataParam();
                sysDictDataParam.setId(Long.valueOf(e.getExamType()));
                SysDictData dictData = sysDictDataService.detail(sysDictDataParam);
                e.setExamType(dictData.getValue());
            });
            list.stream().filter(a -> a.getExamStatus() != null).forEach(e -> {
                e.setExamStatus(ExamStatusEnum.valueOf(e.getExamStatus()).getMessage());
            });
        }
    }

}
