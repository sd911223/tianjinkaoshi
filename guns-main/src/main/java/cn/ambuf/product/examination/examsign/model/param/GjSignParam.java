package cn.ambuf.product.examination.examsign.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 高级报名考试管理
 *
 * @author ShiTou
 * @date 2021/01/20 21:15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GjSignParam extends BaseParam {

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
     * 选择专业（字典）
     */
    @ApiModelProperty("选择专业（字典）")
    @NotNull(message = "选择专业（字典）不能为空", groups = {add.class, edit.class})
    private Integer selectSpecialty;

    /**
     * 选择报名资格（字典）
     */
    @ApiModelProperty("选择报名资格（字典）")
    @NotNull(message = "选择报名资格（字典）不能为空", groups = {add.class, edit.class})
    private Integer selectSignQualifications;

    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    @NotNull(message = "身份证号不能为空", groups = {add.class, edit.class})
    private String idCard;

    /**
     * 登陆密码
     */
    @ApiModelProperty("登陆密码")
    @NotNull(message = "登陆密码不能为空", groups = {add.class, edit.class})
    private String password;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    @NotNull(message = "姓名不能为空", groups = {add.class, edit.class})
    private String name;

    /**
     * 性别（字典）
     */
    @ApiModelProperty("性别（字典）")
    @NotNull(message = "性别（字典）不能为空", groups = {add.class, edit.class})
    private Integer sex;

    /**
     * 出生日期
     */
    @ApiModelProperty("出生日期")
    @NotNull(message = "出生日期不能为空", groups = {add.class, edit.class})
    private Date bornTime;

    /**
     * 联系电话
     */
    @ApiModelProperty("联系电话")
    @NotNull(message = "联系电话不能为空", groups = {add.class, edit.class})
    private String phone;

    /**
     * 头像code
     */
    @ApiModelProperty("头像code")
    @NotNull(message = "头像code不能为空", groups = {add.class, edit.class})
    private Long headPortraitCode;

    /**
     * 教育情况
     */
    @ApiModelProperty("教育情况")
    @NotNull(message = "教育情况不能为空", groups = {add.class, edit.class})
    private String educateInfo;

    /**
     * 主管局
     */
    @ApiModelProperty("主管局")
    @NotNull(message = "主管局不能为空", groups = {add.class, edit.class})
    private String supervisorBureau;

    /**
     * 工作单位
     */
    @ApiModelProperty("工作单位")
    @NotNull(message = "工作单位不能为空", groups = {add.class, edit.class})
    private String workUnit;

    /**
     * 所在科室
     */
    @ApiModelProperty("所在科室")
    @NotNull(message = "所在科室不能为空", groups = {add.class, edit.class})
    private String department;

    /**
     * 参加工作时间
     */
    @ApiModelProperty("参加工作时间")
    @NotNull(message = "参加工作时间不能为空", groups = {add.class, edit.class})
    private Date joinWorkTime;

    /**
     * 从事专业
     */
    @ApiModelProperty("从事专业")
    @NotNull(message = "从事专业不能为空", groups = {add.class, edit.class})
    private String specialty;

    /**
     * 专业工作年限
     */
    @ApiModelProperty("专业工作年限")
    @NotNull(message = "专业工作年限不能为空", groups = {add.class, edit.class})
    private Integer specialtyWorkTime;

    /**
     * 现任专业技术职务（职称）
     */
    @ApiModelProperty("现任专业技术职务（职称）")
    @NotNull(message = "现任专业技术职务（职称）不能为空", groups = {add.class, edit.class})
    private String specialtyPosition;

    /**
     * 聘任时间
     */
    @ApiModelProperty("聘任时间")
    @NotNull(message = "聘任时间不能为空", groups = {add.class, edit.class})
    private Date engageTime;

    /**
     * 聘任年限
     */
    @ApiModelProperty("聘任年限")
    @NotNull(message = "聘任年限不能为空", groups = {add.class, edit.class})
    private Integer engageYears;

    /**
     * 会员状态（0：正常，1：锁定）
     */
    @ApiModelProperty("会员状态（0：正常，1：锁定）")
    @NotNull(message = "会员状态（0：正常，1：锁定）不能为空", groups = {edit.class})
    private Integer memberStatus;

    /**
     * 资料提交（0：未提交，1：已提交）
     */
    @ApiModelProperty("资料提交（0：未提交，1：已提交）")
    @NotNull(message = "资料提交（0：未提交，1：已提交）不能为空", groups = {edit.class})
    private Integer dataSubmitStatus;

    /**
     * 资料审核（0：未生效，1：生效，2：驳回）
     */
    @ApiModelProperty("资料审核（0：未生效，1：生效，2：驳回）")
    @NotNull(message = "资料审核（0：未生效，1：生效，2：驳回）不能为空", groups = {edit.class})
    private Integer dataCheckStatus;

    /**
     * 驳回原因
     */
    @ApiModelProperty("驳回原因")
    @NotNull(message = "驳回原因不能为空", groups = {edit.class})
    private String rejectReason;

    /**
     * 支付信息（0：未付，1：已付）
     */
    @ApiModelProperty("支付信息（0：未付，1：已付）")
    @NotNull(message = "支付信息（0：未付，1：已付）不能为空", groups = {edit.class})
    private Integer payStatus;

    /**
     * 订单号
     */
    @ApiModelProperty("订单号")
    @NotNull(message = "订单号不能为空", groups = {add.class, edit.class})
    private String orderNumber;

    /**
     * 银行返回单号
     */
    @ApiModelProperty("银行返回单号")
    @NotNull(message = "银行返回单号不能为空", groups = {edit.class})
    private String bankOrderNumber;

    /**
     * 报名状态（0：草稿，1：正式）
     */
    @ApiModelProperty("报名状态（0：草稿，1：正式）")
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
