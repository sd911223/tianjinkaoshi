package cn.stylefeng.guns.modular.examsign.model.param;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.stylefeng.guns.core.pojo.base.param.BaseParam;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 报名人员管理
 *
 * @author ShiTou
 * @date 2021/01/14 22:39
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExamSignParam extends BaseParam {

    /**
     * 主键
     */
    @NotNull(message = "主键不能为空",groups = {edit.class})
    private Long id;

    /**
     * 姓名
     */
    @Excel(name = "姓名")
    @NotNull(message = "姓名不能为空",groups = {add.class,edit.class})
    private String name;

    /**
     * 身份证号
     */
    @Excel(name = "身份证号")
    @NotNull(message = "身份证号不能为空",groups = {add.class,edit.class})
    private String idCard;

    /**
     * 是否面试
     */
    @Excel(name = "面试资格")
    @NotNull(message = "是否面试不能为空",groups = {add.class,edit.class})
    private String isInterview;

    /**
     * 资料审核
     */
    @Excel(name = "资料审核")
    @NotNull(message = "资料审核不能为空",groups = {add.class,edit.class})
    private String dataReview;

    /**
     * 资料状态
     */
    @Excel(name = "资料状态")
    @NotNull(message = "资料状态不能为空",groups = {add.class,edit.class})
    private String dataStatus;

    /**
     * 支付状态
     */
    @Excel(name = "支付状态")
    @NotNull(message = "支付状态不能为空",groups = {add.class,edit.class})
    private String payStatus;

    /**
     * 银行单号
     */
    @Excel(name = "银行单号")
    @NotNull(message = "银行单号不能为空",groups = {add.class,edit.class})
    private String bankNumber;

    /**
     * 报名支付单号
     */
    @NotNull(message = "报名支付单号不能为空",groups = {add.class,edit.class})
    private String signPayNumber;

    /**
     * 专业
     */
    @NotNull(message = "专业不能为空",groups = {add.class,edit.class})
    private String profession;

    /**
     * 报考资格
     */
    @NotNull(message = "报考资格不能为空",groups = {add.class,edit.class})
    private String applyQualifications;

    /**
     * 性别
     */
    @NotNull(message = "性别不能为空",groups = {add.class,edit.class})
    private String sex;

    /**
     * 头像地址
     */
    @NotNull(message = "头像地址不能为空",groups = {add.class,edit.class})
    private String avatarUrl;

    /**
     * 登陆密码
     */
    @NotNull(message = "登陆密码不能为空",groups = {add.class,edit.class})
    private String loginPassword;

    /**
     * 手机号
     */
    @NotNull(message = "手机号不能为空",groups = {add.class,edit.class})
    private String phone;

    /**
     * 出生日期
     */
    @NotNull(message = "出生日期不能为空",groups = {add.class,edit.class})
    private Date dateOfBirth;

    /**
     * 教育情况
     */
    @NotNull(message = "教育情况不能为空",groups = {add.class,edit.class})
    private String educationInfo;

    /**
     * 主管局
     */
    @NotNull(message = "主管局不能为空",groups = {add.class,edit.class})
    private String office;

    /**
     * 工作单位
     */
    @NotNull(message = "工作单位不能为空",groups = {add.class,edit.class})
    private String workUnit;

    /**
     * 所在科室
     */
    @NotNull(message = "所在科室不能为空",groups = {add.class,edit.class})
    private String department;

    /**
     * 参加工作时间
     */
    @NotNull(message = "参加工作时间不能为空",groups = {add.class,edit.class})
    private Date workTime;

    /**
     * 从事专业
     */
    @NotNull(message = "从事专业不能为空",groups = {add.class,edit.class})
    private String engageSpecialty;

    /**
     * 专业工作年限
     */
    @NotNull(message = "专业工作年限不能为空",groups = {add.class,edit.class})
    private Integer workYears;

    /**
     * 聘任时间
     */
    @NotNull(message = "聘任时间不能为空",groups = {add.class,edit.class})
    private Date engageTime;

    /**
     * 现任专业技术职务（职称）
     */
    @NotNull(message = "现任专业技术职务（职称）不能为空",groups = {add.class,edit.class})
    private String skillPost;

    /**
     * 聘任年限
     */
    @NotNull(message = "聘任年限不能为空",groups = {add.class,edit.class})
    private Integer engageYears;

    /**
     * 会员状态
     */
    @NotNull(message = "会员状态不能为空",groups = {add.class,edit.class})
    private String memberStatus;

    /**
     * 资料提交
     */
    @NotNull(message = "资料提交不能为空",groups = {add.class,edit.class})
    private String isDataStatus;

    /**
     * 资料审核
     */
    @NotNull(message = "资料审核不能为空",groups = {add.class,edit.class})
    private String isReviewStatus;

    /**
     * 驳回原因
     */
    @NotNull(message = "驳回原因不能为空",groups = {add.class,edit.class})
    private String reject;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @NotNull(message = "删除标志（0代表存在 2代表删除）不能为空",groups = {add.class,edit.class})
    private String delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 更新人
     */
    private Long updateUser;

}
