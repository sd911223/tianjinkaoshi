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
import cn.ambuf.product.examination.examsign.service.JcSignService;
import cn.ambuf.product.examination.examsign.model.param.JcSignParam;

import javax.annotation.Resource;

/**
 * 基层报名管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/20 23:45
 */
@Api(tags = "基层报名管理")
@RestController
public class JcSignController {

    @Resource
    private JcSignService jcSignService;

    /**
     * 分页查询基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    @ApiOperation("分页查询基层报名管理")
    @GetMapping("/jcSign/page")
    @BusinessLog(title = "基层报名管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(JcSignParam jcSignParam) {
        return new SuccessResponseData(jcSignService.page(jcSignParam));
    }

    /**
     * 获取全部基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    @GetMapping("/jcSign/list")
    @BusinessLog(title = "基层报名管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(JcSignParam jcSignParam) {
        return new SuccessResponseData(jcSignService.list(jcSignParam));
    }

    /**
     * 查看详情基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    @ApiOperation("查看详情基层报名管理")
    @GetMapping("/jcSign/detail")
    @BusinessLog(title = "基层报名管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(JcSignParam.detail.class) JcSignParam jcSignParam) {
        return new SuccessResponseData(jcSignService.detail(jcSignParam));
    }

    /**
     * 添加基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    @ApiOperation("添加基层报名管理")
    @PostMapping("/jcSign/add")
    @BusinessLog(title = "基层报名管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(JcSignParam.add.class) JcSignParam jcSignParam) {
        jcSignService.add(jcSignParam);
        return new SuccessResponseData();
    }

    /**
     * 删除基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    @PostMapping("/jcSign/delete")
    @BusinessLog(title = "基层报名管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@RequestBody @Validated(JcSignParam.delete.class) JcSignParam jcSignParam) {
        jcSignService.delete(jcSignParam);
        return new SuccessResponseData();
    }

    /**
     * 编辑基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    @ApiOperation("编辑基层报名管理")
    @PostMapping("/jcSign/edit")
    @BusinessLog(title = "基层报名管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(JcSignParam.edit.class) JcSignParam jcSignParam) {
        jcSignService.edit(jcSignParam);
        return new SuccessResponseData();
    }


}
