package cn.ambuf.product.examination.examsign.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 师承报名管理
 *
 * @author ShiTou
 * @date 2021/01/20 22:47
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
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 性别(字典 1:男,2:女)
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 出生日期
     */
    @TableField("born_time")
    private Date bornTime;

    /**
     * 出生地址
     */
    @TableField("born_address")
    private String bornAddress;

    /**
     * 籍贯
     */
    @TableField("hometown")
    private String hometown;

    /**
     * 民族
     */
    @TableField("ethnic")
    private Integer ethnic;

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
     * 电子邮箱
     */
    @TableField("mailbox")
    private String mailbox;

    /**
     * 最高学历(字典)
     */
    @TableField("highest_education")
    private Integer highestEducation;

    /**
     * 获取学位(字典)
     */
    @TableField("obtain_educational")
    private Integer obtainEducational;

    /**
     * 参加工作时间
     */
    @TableField("join_work_time")
    private Date joinWorkTime;

    /**
     * 现主要从事职业
     */
    @TableField("engage_profession")
    private String engageProfession;

    /**
     * 单位名称
     */
    @TableField("unit_name")
    private String unitName;

    /**
     * 邮编
     */
    @TableField("postcode")
    private String postcode;

    /**
     * 通信地址
     */
    @TableField("communicate_address")
    private String communicateAddress;

    /**
     * 本人档案存放单位
     */
    @TableField("file_store")
    private String fileStore;

    /**
     * 存放单位邮编
     */
    @TableField("store_postcode")
    private String storePostcode;

    /**
     * 存放单位通信地址
     */
    @TableField("store_communicate_address")
    private String storeCommunicateAddress;

    /**
     * 指导老师姓名
     */
    @TableField("guide_teacher_name")
    private String guideTeacherName;

    /**
     * 指导老师职称
     */
    @TableField("guide_teacher_appellation")
    private String guideTeacherAppellation;

    /**
     * 指导老师电话
     */
    @TableField("guide_teacher_phone")
    private String guideTeacherPhone;

    /**
     * 指导老师工作年限(字典)
     */
    @TableField("guide_teacher_years")
    private Integer guideTeacherYears;

    /**
     * 指导老师单位
     */
    @TableField("guide_teacher_unit")
    private String guideTeacherUnit;

    /**
     * 指导老师通信地址
     */
    @TableField("guide_teacher_address")
    private String guideTeacherAddress;

    /**
     * 指导老师主要学术
     */
    @TableField("guide_teacher_speciality")
    private String guideTeacherSpeciality;

    /**
     * 个人简历信息
     */
    @TableField("personal_resume")
    private String personalResume;

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
     * 资料审核（0：未生效，1：现场审核驳回，2：现场审核生效,3:笔试审核驳回,4:笔试审核通过）
     */
    @TableField("data_check_status")
    private Integer dataCheckStatus;

    /**
     * 现场驳回原因
     */
    @TableField("reject_reason")
    private String rejectReason;

    /**
     * 支付信息（0：未付，1：已付）
     */
    @TableField("pay_status")
    private Integer payStatus;

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
    private Integer signStatus;

    /**
     * 发布时间
     */
    @TableField("release_time")
    private Date releaseTime;

}
