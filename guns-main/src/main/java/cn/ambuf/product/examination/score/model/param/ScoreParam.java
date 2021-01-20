package cn.ambuf.product.examination.score.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 考试成绩
 *
 * @author shiTou
 * @date 2021/01/11 17:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ScoreParam extends BaseParam {

    /**
     * 主键ID
     */
    @NotNull(message = "主键ID不能为空",groups = {edit.class})
    private Integer id;

    /**
     * 身份证号
     */
    @NotNull(message = "身份证号不能为空",groups = {add.class,edit.class})
    private String idCard;

    /**
     * 准考证
     */
    @NotNull(message = "准考证不能为空",groups = {add.class,edit.class})
    private String admissionNumber;

    /**
     * 分数
     */
    @NotNull(message = "分数不能为空",groups = {add.class,edit.class})
    private String fraction;

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

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @NotNull(message = "删除标志（0代表存在 2代表删除）不能为空",groups = {add.class,edit.class})
    private String delFlag;
    /**
     * 所属考试
     */
    private Long belongingExam;

}
