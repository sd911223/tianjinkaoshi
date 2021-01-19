package cn.stylefeng.guns.modular.examset.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 师承设置
 *
 * @author ShiTou
 * @date 2021/01/13 04:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_sc_set")
public class ScSet extends BaseEntity {

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
     * 报名开始时间
     */
    @TableField("sign_start_time")
    private Date signStartTime;

    /**
     * 报名结束时间
     */
    @TableField("sign_end_time")
    private Date signEndTime;

    /**
     * 现场审核开始时间
     */
    @TableField("site_start_time")
    private Date siteStartTime;

    /**
     * 现场审核结束时间
     */
    @TableField("site_end_time")
    private Date siteEndTime;

    /**
     * 技能考试网上缴费开始时间
     */
    @TableField("skill_pay_start_time")
    private Date skillPayStartTime;

    /**
     * 技能考试网上缴费结束时间
     */
    @TableField("skill_pay_end_time")
    private Date skillPayEndTime;

    /**
     * 技能考试成绩单打印开始时间
     */
    @TableField("skill_score_start_time")
    private Date skillScoreStartTime;

    /**
     * 技能考试成绩单打印结束时间
     */
    @TableField("skill_score_end_time")
    private Date skillScoreEndTime;

    /**
     * 笔试网上缴费开始时间
     */
    @TableField("written_pay_start_time")
    private Date writtenPayStartTime;

    /**
     * 笔试网上缴费结束时间
     */
    @TableField("written_pay_end_time")
    private Date writtenPayEndTime;

    /**
     * 打印笔试成绩单开始时间
     */
    @TableField("print_written_start_time")
    private Date printWrittenStartTime;

    /**
     * 打印笔试成绩单结束时间
     */
    @TableField("print_written_end_time")
    private Date printWrittenEndTime;

    /**
     * 技能准考证打印开始时间
     */
    @TableField("skill_admission_start_time")
    private Date skillAdmissionStartTime;

    /**
     * 技能准考证打印结束时间
     */
    @TableField("skill_admission_end_time")
    private Date skillAdmissionEndTime;

    /**
     * 笔试准考证打印开始时间
     */
    @TableField("written_admission_start_time")
    private Date writtenAdmissionStartTime;

    /**
     * 笔试准考证打印结束时间
     */
    @TableField("written_admission_end_time")
    private Date writtenAdmissionEndTime;

    /**
     * 技能考试报名费用
     */
    @TableField("skill_cost")
    private BigDecimal skillCost;

    /**
     * 笔试报名费用
     */
    @TableField("written_cost")
    private BigDecimal writtenCost;

    /**
     * 学位
     */
    @TableField("academic_degree")
    private String academicDegree;

    /**
     * 学历
     */
    @TableField("education")
    private String education;

    /**
     * 报名须知信息
     */
    @TableField("sign_info")
    private String signInfo;

    /**
     * 考场规则信息
     */
    @TableField("examination_info")
    private String examinationInfo;

    /**
     * 是否审核
     */
    @TableField("is_review")
    private String isReview;

    @TableField("new_sorts")
    private String newSorts;
}
