package cn.stylefeng.guns.modular.scscore.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 综合笔试成绩管理
 *
 * @author ShiTou
 * @date 2021/01/12 23:45
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ScScoreParam extends BaseParam {

    /**
     * 主键ID
     */
    @NotNull(message = "主键ID不能为空",groups = {edit.class})
    private Long id;

    /**
     * 身份证号
     */
    @NotNull(message = "身份证号不能为空",groups = {add.class,edit.class})
    private String idCard;

    /**
     * 考试结果
     */
    @NotNull(message = "考试结果不能为空",groups = {add.class,edit.class})
    private String examResult;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Date createUser;

    /**
     * 修改人
     */
    private Date updateUser;

}
