package cn.stylefeng.guns.modular.examset.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 技能设置
 *
 * @author ShiTou
 * @date 2021/01/13 14:15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_jn_set")
public class JnSet extends BaseEntity {

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
     * 考试名称
     */
    @TableField("exam_name")
    private String examName;
    /**
     * 图片ID
     */
    @TableField("img_id")
    private Long imgId;
    /**
     * 对应单位
     */
    @TableField("correspond_unit")
    private String correspondUnit;

    /**
     * 毕业生报名开始时间
     */
    @TableField("sign_start_time")
    private Date signStartTime;

    /**
     * 毕业生报名结束时间
     */
    @TableField("sign_end_time")
    private Date signEndTime;

    /**
     * 毕业生缴费开始时间
     */
    @TableField("pay_start_time")
    private Date payStartTime;

    /**
     * 毕业生缴费结束时间
     */
    @TableField("pay_end_time")
    private Date payEndTime;

    /**
     * 毕业生打印开始时间
     */
    @TableField("print_start_time")
    private Date printStartTime;

    /**
     * 毕业生打印结束时间
     */
    @TableField("print_end_time")
    private Date printEndTime;

    /**
     * 考试系统最终关闭时间
     */
    @TableField("close_time")
    private Date closeTime;

    /**
     * 面试支付开启时间
     */
    @TableField("interview_pay_start_time")
    private Date interviewPayStartTime;

    /**
     * 面试支付关闭时间
     */
    @TableField("interview_pay_end_time")
    private Date interviewPayEndTime;

    /**
     * 普通学历生日开始日期
     */
    @TableField("education_start_time")
    private Date educationStartTime;

    /**
     * 普通学历生日结束日期
     */
    @TableField("education_end_time")
    private Date educationEndTime;

    /**
     * 面试考试费用
     */
    @TableField("interview_cost")
    private BigDecimal interviewCost;

    /**
     * 单位会员上报开始时间
     */
    @TableField("report_start_time")
    private Date reportStartTime;

    /**
     * 单位会员上报结束时间
     */
    @TableField("report_end_time")
    private Date reportEndTime;

    /**
     * 面试准考证打印开启时间
     */
    @TableField("interview_print_start_time")
    private Date interviewPrintStartTime;

    /**
     * 面试准考证打印关闭时间
     */
    @TableField("interview_print_end_time")
    private Date interviewPrintEndTime;

    /**
     * 研究生学历生日开始日期
     */
    @TableField("postgraduate_start_time")
    private Date postgraduateStartTime;

    /**
     * 研究生学历生日结束日期
     */
    @TableField("postgraduate_end_time")
    private Date postgraduateEndTime;

    /**
     * 是否开启学历限制
     */
    @TableField("is_education")
    private String isEducation;

    /**
     * 是否开启面试功能
     */
    @TableField("is_interview")
    private String isInterview;

    /**
     * 专科
     */
    @TableField("specialist")
    private String specialist;

    /**
     * 本科
     */
    @TableField("undergraduate_course")
    private String undergraduateCourse;

    /**
     * 研究生
     */
    @TableField("postgraduate")
    private String postgraduate;

    /**
     * 博士
     */
    @TableField("doctor")
    private String doctor;

    /**
     * 毕业生毕业院校性质
     */
    @TableField("graduate_nature")
    private String graduateNature;

    /**
     * 是否审核
     */
    @TableField("is_review")
    private String isReview;

    /**
     * 面试考试须知
     */
    @TableField("audition_notice")
    private String auditionNotice;

    /**
     * 准考证考试须知
     */
    @TableField("exam_notice")
    private String examNotice;

    /**
     * 会员注册报名须知信息
     */
    @TableField("registered_set")
    private String registeredSet;

    /**
     * 考试科目与费用
     */
    @TableField("subject_cost_set")
    private String subjectCostSet;

}
