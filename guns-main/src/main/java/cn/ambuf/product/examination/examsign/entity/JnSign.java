package cn.ambuf.product.examination.examsign.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 专业技术报名人员管理
 *
 * @author ShiTou
 * @date 2021/01/20 21:48
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_jn_sign")
public class JnSign extends BaseEntity {

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 考试ID
     */
    @TableField("exam_id")
    private Long examId;

    /**
     * 选择专业（字典）
     */
    @TableField("select_specialty")
    private Integer selectSpecialty;

    /**
     * 选择报考级别(字典)
     */
    @TableField("select_apply_level")
    private Integer selectApplyLevel;

    /**
     * 身份证号
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 头像code
     */
    @TableField("avatar_code")
    private Long avatarCode;

    /**
     * 联系电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 民族
     */
    @TableField("ethnic")
    private String ethnic;

    /**
     * 最高学历(字典)
     */
    @TableField("highest_education")
    private Integer highestEducation;

    /**
     * 毕业时间
     */
    @TableField("graduate_time")
    private Date graduateTime;

    /**
     * 毕业院校
     */
    @TableField("graduate_school")
    private String graduateSchool;

    /**
     * 毕业专业
     */
    @TableField("graduate_specialty")
    private String graduateSpecialty;

    /**
     * 现有资格(字典)
     */
    @TableField("existing_qualifications")
    private Integer existingQualifications;

    /**
     * 取得资格年限
     */
    @TableField("qualifications_years")
    private Integer qualificationsYears;

    /**
     * 工作单位
     */
    @TableField("work_unit")
    private String workUnit;

    /**
     * 工作年限
     */
    @TableField("work_years")
    private Integer workYears;

    /**
     * 主管区、县、局（总公司）
     */
    @TableField("head_office")
    private String headOffice;

    /**
     * 是否征订考试大纲
     */
    @TableField("is_outline")
    private Integer isOutline;

    /**
     * 会员状态（0：正常，1：锁定）
     */
    @TableField("member_status")
    private Integer memberStatus;

    /**
     * 资料提交（0：未提交，1：已提交）
     */
    @TableField("data_submit_status")
    private Integer dataSubmitStatus;

    /**
     * 资料审核（0：未生效，1：生效，2：驳回）
     */
    @TableField("data_check_status")
    private Integer dataCheckStatus;

    /**
     * 驳回原因
     */
    @TableField("reject_reason")
    private String rejectReason;

    /**
     * 支付信息（0：未付，1：已付）
     */
    @TableField("pay_status")
    private String payStatus;

    /**
     * 订单号
     */
    @TableField("order_number")
    private String orderNumber;

    /**
     * 银行返回单号
     */
    @TableField("bank_order_number")
    private String bankOrderNumber;

    /**
     * 报名状态（0：草稿，1：正式）
     */
    @TableField("sign_status")
    private String signStatus;

}
