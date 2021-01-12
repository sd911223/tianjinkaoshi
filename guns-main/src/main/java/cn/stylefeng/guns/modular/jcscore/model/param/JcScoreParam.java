package cn.stylefeng.guns.modular.jcscore.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 基础考试成绩
 *
 * @author shiTou
 * @date 2021/01/12 22:59
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class JcScoreParam extends BaseParam {

    /**
     * 主键ID
     */
    @NotNull(message = "主键ID不能为空", groups = {edit.class})
    private Long id;

    /**
     * 身份证号
     */
    @NotNull(message = "身份证号不能为空", groups = {add.class, edit.class})
    private String idCard;

    /**
     * 准考证
     */
    @NotNull(message = "准考证不能为空", groups = {add.class, edit.class})
    private String admissionNumber;

    /**
     * 分数
     */
    @NotNull(message = "分数不能为空", groups = {add.class, edit.class})
    private String fraction;

    /**
     * 状态
     */
    @NotNull(message = "状态不能为空", groups = {add.class, edit.class})
    private String scoreStatus;

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
    private Long createUser;

    /**
     * 修改人
     */
    private Long updateUser;


}
