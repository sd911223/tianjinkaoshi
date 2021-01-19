package cn.stylefeng.guns.modular.examset.model.result;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 考试设置
 *
 * @author shiTou
 * @date 2021/01/12 22:20
 */
@Data
public class ExamSetResult implements Serializable {

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
     * 缴费开始时间
     */
    private Date payStartTime;

    /**
     * 缴费结束时间
     */
    private Date payEndTime;

    /**
     * 成绩打印开始时间
     */
    private Date scoreStartTime;

    /**
     * 成绩打印结束时间
     */
    private Date scoreEndTime;

    /**
     * 准考证打印开始时间
     */
    private Date admissionStartTime;

    /**
     * 准考证打印结束时间
     */
    private Date admissionEndTime;

    /**
     * 是否收费
     */
    private String isPay;

    /**
     * 收费费用
     */
    private BigDecimal signCost;

    /**
     * 收费说明
     */
    private String payExplanation;

    /**
     * 报名专业
     */
    private String signProfession;

    /**
     * 签名备注
     */
    private String signProfessionRemark;

    /**
     * 报考资格
     */
    private String signQualifications;

    /**
     * 报名须知信息设置
     */
    private String signInfoSet;

    /**
     * 考场规则信息设置
     */
    private String examinationInfoSet;

    /**
     * 是否审核
     */
    private String isReview;

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
    private Date createUser;

    /**
     * 修改人
     */
    private Date updateUser;

    private String newSorts;
}
