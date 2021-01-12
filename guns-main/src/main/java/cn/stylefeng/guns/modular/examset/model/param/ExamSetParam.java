package cn.stylefeng.guns.modular.examset.model.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 考试设置
 *
 * @author shiTou
 * @date 2021/01/12 22:20
 */
@Data
@ApiModel("考试设置请求对象")
public class ExamSetParam {

    /**
     * 主键ID
     */
    @ApiModelProperty("主键ID")
    @NotNull(message = "主键ID不能为空")
    private Long id;

    /**
     * 考试ID
     */
    @ApiModelProperty("考试ID")
    @NotNull(message = "考试ID不能为空")
    private Long examId;

    /**
     * 报名开始时间
     */
    @ApiModelProperty("报名开始时间")
    @NotNull(message = "报名开始时间不能为空")
    private Date signStartTime;

    /**
     * 报名结束时间
     */
    @ApiModelProperty("报名结束时间")
    @NotNull(message = "报名结束时间不能为空")
    private Date signEndTime;

    /**
     * 缴费开始时间
     */
    @ApiModelProperty("缴费开始时间")
    @NotNull(message = "缴费开始时间不能为空")
    private Date payStartTime;

    /**
     * 缴费结束时间
     */
    @ApiModelProperty("缴费结束时间")
    @NotNull(message = "缴费结束时间不能为空")
    private Date payEndTime;

    /**
     * 成绩打印开始时间
     */
    @ApiModelProperty("成绩打印开始时间")
    @NotNull(message = "成绩打印开始时间不能为空")
    private Date scoreStartTime;

    /**
     * 成绩打印结束时间
     */
    @ApiModelProperty("成绩打印结束时间")
    @NotNull(message = "成绩打印结束时间不能为空")
    private Date scoreEndTime;

    /**
     * 准考证打印开始时间
     */
    @ApiModelProperty("准考证打印开始时间")
    @NotNull(message = "准考证打印开始时间不能为空")
    private Date admissionStartTime;

    /**
     * 准考证打印结束时间
     */
    @ApiModelProperty("准考证打印结束时间")
    @NotNull(message = "准考证打印结束时间不能为空")
    private Date admissionEndTime;

    /**
     * 是否收费
     */
    @ApiModelProperty("是否收费")
    @NotNull(message = "是否收费不能为空")
    private String isPay;

    /**
     * 收费费用
     */
    @ApiModelProperty("收费费用,如果为收费,这个为必填")
    private BigDecimal signCost;

    /**
     * 收费说明
     */
    @ApiModelProperty("收费说明")
    @NotNull(message = "收费说明不能为空")
    private String payExplanation;

    /**
     * 报名专业
     */
    @ApiModelProperty("报名专业")
    @NotNull(message = "报名专业不能为空")
    private String signProfession;

    /**
     * 签名备注
     */
    @ApiModelProperty("签名备注")
    @NotNull(message = "签名备注不能为空")
    private String signProfessionRemark;

    /**
     * 报考资格
     */
    @ApiModelProperty("报考资格")
    @NotNull(message = "报考资格不能为空")
    private String signQualifications;

    /**
     * 报名须知信息设置
     */
    @ApiModelProperty("报名须知信息设置")
    @NotNull(message = "报名须知信息设置不能为空")
    private String signInfoSet;

    /**
     * 考场规则信息设置
     */
    @ApiModelProperty("考场规则信息设置")
    @NotNull(message = "考场规则信息设置不能为空")
    private String examinationInfoSet;

    /**
     * 是否审核
     */
    @ApiModelProperty("是否审核")
    @NotNull(message = "是否审核不能为空")
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

}
