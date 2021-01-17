package cn.stylefeng.guns.modular.scset.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import cn.stylefeng.guns.modular.scset.model.param.ScSetParam;
import cn.stylefeng.guns.modular.scset.service.ScSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 师承设置 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/13 04:10
 */
@RestController
@Api(tags = "师承设置")
public class ScSetController {

    @Resource
    private ScSetService scSetService;

    /**
     * 分页查询师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    @GetMapping("/scSet/page")
    @BusinessLog(title = "师承设置_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(ScSetParam scSetParam) {
        return new SuccessResponseData(scSetService.page(scSetParam));
    }

    /**
     * 获取全部师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    @GetMapping("/scSet/list")
    @BusinessLog(title = "师承设置_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(ScSetParam scSetParam) {
        return new SuccessResponseData(scSetService.list(scSetParam));
    }

    /**
     * 查看详情师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    @ApiOperation("查看详情师承设置")
    @GetMapping("/scSet/detail/{examId}")
    @BusinessLog(title = "师承设置_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@PathVariable("examId") Long examId) {
        ScSetParam scSetParam = new ScSetParam();
        scSetParam.setExamId(examId);
        return new SuccessResponseData(scSetService.detail(scSetParam));
    }

    /**
     * 添加师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    @ApiOperation("添加师承设置")
    @PostMapping("/scSet/add")
    @BusinessLog(title = "师承设置_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(ScSetParam.add.class) ScSetParam scSetParam) {
        scSetService.add(scSetParam);
        return new SuccessResponseData();
    }

    /**
     * 删除师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    @PostMapping("/scSet/delete")
    @BusinessLog(title = "师承设置_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@RequestBody @Validated(ScSetParam.delete.class) ScSetParam scSetParam) {
        scSetService.delete(scSetParam);
        return new SuccessResponseData();
    }

    /**
     * 编辑师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    @ApiOperation("编辑师承设置")
    @PostMapping("/scSet/edit")
    @BusinessLog(title = "师承设置_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(ScSetParam.edit.class) ScSetParam scSetParam) {
        scSetService.edit(scSetParam);
        return new SuccessResponseData();
    }


}
