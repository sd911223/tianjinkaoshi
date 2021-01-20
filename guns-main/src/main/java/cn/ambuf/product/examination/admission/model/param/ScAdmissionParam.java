package cn.ambuf.product.examination.admission.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 师承综合笔试准考证信息管理
 *
 * @author ShiTou
 * @date 2021/01/12 23:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ScAdmissionParam extends BaseParam {

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
     * 报考序号
     */
    @NotNull(message = "报考序号不能为空", groups = {add.class, edit.class})
    private String applyNumber;

    /**
     * 考试时间
     */
    @NotNull(message = "考试时间不能为空", groups = {add.class, edit.class})
    private String examTime;

    /**
     * 签到时间
     */
    @NotNull(message = "签到时间不能为空", groups = {add.class, edit.class})
    private String signTime;

    /**
     * 考场地址
     */
    @NotNull(message = "考场地址不能为空", groups = {add.class, edit.class})
    private String examinationAddress;

    /**
     * 签到地点
     */
    @NotNull(message = "签到地点不能为空", groups = {add.class, edit.class})
    private String signAddress;

    /**
     * 类型(SKILL_ADMISSION:技能准考证信息管理   SKILL_ADMISSION:综合笔试准考证信息管理)
     */
    private String examType;
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
