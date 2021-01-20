package cn.ambuf.product.examination.score.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 专业技能成绩管理
 *
 * @author ShiTou
 * @date 2021/01/17 18:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class JnScoreParam extends BaseParam {

    /**
     * 主键ID
     */
    @NotNull(message = "主键ID不能为空",groups = {edit.class})
    private Long id;

    /**
     * 身份证
     */
    @NotNull(message = "身份证不能为空",groups = {add.class,edit.class})
    private String idCard;

    /**
     * 准考号
     */
    @NotNull(message = "准考号不能为空",groups = {add.class,edit.class})
    private String examinationNumber;

    /**
     * 科目一成绩
     */
    @NotNull(message = "科目一成绩不能为空",groups = {add.class,edit.class})
    private String oneScore;

    /**
     * 科目二成绩
     */
    @NotNull(message = "科目二成绩不能为空",groups = {add.class,edit.class})
    private String towScore;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * update_time
     */
    private Date updateTime;

    /**
     * create_user
     */
    private Long createUser;

    /**
     * update_user
     */
    private Long updateUser;

}
