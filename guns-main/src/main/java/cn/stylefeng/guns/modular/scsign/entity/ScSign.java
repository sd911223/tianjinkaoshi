package cn.stylefeng.guns.modular.scsign.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 师承报名人员管理
 *
 * @author ShiTou
 * @date 2021/01/16 16:19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_sc_sign")
public class ScSign extends BaseEntity {

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
     * 头像地址
     */
    @TableField("avatar_img")
    private String avatarImg;

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
     * 性别
     */
    @TableField("sex")
    private String sex;

    /**
     * 户籍地
     */
    @TableField("domicile")
    private String domicile;

    /**
     * 政治面貌
     */
    @TableField("political_status")
    private String politicalStatus;

    /**
     * 健康状况
     */
    @TableField("health_status")
    private String healthStatus;

    /**
     * 民族
     */
    @TableField("ethnic")
    private String ethnic;

    /**
     * 生源地
     */
    @TableField("birthplace")
    private String birthplace;

    /**
     * 婚姻状况
     */
    @TableField("marriage_status")
    private String marriageStatus;

    /**
     * 联系地址
     */
    @TableField("contact_address")
    private String contactAddress;

    /**
     * 身高
     */
    @TableField("height")
    private String height;

    /**
     * 出生日期
     */
    @TableField("born_time")
    private Date bornTime;

    /**
     * 最低单眼裸视视力
     */
    @TableField("vision")
    private String vision;

    /**
     * 邮编
     */
    @TableField("postcode")
    private String postcode;

    /**
     * 手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 联系电话
     */
    @TableField("landline")
    private String landline;

    /**
     * 邮箱
     */
    @TableField("mailbox")
    private String mailbox;

    /**
     * 毕业院校
     */
    @TableField("graduation_school")
    private String graduationSchool;

    /**
     * 所学专业
     */
    @TableField("vocational")
    private String vocational;

    /**
     * 毕业时间
     */
    @TableField("graduation_time")
    private Date graduationTime;

    /**
     * 外语水平及分数
     */
    @TableField("foreign_fraction")
    private String foreignFraction;

    /**
     * 学历
     */
    @TableField("education")
    private String education;

    /**
     * 学位
     */
    @TableField("degree")
    private String degree;

    /**
     * 学制
     */
    @TableField("school_system")
    private String schoolSystem;

    /**
     * 学历类型
     */
    @TableField("learn_type")
    private String learnType;

    /**
     * 计算机水平
     */
    @TableField("computer")
    private String computer;

    /**
     * 是否取得执业职格
     */
    @TableField("is_profession_qualifications")
    private String isProfessionQualifications;

    /**
     * 工作单位
     */
    @TableField("work_unit")
    private String workUnit;

    /**
     * 参加工作时间
     */
    @TableField("join_work_time")
    private Date joinWorkTime;

    /**
     * 现有职称
     */
    @TableField("job_title")
    private String jobTitle;

    /**
     * 是否具备岗位要求的工作经历
     */
    @TableField("work_experience")
    private String workExperience;

    /**
     * 学习简历
     */
    @TableField("learning_resume")
    private String learningResume;

    /**
     * 获取证书情况
     */
    @TableField("certificate_info")
    private String certificateInfo;

    /**
     * 工作简历
     */
    @TableField("work_resume")
    private String workResume;

    /**
     * 意向招聘单位
     */
    @TableField("advertise_job_offers")
    private String advertiseJobOffers;

    /**
     * 是否通过
     */
    @TableField("is_pass")
    private String isPass;

    /**
     * 驳回理由
     */
    @TableField("reject_reason")
    private String rejectReason;

    /**
     * 面试缴费
     */
    @TableField("interview_pay")
    private String interviewPay;

    /**
     * 笔试缴费
     */
    @TableField("written_pay")
    private String writtenPay;

    /**
     * 技能缴费
     */
    @TableField("skill_pay")
    private String skillPay;

    /**
     * 资料提交(0 未提交 1 已提交)
     */
    @TableField("is_data_status")
    private String isDataStatus;

    /**
     * 发布时间
     */
    @TableField("release_time")
    private Date releaseTime;

}
