package cn.ambuf.product.examination.examset.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 师承设置
 *
 * @author ShiTou
 * @date 2021/01/13 04:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ScSetParam extends BaseParam {

    /**
     * 主键ID
     */
    @ApiModelProperty("主键ID")
    @NotNull(message = "主键ID不能为空", groups = {edit.class})
    private Long id;

    /**
     * 考试ID
     */
    @ApiModelProperty("考试ID")
    @NotNull(message = "考试ID不能为空", groups = {add.class, edit.class})
    private Long examId;

    /**
     * 报名开始时间
     */
    @ApiModelProperty("报名开始时间")
    @NotNull(message = "报名开始时间不能为空", groups = {add.class, edit.class})
    private Date signStartTime;

    /**
     * 报名结束时间
     */
    @ApiModelProperty("报名结束时间")
    @NotNull(message = "报名结束时间不能为空", groups = {add.class, edit.class})
    private Date signEndTime;

    /**
     * 现场审核开始时间
     */
    @ApiModelProperty("现场审核开始时间")
    @NotNull(message = "现场审核开始时间不能为空", groups = {add.class, edit.class})
    private Date siteStartTime;

    /**
     * 现场审核结束时间
     */
    @ApiModelProperty("现场审核结束时间")
    @NotNull(message = "现场审核结束时间不能为空", groups = {add.class, edit.class})
    private Date siteEndTime;

    /**
     * 技能考试网上缴费开始时间
     */
    @ApiModelProperty("技能考试网上缴费开始时间")
    @NotNull(message = "技能考试网上缴费开始时间不能为空", groups = {add.class, edit.class})
    private Date skillPayStartTime;

    /**
     * 技能考试网上缴费结束时间
     */
    @ApiModelProperty("技能考试网上缴费结束时间")
    @NotNull(message = "技能考试网上缴费结束时间不能为空", groups = {add.class, edit.class})
    private Date skillPayEndTime;

    /**
     * 技能考试成绩单打印开始时间
     */
    @ApiModelProperty("技能考试成绩单打印开始时间")
    @NotNull(message = "技能考试成绩单打印开始时间不能为空", groups = {add.class, edit.class})
    private Date skillScoreStartTime;

    /**
     * 技能考试成绩单打印结束时间
     */
    @ApiModelProperty("技能考试成绩单打印结束时间")
    @NotNull(message = "技能考试成绩单打印结束时间不能为空", groups = {add.class, edit.class})
    private Date skillScoreEndTime;

    /**
     * 笔试网上缴费开始时间
     */
    @ApiModelProperty("笔试网上缴费开始时间")
    @NotNull(message = "笔试网上缴费开始时间不能为空", groups = {add.class, edit.class})
    private Date writtenPayStartTime;

    /**
     * 笔试网上缴费结束时间
     */
    @ApiModelProperty("笔试网上缴费结束时间")
    @NotNull(message = "笔试网上缴费结束时间不能为空", groups = {add.class, edit.class})
    private Date writtenPayEndTime;

    /**
     * 打印笔试成绩单开始时间
     */
    @ApiModelProperty("打印笔试成绩单开始时间")
    @NotNull(message = "打印笔试成绩单开始时间不能为空", groups = {add.class, edit.class})
    private Date printWrittenStartTime;

    /**
     * 打印笔试成绩单结束时间
     */
    @ApiModelProperty("打印笔试成绩单结束时间")
    @NotNull(message = "打印笔试成绩单结束时间不能为空", groups = {add.class, edit.class})
    private Date printWrittenEndTime;

    /**
     * 技能准考证打印开始时间
     */
    @ApiModelProperty("技能准考证打印开始时间")
    @NotNull(message = "技能准考证打印开始时间不能为空", groups = {add.class, edit.class})
    private Date skillAdmissionStartTime;

    /**
     * 技能准考证打印结束时间
     */
    @ApiModelProperty("技能准考证打印结束时间")
    @NotNull(message = "技能准考证打印结束时间不能为空", groups = {add.class, edit.class})
    private Date skillAdmissionEndTime;

    /**
     * 笔试准考证打印开始时间
     */
    @ApiModelProperty("笔试准考证打印开始时间")
    @NotNull(message = "笔试准考证打印开始时间不能为空", groups = {add.class, edit.class})
    private Date writtenAdmissionStartTime;

    /**
     * 笔试准考证打印结束时间
     */
    @ApiModelProperty("笔试准考证打印结束时间")
    @NotNull(message = "笔试准考证打印结束时间不能为空", groups = {add.class, edit.class})
    private Date writtenAdmissionEndTime;

    /**
     * 技能考试报名费用
     */
    @ApiModelProperty("技能考试报名费用")
    @NotNull(message = "技能考试报名费用不能为空", groups = {add.class, edit.class})
    private BigDecimal skillCost;

    /**
     * 笔试报名费用
     */
    @ApiModelProperty("笔试报名费用")
    @NotNull(message = "笔试报名费用不能为空", groups = {add.class, edit.class})
    private BigDecimal writtenCost;

    /**
     * 学位
     */
    @ApiModelProperty("学位")
    @NotNull(message = "学位不能为空", groups = {add.class, edit.class})
    private String academicDegree;

    /**
     * 学历
     */
    @ApiModelProperty("学历")
    @NotNull(message = "学历不能为空", groups = {add.class, edit.class})
    private String education;

    /**
     * 报名须知信息
     */
    @ApiModelProperty("报名须知信息")
    @NotNull(message = "报名须知信息不能为空", groups = {add.class, edit.class})
    private String signInfo;

    /**
     * 考场规则信息
     */
    @ApiModelProperty("考场规则信息")
    @NotNull(message = "考场规则信息不能为空", groups = {add.class, edit.class})
    private String examinationInfo;

    /**
     * 是否审核
     */
    @ApiModelProperty("是否审核")
    @NotNull(message = "是否审核不能为空", groups = {add.class, edit.class})
    private String isReview;

    private String newSorts;
}
