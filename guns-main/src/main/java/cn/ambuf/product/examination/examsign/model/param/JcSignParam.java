package cn.ambuf.product.examination.examsign.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 基层报名管理
 *
 * @author ShiTou
 * @date 2021/01/20 23:45
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class JcSignParam extends BaseParam {

    /**
     * 主键ID
     */
    @ApiModelProperty("")
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
     * 报考科目
     */
    @ApiModelProperty("报考科目")
    @NotNull(message = "报考科目不能为空",groups = {add.class,edit.class})
    private String applySubject;

    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    @NotNull(message = "身份证号不能为空",groups = {add.class,edit.class})
    private String idCard;

    /**
     * 民族
     */
    @ApiModelProperty("民族")
    @NotNull(message = "民族不能为空",groups = {add.class,edit.class})
    private Integer ethnic;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    @NotNull(message = "姓名不能为空",groups = {add.class,edit.class})
    private String name;

    /**
     * 联系电话
     */
    @ApiModelProperty("联系电话")
    @NotNull(message = "联系电话不能为空",groups = {add.class,edit.class})
    private String phone;

    /**
     * 头像code
     */
    @ApiModelProperty("头像code")
    @NotNull(message = "头像code不能为空",groups = {add.class,edit.class})
    private Long avatarCode;

    /**
     * 最高学历
     */
    @ApiModelProperty("最高学历")
    @NotNull(message = "最高学历不能为空",groups = {add.class,edit.class})
    private Integer highestEducation;

    /**
     * 毕业时间
     */
    @ApiModelProperty("毕业时间")
    @NotNull(message = "毕业时间不能为空",groups = {add.class,edit.class})
    private Date graduateTime;

    /**
     * 学位
     */
    @ApiModelProperty("学位")
    @NotNull(message = "学位不能为空",groups = {add.class,edit.class})
    private Integer educational;

    /**
     * 	学制
     */
    @ApiModelProperty("学制")
    @NotNull(message = "	学制不能为空",groups = {add.class,edit.class})
    private Integer schoolSystem;

    /**
     * 毕业院校
     */
    @ApiModelProperty("毕业院校")
    @NotNull(message = "毕业院校不能为空",groups = {add.class,edit.class})
    private String graduateSchool;

    /**
     * 毕业专业
     */
    @ApiModelProperty("")
    @NotNull(message = "毕业专业不能为空",groups = {add.class,edit.class})
    private String graduateSpecialty;

    /**
     * 现有技术资格
     */
    @ApiModelProperty("现有技术资格")
    @NotNull(message = "现有技术资格不能为空",groups = {add.class,edit.class})
    private Integer skillQualifications;

    /**
     * 资格取得年限
     */
    @ApiModelProperty("资格取得年限")
    @NotNull(message = "资格取得年限不能为空",groups = {add.class,edit.class})
    private Integer qualificationsYears;

    /**
     * 聘任时间
     */
    @ApiModelProperty("聘任时间")
    @NotNull(message = "聘任时间不能为空",groups = {add.class,edit.class})
    private Date engageTime;

    /**
     * 聘任年限
     */
    @ApiModelProperty("聘任年限")
    @NotNull(message = "聘任年限不能为空",groups = {add.class,edit.class})
    private Integer engageYears;

    /**
     * 工作单位
     */
    @ApiModelProperty("工作单位")
    @NotNull(message = "工作单位不能为空",groups = {add.class,edit.class})
    private String workUnit;

    /**
     * 所属主管局
     */
    @ApiModelProperty("所属主管局")
    @NotNull(message = "所属主管局不能为空",groups = {add.class,edit.class})
    private String supervisorBureau;

    /**
     * 所在科室
     */
    @ApiModelProperty("所在科室")
    @NotNull(message = "所在科室不能为空",groups = {add.class,edit.class})
    private String department;

    /**
     * 工作年限
     */
    @ApiModelProperty("工作年限")
    @NotNull(message = "工作年限不能为空",groups = {add.class,edit.class})
    private Integer workTime;

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
    private String rejectReason;

    /**
     * 支付信息（0：未付，1：已付）
     */
    @ApiModelProperty("支付信息（0：未付，1：已付）")
    @NotNull(message = "支付信息（0：未付，1：已付）不能为空",groups = {edit.class})
    private Integer payStatus;

    /**
     * 订单号
     */
    @ApiModelProperty("订单号")
    @NotNull(message = "订单号不能为空",groups = {edit.class})
    private String orderNumber;

    /**
     * 银行返回单号
     */
    @ApiModelProperty("银行返回单号")
    @NotNull(message = "银行返回单号不能为空",groups = {edit.class})
    private String bankOrderNumber;

    /**
     * 报名状态（0：草稿，1：正式）
     */
    @ApiModelProperty("报名状态（0：草稿，1：正式）")
    @NotNull(message = "报名状态（0：草稿，1：正式）不能为空",groups = {edit.class})
    private Integer signStatus;

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
