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
import cn.ambuf.product.examination.examsign.service.JnSignService;
import cn.ambuf.product.examination.examsign.model.param.JnSignParam;

import javax.annotation.Resource;

/**
 * 专业技术报名人员管理 控制器
 *
 * @author: ShiTou
 * @date: 2021/01/20 21:48
 */
@RestController
@Api(tags = "专业技术报名人员管理")
public class JnSignController {

    @Resource
    private JnSignService jnSignService;

    /**
     * 分页查询专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    @ApiOperation("分页查询专业技术报名人员管理")
    @GetMapping("/jnSign/page")
    @BusinessLog(title = "专业技术报名人员管理_分页查询", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData page(JnSignParam jnSignParam) {
        return new SuccessResponseData(jnSignService.page(jnSignParam));
    }

    /**
     * 获取全部专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    @GetMapping("/jnSign/list")
    @BusinessLog(title = "专业技术报名人员管理_查询所有", opType = LogAnnotionOpTypeEnum.QUERY)
    public ResponseData list(JnSignParam jnSignParam) {
        return new SuccessResponseData(jnSignService.list(jnSignParam));
    }

    /**
     * 查看详情专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    @ApiOperation("查看详情专业技术报名人员管理")
    @GetMapping("/jnSign/detail")
    @BusinessLog(title = "专业技术报名人员管理_查看详情", opType = LogAnnotionOpTypeEnum.DETAIL)
    public ResponseData detail(@Validated(JnSignParam.detail.class) JnSignParam jnSignParam) {
        return new SuccessResponseData(jnSignService.detail(jnSignParam));
    }

    /**
     * 添加专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    @ApiOperation("添加专业技术报名人员管理")
    @PostMapping("/jnSign/add")
    @BusinessLog(title = "专业技术报名人员管理_增加", opType = LogAnnotionOpTypeEnum.ADD)
    public ResponseData add(@RequestBody @Validated(JnSignParam.add.class) JnSignParam jnSignParam) {
        jnSignService.add(jnSignParam);
        return new SuccessResponseData();
    }

    /**
     * 删除专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    @PostMapping("/jnSign/delete")
    @BusinessLog(title = "专业技术报名人员管理_删除", opType = LogAnnotionOpTypeEnum.DELETE)
    public ResponseData delete(@RequestBody @Validated(JnSignParam.delete.class) JnSignParam jnSignParam) {
        jnSignService.delete(jnSignParam);
        return new SuccessResponseData();
    }

    /**
     * 编辑专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    @ApiOperation("编辑专业技术报名人员管理")
    @PostMapping("/jnSign/edit")
    @BusinessLog(title = "专业技术报名人员管理_编辑", opType = LogAnnotionOpTypeEnum.EDIT)
    public ResponseData edit(@RequestBody @Validated(JnSignParam.edit.class) JnSignParam jnSignParam) {
        jnSignService.edit(jnSignParam);
        return new SuccessResponseData();
    }


}
