package cn.ambuf.product.examination.examset.model.result;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 师承设置
 *
 * @author ShiTou
 * @date 2021/01/13 04:10
 */
@Data
public class ScSetResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 考试ID
     */
    private Long examId;

    /**
     * 报名开始时间
     */
    private Date signStartTime;

    /**
     * 报名结束时间
     */
    private Date signEndTime;

    /**
     * 现场审核开始时间
     */
    private Date siteStartTime;

    /**
     * 现场审核结束时间
     */
    private Date siteEndTime;

    /**
     * 技能考试网上缴费开始时间
     */
    private Date skillPayStartTime;

    /**
     * 技能考试网上缴费结束时间
     */
    private Date skillPayEndTime;

    /**
     * 技能考试成绩单打印开始时间
     */
    private Date skillScoreStartTime;

    /**
     * 技能考试成绩单打印结束时间
     */
    private Date skillScoreEndTime;

    /**
     * 笔试网上缴费开始时间
     */
    private Date writtenPayStartTime;

    /**
     * 笔试网上缴费结束时间
     */
    private Date writtenPayEndTime;

    /**
     * 打印笔试成绩单开始时间
     */
    private Date printWrittenStartTime;

    /**
     * 打印笔试成绩单结束时间
     */
    private Date printWrittenEndTime;

    /**
     * 技能准考证打印开始时间
     */
    private Date skillAdmissionStartTime;

    /**
     * 技能准考证打印结束时间
     */
    private Date skillAdmissionEndTime;

    /**
     * 笔试准考证打印开始时间
     */
    private Date writtenAdmissionStartTime;

    /**
     * 笔试准考证打印结束时间
     */
    private Date writtenAdmissionEndTime;

    /**
     * 技能考试报名费用
     */
    private BigDecimal skillCost;

    /**
     * 笔试报名费用
     */
    private  BigDecimal writtenCost;

    /**
     * 学位
     */
    private String academicDegree;

    /**
     * 学历
     */
    private String education;

    /**
     * 报名须知信息
     */
    private String signInfo;

    /**
     * 考场规则信息
     */
    private String examinationInfo;

    /**
     * 是否审核
     */
    private String isReview;
    private String newSorts;

}
