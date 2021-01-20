package cn.ambuf.product.examination.examsign.controller;

import cn.stylefeng.guns.core.annotion.BusinessLog;
import cn.stylefeng.guns.core.enums.LogAnnotionOpTypeEnum;
import cn.stylefeng.guns.core.pojo.response.ResponseData;
import cn.stylefeng.guns.core.pojo.response.SuccessResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import cn.ambuf.product.examination.examsign.service.ScSignService;
import cn.ambuf.product.examination.examsign.model.param.ScSignParam;

import javax.annotation.Resource;

/**
 * 师承报名管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/20 22:47
 */
@RestController
@Api(tags = "师承报名管理")
public class ScSignController {

    @Resource
    private ScSignService scSignService;

    /**
     * 分页查询师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    @ApiOperation("分页查询师承报名管理")
    @GetMapping("/scSign/page")
    @BusinessLog(title = "师承报名管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(ScSignParam scSignParam) {
        return new SuccessResponseData(scSignService.page(scSignParam));
    }

    /**
     * 获取全部师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    @GetMapping("/scSign/list")
    @BusinessLog(title = "师承报名管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(ScSignParam scSignParam) {
        return new SuccessResponseData(scSignService.list(scSignParam));
    }

    /**
     * 查看详情师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    @ApiOperation("查看详情师承报名管理")
    @GetMapping("/scSign/detail")
    @BusinessLog(title = "师承报名管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(ScSignParam.detail.class) ScSignParam scSignParam) {
        return new SuccessResponseData(scSignService.detail(scSignParam));
    }

    /**
     * 添加师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    @ApiOperation("添加师承报名管理")
    @PostMapping("/scSign/add")
    @BusinessLog(title = "师承报名管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(ScSignParam.add.class) ScSignParam scSignParam) {
        scSignService.add(scSignParam);
        return new SuccessResponseData();
    }

    /**
     * 删除师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    @PostMapping("/scSign/delete")
    @BusinessLog(title = "师承报名管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@RequestBody @Validated(ScSignParam.delete.class) ScSignParam scSignParam) {
        scSignService.delete(scSignParam);
        return new SuccessResponseData();
    }

    /**
     * 编辑师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    @ApiOperation("编辑师承报名管理")
    @PostMapping("/scSign/edit")
    @BusinessLog(title = "师承报名管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(ScSignParam.edit.class) ScSignParam scSignParam) {
        scSignService.edit(scSignParam);
        return new SuccessResponseData();
    }


}
