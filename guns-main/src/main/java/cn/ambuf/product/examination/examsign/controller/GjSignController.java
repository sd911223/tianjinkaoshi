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
import cn.ambuf.product.examination.examsign.service.GjSignService;
import cn.ambuf.product.examination.examsign.model.param.GjSignParam;

import javax.annotation.Resource;

/**
 * 高级报名考试管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/20 21:15
 */
@RestController
@Api(tags = "高级报名考试管理")
public class GjSignController {

    @Resource
    private GjSignService gjSignService;

    /**
     * 分页查询高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    @ApiOperation("分页查询高级报名考试管理")
    @GetMapping("/gjSign/page")
    @BusinessLog(title = "高级报名考试管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(GjSignParam gjSignParam) {
        return new SuccessResponseData(gjSignService.page(gjSignParam));
    }

    /**
     * 获取全部高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    @GetMapping("/gjSign/list")
    @BusinessLog(title = "高级报名考试管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(GjSignParam gjSignParam) {
        return new SuccessResponseData(gjSignService.list(gjSignParam));
    }

    /**
     * 查看详情高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    @ApiOperation("查看详情高级报名考试管理")
    @GetMapping("/gjSign/detail")
    @BusinessLog(title = "高级报名考试管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(GjSignParam.detail.class) GjSignParam gjSignParam) {
        return new SuccessResponseData(gjSignService.detail(gjSignParam));
    }

    /**
     * 添加高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    @ApiOperation("添加高级报名考试管理")
    @PostMapping("/gjSign/add")
    @BusinessLog(title = "高级报名考试管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(GjSignParam.add.class) GjSignParam gjSignParam) {
        gjSignService.add(gjSignParam);
        return new SuccessResponseData();
    }

    /**
     * 删除高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    @PostMapping("/gjSign/delete")
    @BusinessLog(title = "高级报名考试管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@RequestBody @Validated(GjSignParam.delete.class) GjSignParam gjSignParam) {
        gjSignService.delete(gjSignParam);
        return new SuccessResponseData();
    }

    /**
     * 编辑高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    @ApiOperation("编辑高级报名考试管理")
    @PostMapping("/gjSign/edit")
    @BusinessLog(title = "高级报名考试管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(GjSignParam.edit.class) GjSignParam gjSignParam) {
        gjSignService.edit(gjSignParam);
        return new SuccessResponseData();
    }


}
