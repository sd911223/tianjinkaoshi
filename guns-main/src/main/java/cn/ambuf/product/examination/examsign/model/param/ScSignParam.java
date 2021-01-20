package cn.ambuf.product.examination.examsign.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 师承报名管理
 *
 * @author ShiTou
 * @date 2021/01/20 22:47
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ScSignParam extends BaseParam {

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
     * 姓名
     */
    @ApiModelProperty("姓名")
    @NotNull(message = "姓名不能为空", groups = {add.class, edit.class})
    private String name;

    /**
     * 性别(字典 1:男,2:女)
     */
    @ApiModelProperty("性别(字典 1:男,2:女)")
    @NotNull(message = "性别(字典 1:男,2:女)不能为空", groups = {add.class, edit.class})
    private Integer sex;

    /**
     * 出生日期
     */
    @ApiModelProperty("出生日期")
    @NotNull(message = "出生日期不能为空", groups = {add.class, edit.class})
    private Date bornTime;

    /**
     * 出生地址
     */
    @ApiModelProperty("出生地址")
    @NotNull(message = "出生地址不能为空", groups = {add.class, edit.class})
    private String bornAddress;

    /**
     * 籍贯
     */
    @ApiModelProperty("籍贯")
    @NotNull(message = "籍贯不能为空", groups = {add.class, edit.class})
    private String hometown;

    /**
     * 民族
     */
    @ApiModelProperty("民族")
    @NotNull(message = "民族不能为空", groups = {add.class, edit.class})
    private Integer ethnic;

    /**
     * 头像code
     */
    @ApiModelProperty("头像code")
    @NotNull(message = "头像code不能为空", groups = {add.class, edit.class})
    private Long avatarCode;

    /**
     * 联系电话
     */
    @ApiModelProperty("联系电话")
    @NotNull(message = "联系电话不能为空", groups = {add.class, edit.class})
    private String phone;

    /**
     * 电子邮箱
     */
    @ApiModelProperty("电子邮箱")
    @NotNull(message = "电子邮箱不能为空", groups = {add.class, edit.class})
    private String mailbox;

    /**
     * 最高学历(字典)
     */
    @ApiModelProperty("最高学历(字典)")
    @NotNull(message = "最高学历(字典)不能为空", groups = {add.class, edit.class})
    private Integer highestEducation;

    /**
     * 获取学位(字典)
     */
    @ApiModelProperty("获取学位(字典)")
    @NotNull(message = "获取学位(字典)不能为空", groups = {add.class, edit.class})
    private Integer obtainEducational;

    /**
     * 参加工作时间
     */
    @ApiModelProperty("参加工作时间")
    @NotNull(message = "参加工作时间不能为空", groups = {add.class, edit.class})
    private Date joinWorkTime;

    /**
     * 现主要从事职业
     */
    @ApiModelProperty("现主要从事职业")
    @NotNull(message = "现主要从事职业不能为空", groups = {add.class, edit.class})
    private String engageProfession;

    /**
     * 单位名称
     */
    @ApiModelProperty("单位名称")
    @NotNull(message = "单位名称不能为空", groups = {add.class, edit.class})
    private String unitName;

    /**
     * 邮编
     */
    @ApiModelProperty("邮编")
    @NotNull(message = "邮编不能为空", groups = {add.class, edit.class})
    private String postcode;

    /**
     * 通信地址
     */
    @ApiModelProperty("通信地址")
    @NotNull(message = "通信地址不能为空", groups = {add.class, edit.class})
    private String communicateAddress;

    /**
     * 本人档案存放单位
     */
    @ApiModelProperty("本人档案存放单位")
    @NotNull(message = "本人档案存放单位不能为空", groups = {add.class, edit.class})
    private String fileStore;

    /**
     * 存放单位邮编
     */
    @ApiModelProperty("存放单位邮编")
    @NotNull(message = "存放单位邮编不能为空", groups = {add.class, edit.class})
    private String storePostcode;

    /**
     * 存放单位通信地址
     */
    @ApiModelProperty("存放单位通信地址")
    @NotNull(message = "存放单位通信地址不能为空", groups = {add.class, edit.class})
    private String storeCommunicateAddress;

    /**
     * 指导老师姓名
     */
    @ApiModelProperty("指导老师姓名")
    @NotNull(message = "指导老师姓名不能为空", groups = {add.class, edit.class})
    private String guideTeacherName;

    /**
     * 指导老师职称
     */
    @ApiModelProperty("指导老师职称")
    @NotNull(message = "指导老师职称不能为空", groups = {add.class, edit.class})
    private String guideTeacherAppellation;

    /**
     * 指导老师电话
     */
    @ApiModelProperty("指导老师电话")
    @NotNull(message = "指导老师电话不能为空", groups = {add.class, edit.class})
    private String guideTeacherPhone;

    /**
     * 指导老师工作年限(字典)
     */
    @ApiModelProperty("指导老师工作年限(字典)")
    @NotNull(message = "指导老师工作年限(字典)不能为空", groups = {add.class, edit.class})
    private Integer guideTeacherYears;

    /**
     * 指导老师单位
     */
    @ApiModelProperty("指导老师单位")
    @NotNull(message = "指导老师单位不能为空", groups = {add.class, edit.class})
    private String guideTeacherUnit;

    /**
     * 指导老师通信地址
     */
    @ApiModelProperty("指导老师通信地址")
    @NotNull(message = "指导老师通信地址不能为空", groups = {add.class, edit.class})
    private String guideTeacherAddress;

    /**
     * 指导老师主要学术
     */
    @ApiModelProperty("指导老师主要学术")
    @NotNull(message = "指导老师主要学术不能为空", groups = {add.class, edit.class})
    private String guideTeacherSpeciality;

    /**
     * 个人简历信息
     */
    @ApiModelProperty("个人简历信息")
    @NotNull(message = "个人简历信息不能为空", groups = {add.class, edit.class})
    private String personalResume;

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
     * 资料审核（0：未生效，1：现场审核驳回，2：现场审核生效,3:笔试审核驳回,4:笔试审核通过）
     */
    @ApiModelProperty("资料审核（0：未生效，1：现场审核驳回，2：现场审核生效,3:笔试审核驳回,4:笔试审核通过）")
    @NotNull(message = "资料审核（0：未生效，1：现场审核驳回，2：现场审核生效,3:笔试审核驳回,4:笔试审核通过）不能为空", groups = {edit.class})
    private Integer dataCheckStatus;

    /**
     * 现场驳回原因
     */
    @ApiModelProperty("现场驳回原因")
    @NotNull(message = "现场驳回原因不能为空", groups = {edit.class})
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
    @NotNull(message = "订单号不能为空", groups = {edit.class})
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
    @NotNull(message = "报名状态（0：草稿，1：正式）不能为空", groups = {edit.class})
    private Integer signStatus;

    /**
     * 发布时间
     */
    @ApiModelProperty("发布时间")
    @NotNull(message = "发布时间不能为空", groups = {add.class, edit.class})
    private Date releaseTime;

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
