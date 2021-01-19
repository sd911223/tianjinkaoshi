package cn.stylefeng.guns.modular.examset.model.result;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 技能设置
 *
 * @author ShiTou
 * @date 2021/01/13 14:15
 */
@Data
public class JnSetResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 考试ID
     */
    private Long examId;

    /**
     * 考试名称
     */
    private String examName;

    /**
     * 对应单位
     */
    private String correspondUnit;

    /**
     * 毕业生报名开始时间
     */
    private Date signStartTime;

    /**
     * 毕业生报名结束时间
     */
    private Date signEndTime;

    /**
     * 毕业生缴费开始时间
     */
    private Date payStartTime;

    /**
     * 毕业生缴费结束时间
     */
    private Date payEndTime;

    /**
     * 毕业生打印开始时间
     */
    private Date printStartTime;

    /**
     * 毕业生打印结束时间
     */
    private Date printEndTime;

    /**
     * 考试系统最终关闭时间
     */
    private Date closeTime;

    /**
     * 面试支付开启时间
     */
    private Date interviewPayStartTime;

    /**
     * 面试支付关闭时间
     */
    private Date interviewPayEndTime;

    /**
     * 普通学历生日开始日期
     */
    private Date educationStartTime;

    /**
     * 普通学历生日结束日期
     */
    private Date educationEndTime;

    /**
     * 面试考试费用
     */
    private BigDecimal interviewCost;

    /**
     * 单位会员上报开始时间
     */
    private Date reportStartTime;

    /**
     * 单位会员上报结束时间
     */
    private Date reportEndTime;

    /**
     * 面试准考证打印开启时间
     */
    private Date interviewPrintStartTime;

    /**
     * 面试准考证打印关闭时间
     */
    private Date interviewPrintEndTime;

    /**
     * 研究生学历生日开始日期
     */
    private Date postgraduateStartTime;

    /**
     * 研究生学历生日结束日期
     */
    private Date postgraduateEndTime;

    /**
     * 是否开启学历限制
     */
    private String isEducation;

    /**
     * 是否开启面试功能
     */
    private String isInterview;

    /**
     * 专科
     */
    private String specialist;

    /**
     * 本科
     */
    private String undergraduateCourse;

    /**
     * 研究生
     */
    private String postgraduate;

    /**
     * 博士
     */
    private String doctor;

    /**
     * 毕业生毕业院校性质
     */
    private String graduateNature;

    /**
     * 是否审核
     */
    private String isReview;

    /**
     * 面试考试须知
     */
    private String auditionNotice;

    /**
     * 准考证考试须知
     */
    private String examNotice;

    /**
     * 会员注册报名须知信息
     */
    private String registeredSet;

    /**
     * 考试科目与费用
     */
    private String subjectCostSet;

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
