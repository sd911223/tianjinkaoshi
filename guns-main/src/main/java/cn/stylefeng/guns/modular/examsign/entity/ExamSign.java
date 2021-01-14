package cn.stylefeng.guns.modular.examsign.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 报名人员管理
 *
 * @author ShiTou
 * @date 2021/01/14 22:39
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_exam_sign")
public class ExamSign extends BaseEntity {

    /**
     * 主键
     */
    @TableId("id")
    private Long id;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 身份证号
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 是否面试
     */
    @TableField("is_interview")
    private String isInterview;

    /**
     * 资料审核
     */
    @TableField("data_review")
    private String dataReview;

    /**
     * 资料状态
     */
    @TableField("data_status")
    private String dataStatus;

    /**
     * 支付状态
     */
    @TableField("pay_status")
    private String payStatus;

    /**
     * 银行单号
     */
    @TableField("bank_number")
    private String bankNumber;

    /**
     * 报名支付单号
     */
    @TableField("sign_pay_number")
    private String signPayNumber;

    /**
     * 专业
     */
    @TableField("profession")
    private String profession;

    /**
     * 报考资格
     */
    @TableField("apply_qualifications")
    private String applyQualifications;

    /**
     * 性别
     */
    @TableField("sex")
    private String sex;

    /**
     * 头像地址
     */
    @TableField("avatar_url")
    private String avatarUrl;

    /**
     * 登陆密码
     */
    @TableField("login_password")
    private String loginPassword;

    /**
     * 手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 出生日期
     */
    @TableField("date_of_birth")
    private Date dateOfBirth;

    /**
     * 教育情况
     */
    @TableField("education_info")
    private String educationInfo;

    /**
     * 主管局
     */
    @TableField("office")
    private String office;

    /**
     * 工作单位
     */
    @TableField("work_unit")
    private String workUnit;

    /**
     * 所在科室
     */
    @TableField("department")
    private String department;

    /**
     * 参加工作时间
     */
    @TableField("work_time")
    private Date workTime;

    /**
     * 从事专业
     */
    @TableField("engage_specialty")
    private String engageSpecialty;

    /**
     * 专业工作年限
     */
    @TableField("work_years")
    private Integer workYears;

    /**
     * 聘任时间
     */
    @TableField("engage_time")
    private Date engageTime;

    /**
     * 现任专业技术职务（职称）
     */
    @TableField("skill_post")
    private String skillPost;

    /**
     * 聘任年限
     */
    @TableField("engage_years")
    private Integer engageYears;

    /**
     * 会员状态
     */
    @TableField("member_status")
    private String memberStatus;

    /**
     * 资料提交
     */
    @TableField("is_data_status")
    private String isDataStatus;

    /**
     * 资料审核
     */
    @TableField("is_review_status")
    private String isReviewStatus;

    /**
     * 驳回原因
     */
    @TableField("reject")
    private String reject;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @TableField("del_flag")
    private String delFlag;
    /**
     * 提交状态(草稿:draft sign:报名)
     */
    @TableField("sign_status")
    private String signStatus;

}
