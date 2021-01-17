package cn.stylefeng.guns.modular.exam.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.stylefeng.guns.modular.exam.entity.Exam;
import cn.stylefeng.guns.modular.exam.entity.ExamExpand;
import cn.stylefeng.guns.modular.exam.enums.ExamStatusEnum;
import cn.stylefeng.guns.modular.exam.model.param.ExamParam;
import cn.stylefeng.guns.modular.exam.service.ExamService;
import cn.stylefeng.guns.sys.modular.dict.entity.SysDictData;
import cn.stylefeng.guns.sys.modular.dict.param.SysDictDataParam;
import cn.stylefeng.guns.sys.modular.dict.service.SysDictDataService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 考试管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/13 01:35
 */
@Api(tags = "考试管理")
@RestController
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
        List<ExamExpand> listExam = getListExam(list);
        PageResult<ExamExpand> examExpandPage= new PageResult<ExamExpand>();
        examExpandPage.setRows(listExam);
        examExpandPage.setPageNo(page.getPageNo());
        examExpandPage.setPageSize(page.getPageSize());
        examExpandPage.setTotalPage(page.getTotalPage());
        return new SuccessResponseData(examExpandPage);
    }

    /**
     * 获取全部tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
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
        ExamExpand examExpand = new ExamExpand();
        BeanUtils.copyProperties(detail,examExpand);
        SysDictDataParam sysDictDataParam = new SysDictDataParam();
        sysDictDataParam.setId(Long.valueOf(detail.getExamType()));
        SysDictData dictData = sysDictDataService.detail(sysDictDataParam);
        examExpand.setExamTypeName(dictData.getValue());
        examExpand.setExamStatusName(ExamStatusEnum.valueOf(detail.getExamStatus()).getMessage());
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

    private List<ExamExpand> getListExam(List<Exam> list) {
        List<ExamExpand> examExpandList = new ArrayList<ExamExpand>();
        if (!list.isEmpty()) {

            list.stream().filter(a -> a.getExamType() != null).forEach(e -> {
                ExamExpand examExpand = new ExamExpand();
                BeanUtils.copyProperties(e, examExpand);
                SysDictDataParam sysDictDataParam = new SysDictDataParam();
                sysDictDataParam.setId(Long.valueOf(e.getExamType()));
                SysDictData dictData = sysDictDataService.detail(sysDictDataParam);
                examExpand.setExamTypeName(dictData.getValue());
                examExpand.setExamStatusName(ExamStatusEnum.valueOf(e.getExamStatus()).getMessage());
                examExpandList.add(examExpand);
            });
        }
        return examExpandList;
    }

}
