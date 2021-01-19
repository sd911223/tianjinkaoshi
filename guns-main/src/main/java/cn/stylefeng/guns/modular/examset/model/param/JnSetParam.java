package cn.stylefeng.guns.modular.examset.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
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
public class JnSetParam extends BaseParam {

    /**
     * 主键ID
     */
    @ApiModelProperty("主键ID")
    private Long id;

    /**
     * 考试ID
     */
    @ApiModelProperty("考试ID")
    @NotNull(message = "考试ID不能为空", groups = {add.class, edit.class})
    private Long examId;

    /**
     * 考试名称
     */
    @ApiModelProperty("考试名称")
    @NotNull(message = "考试名称不能为空", groups = {add.class, edit.class})
    private String examName;
    /**
     * 图片ID
     */
    @ApiModelProperty("图片ID")
    private Long imgId;

    /**
     * 对应单位
     */
    @ApiModelProperty("对应单位")
    @NotNull(message = "对应单位不能为空", groups = {add.class, edit.class})
    private String correspondUnit;

    /**
     * 毕业生报名开始时间
     */
    @ApiModelProperty("毕业生报名开始时间")
    @NotNull(message = "毕业生报名开始时间不能为空", groups = {add.class, edit.class})
    private Date signStartTime;

    /**
     * 毕业生报名结束时间
     */
    @ApiModelProperty("毕业生报名结束时间")
    @NotNull(message = "毕业生报名结束时间不能为空", groups = {add.class, edit.class})
    private Date signEndTime;

    /**
     * 毕业生缴费开始时间
     */
    @ApiModelProperty("毕业生缴费开始时间")
    @NotNull(message = "毕业生缴费开始时间不能为空", groups = {add.class, edit.class})
    private Date payStartTime;

    /**
     * 毕业生缴费结束时间
     */
    @ApiModelProperty("毕业生缴费结束时间")
    @NotNull(message = "毕业生缴费结束时间不能为空", groups = {add.class, edit.class})
    private Date payEndTime;

    /**
     * 毕业生打印开始时间
     */
    @ApiModelProperty("毕业生打印开始时间")
    @NotNull(message = "毕业生打印开始时间不能为空", groups = {add.class, edit.class})
    private Date printStartTime;

    /**
     * 毕业生打印结束时间
     */
    @ApiModelProperty("毕业生打印结束时间")
    @NotNull(message = "毕业生打印结束时间不能为空", groups = {add.class, edit.class})
    private Date printEndTime;

    /**
     * 考试系统最终关闭时间
     */
    @ApiModelProperty("考试系统最终关闭时间")
    @NotNull(message = "考试系统最终关闭时间不能为空", groups = {add.class, edit.class})
    private Date closeTime;

    /**
     * 面试支付开启时间
     */
    @ApiModelProperty("面试支付开启时间")
    @NotNull(message = "面试支付开启时间不能为空", groups = {add.class, edit.class})
    private Date interviewPayStartTime;

    /**
     * 面试支付关闭时间
     */
    @ApiModelProperty("面试支付关闭时间")
    @NotNull(message = "面试支付关闭时间不能为空", groups = {add.class, edit.class})
    private Date interviewPayEndTime;

    /**
     * 普通学历生日开始日期
     */
    @ApiModelProperty("普通学历生日开始日期")
    @NotNull(message = "普通学历生日开始日期不能为空", groups = {add.class, edit.class})
    private Date educationStartTime;

    /**
     * 普通学历生日结束日期
     */
    @ApiModelProperty("普通学历生日结束日期")
    @NotNull(message = "普通学历生日结束日期不能为空", groups = {add.class, edit.class})
    private Date educationEndTime;

    /**
     * 面试考试费用
     */
    @ApiModelProperty("面试考试费用")
    @NotNull(message = "面试考试费用不能为空", groups = {add.class, edit.class})
    private BigDecimal interviewCost;

    /**
     * 单位会员上报开始时间
     */
    @ApiModelProperty("单位会员上报开始时间")
    @NotNull(message = "单位会员上报开始时间不能为空", groups = {add.class, edit.class})
    private Date reportStartTime;

    /**
     * 单位会员上报结束时间
     */
    @ApiModelProperty("单位会员上报结束时间")
    @NotNull(message = "单位会员上报结束时间不能为空", groups = {add.class, edit.class})
    private Date reportEndTime;

    /**
     * 面试准考证打印开启时间
     */
    @ApiModelProperty("面试准考证打印开启时间")
    @NotNull(message = "面试准考证打印开启时间不能为空", groups = {add.class, edit.class})
    private Date interviewPrintStartTime;

    /**
     * 面试准考证打印关闭时间
     */
    @ApiModelProperty("面试准考证打印关闭时间")
    @NotNull(message = "面试准考证打印关闭时间不能为空", groups = {add.class, edit.class})
    private Date interviewPrintEndTime;

    /**
     * 研究生学历生日开始日期
     */
    @ApiModelProperty("研究生学历生日开始日期")
    @NotNull(message = "研究生学历生日开始日期不能为空", groups = {add.class, edit.class})
    private Date postgraduateStartTime;

    /**
     * 研究生学历生日结束日期
     */
    @ApiModelProperty("研究生学历生日结束日期")
    @NotNull(message = "研究生学历生日结束日期不能为空", groups = {add.class, edit.class})
    private Date postgraduateEndTime;

    /**
     * 是否开启学历限制
     */
    @ApiModelProperty("是否开启学历限制")
    @NotNull(message = "是否开启学历限制不能为空", groups = {add.class, edit.class})
    private String isEducation;

    /**
     * 是否开启面试功能
     */
    @ApiModelProperty("是否开启面试功能")
    @NotNull(message = "是否开启面试功能不能为空", groups = {add.class, edit.class})
    private String isInterview;

    /**
     * 专科
     */
    @ApiModelProperty("专科")
    @NotNull(message = "专科不能为空", groups = {add.class, edit.class})
    private String specialist;

    /**
     * 本科
     */
    @ApiModelProperty("本科")
    @NotNull(message = "本科不能为空", groups = {add.class, edit.class})
    private String undergraduateCourse;

    /**
     * 研究生
     */
    @ApiModelProperty("研究生")
    @NotNull(message = "研究生不能为空", groups = {add.class, edit.class})
    private String postgraduate;

    /**
     * 博士
     */
    @ApiModelProperty("博士")
    @NotNull(message = "博士不能为空", groups = {add.class, edit.class})
    private String doctor;

    /**
     * 毕业生毕业院校性质
     */
    @ApiModelProperty("毕业生毕业院校性质")
    @NotNull(message = "毕业生毕业院校性质不能为空", groups = {add.class, edit.class})
    private String graduateNature;

    /**
     * 是否审核
     */
    @ApiModelProperty("是否审核")
    @NotNull(message = "是否审核不能为空", groups = {add.class, edit.class})
    private String isReview;

    /**
     * 面试考试须知
     */
    @ApiModelProperty("面试考试须知")
    @NotNull(message = "面试考试须知不能为空", groups = {add.class, edit.class})
    private String auditionNotice;

    /**
     * 准考证考试须知
     */
    @ApiModelProperty("准考证考试须知")
    @NotNull(message = "准考证考试须知不能为空", groups = {add.class, edit.class})
    private String examNotice;

    /**
     * 会员注册报名须知信息
     */
    @ApiModelProperty("会员注册报名须知信息")
    @NotNull(message = "会员注册报名须知信息不能为空", groups = {add.class, edit.class})
    private String registeredSet;

    /**
     * 考试科目与费用
     */
    @ApiModelProperty("考试科目与费用")
    @NotNull(message = "考试科目与费用不能为空", groups = {add.class, edit.class})
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
