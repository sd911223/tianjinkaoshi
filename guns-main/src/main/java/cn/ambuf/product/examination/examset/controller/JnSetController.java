package cn.ambuf.product.examination.examset.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import cn.ambuf.product.examination.examset.service.JnSetService;
import cn.ambuf.product.examination.examset.model.param.JnSetParam;

import javax.annotation.Resource;

/**
 * 技能设置 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/13 14:15
 */
@Api(tags = "专业技术资格考试")
@RestController
public class JnSetController {

    @Resource
    private JnSetService jnSetService;

    /**
     * 分页查询技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    @GetMapping("/jnSet/page")
    @BusinessLog(title = "技能设置_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(JnSetParam jnSetParam) {
        return new SuccessResponseData(jnSetService.page(jnSetParam));
    }

    /**
     * 获取全部技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    @GetMapping("/jnSet/list")
    @BusinessLog(title = "技能设置_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(JnSetParam jnSetParam) {
        return new SuccessResponseData(jnSetService.list(jnSetParam));
    }

    /**
     * 查看详情技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    @ApiOperation("查看详情技能设置")
    @GetMapping("/jnSet/detail/{examId}")
    @BusinessLog(title = "技能设置_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@PathVariable("examId") Long examId) {
        JnSetParam jnSetParam =new  JnSetParam();
        jnSetParam.setExamId(examId);
        return new SuccessResponseData(jnSetService.detail(jnSetParam));
    }

    /**
     * 添加技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    @ApiOperation("添加技能设置")
    @PostMapping("/jnSet/add")
    @BusinessLog(title = "技能设置_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(JnSetParam.add.class) JnSetParam jnSetParam) {
        jnSetService.add(jnSetParam);
        return new SuccessResponseData();
    }

    /**
     * 删除技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    @PostMapping("/jnSet/delete")
    @BusinessLog(title = "技能设置_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@RequestBody @Validated(JnSetParam.delete.class) JnSetParam jnSetParam) {
        jnSetService.delete(jnSetParam);
        return new SuccessResponseData();
    }

    /**
     * 编辑技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    @ApiOperation("编辑技能设置")
    @PostMapping("/jnSet/edit")
    @BusinessLog(title = "技能设置_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(JnSetParam.edit.class) JnSetParam jnSetParam) {
        jnSetService.edit(jnSetParam);
        return new SuccessResponseData();
    }


}
