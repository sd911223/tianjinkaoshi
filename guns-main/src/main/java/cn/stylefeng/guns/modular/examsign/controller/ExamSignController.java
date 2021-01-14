package cn.stylefeng.guns.modular.examsign.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.stylefeng.guns.modular.examsign.model.param.ExamSignParam;
import cn.stylefeng.guns.modular.examsign.service.ExamSignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 报名人员管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/14 22:39
 */
@Api(tags = "高级/基本报名人员管理")
@RestController
public class ExamSignController {

    @Resource
    private ExamSignService examSignService;

    /**
     * 分页查询报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    @ApiOperation("分页查询报名人员管理")
    @GetMapping("/examSign/page")
    @BusinessLog(title = "报名人员管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(ExamSignParam examSignParam) {
        return new SuccessResponseData(examSignService.page(examSignParam));
    }

    /**
     * 获取全部报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    @GetMapping("/examSign/list")
    @BusinessLog(title = "报名人员管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(ExamSignParam examSignParam) {
        return new SuccessResponseData(examSignService.list(examSignParam));
    }

    /**
     * 查看详情报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    @ApiOperation("查看详情报名人员管理")
    @GetMapping("/examSign/detail")
    @BusinessLog(title = "报名人员管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(ExamSignParam.detail.class) ExamSignParam examSignParam) {
        return new SuccessResponseData(examSignService.detail(examSignParam));
    }

    /**
     * 添加报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    @ApiOperation("添加高级-报名人员管理")
    @PostMapping("/examSign/add")
    @BusinessLog(title = "报名人员管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(ExamSignParam.add.class) ExamSignParam examSignParam) {
        examSignService.add(examSignParam);
        return new SuccessResponseData();
    }

    /**
     * 删除报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    @PostMapping("/examSign/delete")
    @BusinessLog(title = "报名人员管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@RequestBody @Validated(ExamSignParam.delete.class) ExamSignParam examSignParam) {
        examSignService.delete(examSignParam);
        return new SuccessResponseData();
    }

    /**
     * 编辑报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    @ApiOperation("编辑报名人员管理")
    @PostMapping("/examSign/edit")
    @BusinessLog(title = "报名人员管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(ExamSignParam.edit.class) ExamSignParam examSignParam) {
        examSignService.edit(examSignParam);
        return new SuccessResponseData();
    }


}
