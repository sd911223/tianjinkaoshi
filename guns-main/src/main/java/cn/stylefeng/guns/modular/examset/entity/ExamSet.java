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
 * 考试设置
 *
 * @author shiTou
 * @date 2021/01/12 22:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_exam_set")
public class ExamSet extends BaseEntity {

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
     * 缴费开始时间
     */
    @TableField("pay_start_time")
    private Date payStartTime;

    /**
     * 缴费结束时间
     */
    @TableField("pay_end_time")
    private Date payEndTime;

    /**
     * 成绩打印开始时间
     */
    @TableField("score_start_time")
    private Date scoreStartTime;

    /**
     * 成绩打印结束时间
     */
    @TableField("score_end_time")
    private Date scoreEndTime;

    /**
     * 准考证打印开始时间
     */
    @TableField("admission_start_time")
    private Date admissionStartTime;

    /**
     * 准考证打印结束时间
     */
    @TableField("admission_end_time")
    private Date admissionEndTime;

    /**
     * 是否收费
     */
    @TableField("is_pay")
    private String isPay;

    /**
     * 收费费用
     */
    @TableField("sign_cost")
    private BigDecimal signCost;

    /**
     * 收费说明
     */
    @TableField("pay_explanation")
    private String payExplanation;

    /**
     * 报名专业
     */
    @TableField("sign_profession")
    private String signProfession;

    /**
     * 签名备注
     */
    @TableField("sign_profession_remark")
    private String signProfessionRemark;

    /**
     * 报考资格
     */
    @TableField("sign_qualifications")
    private String signQualifications;

    /**
     * 报名须知信息设置
     */
    @TableField("sign_info_set")
    private String signInfoSet;

    /**
     * 考场规则信息设置
     */
    @TableField("examination_info_set")
    private String examinationInfoSet;

    /**
     * 是否审核
     */
    @TableField("is_review")
    private String isReview;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @TableField("del_flag")
    private String delFlag;
    /**
     * 考试科目与费用
     */
    @TableField("subject_cost")
    private String subjectCost;
    /**
     * 报名级别
     */
    @TableField("sign_level")
    private String signLevel;
}
