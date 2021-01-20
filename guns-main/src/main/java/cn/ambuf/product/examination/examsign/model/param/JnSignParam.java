package cn.ambuf.product.examination.examsign.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 专业技术报名人员管理
 *
 * @author ShiTou
 * @date 2021/01/20 21:48
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class JnSignParam extends BaseParam {

    /**
     * 主键ID
     */
    @ApiModelProperty("主键ID")
    @NotNull(message = "主键ID不能为空",groups = {edit.class})
    private Long id;

    /**
     * 考试ID
     */
    @ApiModelProperty("考试ID")
    @NotNull(message = "考试ID不能为空",groups = {add.class,edit.class})
    private Long examId;

    /**
     * 选择专业（字典）
     */
    @ApiModelProperty("选择专业（字典）")
    @NotNull(message = "选择专业（字典）不能为空",groups = {add.class,edit.class})
    private Integer selectSpecialty;

    /**
     * 选择报考级别(字典)
     */
    @ApiModelProperty("选择报考级别(字典)")
    @NotNull(message = "选择报考级别(字典)不能为空",groups = {add.class,edit.class})
    private Integer selectApplyLevel;

    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    @NotNull(message = "身份证号不能为空",groups = {add.class,edit.class})
    private String idCard;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    @NotNull(message = "姓名不能为空",groups = {add.class,edit.class})
    private String name;

    /**
     * 头像code
     */
    @ApiModelProperty("头像code")
    @NotNull(message = "头像code不能为空",groups = {add.class,edit.class})
    private Long avatarCode;

    /**
     * 联系电话
     */
    @ApiModelProperty("联系电话")
    @NotNull(message = "联系电话不能为空",groups = {add.class,edit.class})
    private String phone;

    /**
     * 民族
     */
    @ApiModelProperty("民族")
    @NotNull(message = "民族不能为空",groups = {add.class,edit.class})
    private String ethnic;

    /**
     * 最高学历(字典)
     */
    @ApiModelProperty("最高学历(字典)")
    @NotNull(message = "最高学历(字典)不能为空",groups = {add.class,edit.class})
    private Integer highestEducation;

    /**
     * 毕业时间
     */
    @ApiModelProperty("毕业时间")
    @NotNull(message = "毕业时间不能为空",groups = {add.class,edit.class})
    private Date graduateTime;

    /**
     * 毕业院校
     */
    @ApiModelProperty("毕业院校")
    @NotNull(message = "毕业院校不能为空",groups = {add.class,edit.class})
    private String graduateSchool;

    /**
     * 毕业专业
     */
    @ApiModelProperty("毕业专业")
    @NotNull(message = "毕业专业不能为空",groups = {add.class,edit.class})
    private String graduateSpecialty;

    /**
     * 现有资格(字典)
     */
    @ApiModelProperty("现有资格(字典)")
    @NotNull(message = "现有资格(字典)不能为空",groups = {add.class,edit.class})
    private Integer existingQualifications;

    /**
     * 取得资格年限
     */
    @ApiModelProperty("取得资格年限")
    @NotNull(message = "取得资格年限不能为空",groups = {add.class,edit.class})
    private Integer qualificationsYears;

    /**
     * 工作单位
     */
    @ApiModelProperty("工作单位")
    @NotNull(message = "工作单位不能为空",groups = {add.class,edit.class})
    private String workUnit;

    /**
     * 工作年限
     */
    @ApiModelProperty("工作年限")
    @NotNull(message = "工作年限不能为空",groups = {add.class,edit.class})
    private Integer workYears;

    /**
     * 主管区、县、局（总公司）
     */
    @ApiModelProperty("主管区、县、局（总公司）")
    @NotNull(message = "主管区、县、局（总公司）不能为空",groups = {add.class,edit.class})
    private String headOffice;

    /**
     * 是否征订考试大纲
     */
    @ApiModelProperty("是否征订考试大纲")
    @NotNull(message = "是否征订考试大纲不能为空",groups = {edit.class})
    private Integer isOutline;

    /**
     * 会员状态（0：正常，1：锁定）
     */
    @ApiModelProperty("会员状态（0：正常，1：锁定）")
    @NotNull(message = "会员状态（0：正常，1：锁定）不能为空",groups = {edit.class})
    private Integer memberStatus;

    /**
     * 资料提交（0：未提交，1：已提交）
     */
    @ApiModelProperty("资料提交（0：未提交，1：已提交）")
    @NotNull(message = "资料提交（0：未提交，1：已提交）不能为空",groups = {edit.class})
    private Integer dataSubmitStatus;

    /**
     * 资料审核（0：未生效，1：生效，2：驳回）
     */
    @ApiModelProperty("资料审核（0：未生效，1：生效，2：驳回）")
    @NotNull(message = "资料审核（0：未生效，1：生效，2：驳回）不能为空",groups = {edit.class})
    private Integer dataCheckStatus;

    /**
     * 驳回原因
     */
    @ApiModelProperty("驳回原因")
    @NotNull(message = "驳回原因不能为空",groups = {edit.class})
    private String rejectReason;

    /**
     * 支付信息（0：未付，1：已付）
     */
    @ApiModelProperty("支付信息（0：未付，1：已付）")
    @NotNull(message = "支付信息（0：未付，1：已付）不能为空",groups = {edit.class})
    private String payStatus;

    /**
     * 订单号
     */
    @ApiModelProperty("订单号不能为空")
    @NotNull(message = "订单号不能为空",groups = {add.class,edit.class})
    private String orderNumber;

    /**
     * 银行返回单号
     */
    @ApiModelProperty("银行返回单号")
    @NotNull(message = "银行返回单号不能为空",groups = {add.class,edit.class})
    private String bankOrderNumber;

    /**
     * 报名状态（0：草稿，1：正式）
     */
    @ApiModelProperty("报名状态（0：草稿，1：正式）")
    @NotNull(message = "报名状态（0：草稿，1：正式）不能为空",groups = {edit.class})
    private String signStatus;

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
