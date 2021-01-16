package cn.stylefeng.guns.modular.scsign.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 师承报名人员管理
 *
 * @author ShiTou
 * @date 2021/01/16 16:19
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
     * 头像地址
     */
    @ApiModelProperty("头像地址")
    @NotNull(message = "头像地址不能为空", groups = {add.class, edit.class})
    private String avatarImg;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    @NotNull(message = "姓名不能为空", groups = {add.class, edit.class})
    private String name;

    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    @NotNull(message = "身份证号不能为空", groups = {add.class, edit.class})
    private String idCard;

    /**
     * 性别
     */
    @ApiModelProperty("性别")
    @NotNull(message = "性别不能为空", groups = {add.class, edit.class})
    private String sex;

    /**
     * 户籍地
     */
    @ApiModelProperty("户籍地")
    @NotNull(message = "户籍地不能为空", groups = {add.class, edit.class})
    private String domicile;

    /**
     * 政治面貌
     */
    @ApiModelProperty("政治面貌")
    @NotNull(message = "政治面貌不能为空", groups = {add.class, edit.class})
    private String politicalStatus;

    /**
     * 健康状况
     */
    @ApiModelProperty("健康状况")
    @NotNull(message = "健康状况不能为空", groups = {add.class, edit.class})
    private String healthStatus;

    /**
     * 民族
     */
    @ApiModelProperty("民族")
    @NotNull(message = "民族不能为空", groups = {add.class, edit.class})
    private String ethnic;

    /**
     * 生源地
     */
    @ApiModelProperty("生源地")
    @NotNull(message = "生源地不能为空", groups = {add.class, edit.class})
    private String birthplace;

    /**
     * 婚姻状况
     */
    @ApiModelProperty("婚姻状况")
    @NotNull(message = "婚姻状况不能为空", groups = {add.class, edit.class})
    private String marriageStatus;

    /**
     * 联系地址
     */
    @ApiModelProperty("联系地址")
    @NotNull(message = "联系地址不能为空", groups = {add.class, edit.class})
    private String contactAddress;

    /**
     * 身高
     */
    @ApiModelProperty("身高")
    @NotNull(message = "身高不能为空", groups = {add.class, edit.class})
    private String height;

    /**
     * 出生日期
     */
    @ApiModelProperty("出生日期")
    @NotNull(message = "出生日期不能为空", groups = {add.class, edit.class})
    private Date bornTime;

    /**
     * 最低单眼裸视视力
     */
    @ApiModelProperty("最低单眼裸视视力")
    @NotNull(message = "最低单眼裸视视力不能为空", groups = {add.class, edit.class})
    private String vision;

    /**
     * 邮编
     */
    @ApiModelProperty("邮编")
    @NotNull(message = "邮编不能为空", groups = {add.class, edit.class})
    private String postcode;

    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    @NotNull(message = "手机号不能为空", groups = {add.class, edit.class})
    private String phone;

    /**
     * 联系电话
     */
    @ApiModelProperty("联系电话")
    @NotNull(message = "联系电话不能为空", groups = {add.class, edit.class})
    private String landline;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    @NotNull(message = "邮箱不能为空", groups = {add.class, edit.class})
    private String mailbox;

    /**
     * 毕业院校
     */
    @ApiModelProperty("毕业院校")
    @NotNull(message = "毕业院校不能为空", groups = {add.class, edit.class})
    private String graduationSchool;

    /**
     * 所学专业
     */
    @ApiModelProperty("所学专业")
    @NotNull(message = "所学专业不能为空", groups = {add.class, edit.class})
    private String vocational;

    /**
     * 毕业时间
     */
    @ApiModelProperty("毕业时间")
    @NotNull(message = "毕业时间不能为空", groups = {add.class, edit.class})
    private Date graduationTime;

    /**
     * 外语水平及分数
     */
    @ApiModelProperty("外语水平及分数")
    @NotNull(message = "外语水平及分数不能为空", groups = {add.class, edit.class})
    private String foreignFraction;

    /**
     * 学历
     */
    @ApiModelProperty("学历")
    @NotNull(message = "学历不能为空", groups = {add.class, edit.class})
    private String education;

    /**
     * 学位
     */
    @ApiModelProperty("学位")
    @NotNull(message = "学位不能为空", groups = {add.class, edit.class})
    private String degree;

    /**
     * 学制
     */
    @ApiModelProperty("学制")
    @NotNull(message = "学制不能为空", groups = {add.class, edit.class})
    private String schoolSystem;

    /**
     * 学历类型
     */
    @ApiModelProperty("学历类型")
    @NotNull(message = "学历类型不能为空", groups = {add.class, edit.class})
    private String learnType;

    /**
     * 计算机水平
     */
    @ApiModelProperty("计算机水平")
    @NotNull(message = "计算机水平不能为空", groups = {add.class, edit.class})
    private String computer;

    /**
     * 是否取得执业职格
     */
    @ApiModelProperty("是否取得执业职格")
    @NotNull(message = "是否取得执业职格不能为空", groups = {add.class, edit.class})
    private String isProfessionQualifications;

    /**
     * 工作单位
     */
    @ApiModelProperty("工作单位")
    @NotNull(message = "工作单位不能为空", groups = {add.class, edit.class})
    private String workUnit;

    /**
     * 参加工作时间
     */
    @ApiModelProperty("参加工作时间")
    @NotNull(message = "参加工作时间不能为空", groups = {add.class, edit.class})
    private Date joinWorkTime;

    /**
     * 现有职称
     */
    @ApiModelProperty("现有职称")
    @NotNull(message = "现有职称不能为空", groups = {add.class, edit.class})
    private String jobTitle;

    /**
     * 是否具备岗位要求的工作经历
     */
    @ApiModelProperty("是否具备岗位要求的工作经历")
    @NotNull(message = "是否具备岗位要求的工作经历不能为空", groups = {add.class, edit.class})
    private String workExperience;

    /**
     * 学习简历
     */
    @ApiModelProperty("学习简历")
    @NotNull(message = "学习简历不能为空", groups = {add.class, edit.class})
    private String learningResume;

    /**
     * 获取证书情况
     */
    @ApiModelProperty("获取证书情况")
    @NotNull(message = "获取证书情况不能为空", groups = {add.class, edit.class})
    private String certificateInfo;

    /**
     * 工作简历
     */
    @ApiModelProperty("工作简历")
    @NotNull(message = "工作简历不能为空", groups = {add.class, edit.class})
    private String workResume;

    /**
     * 意向招聘单位
     */
    @ApiModelProperty("意向招聘单位")
    @NotNull(message = "意向招聘单位不能为空", groups = {add.class, edit.class})
    private String advertiseJobOffers;

    /**
     * 是否通过
     */
    @ApiModelProperty("是否通过")
    @NotNull(message = "是否通过不能为空", groups = {add.class, edit.class})
    private String isPass;

    /**
     * 驳回理由
     */
    @ApiModelProperty("驳回理由")
    @NotNull(message = "驳回理由不能为空", groups = {add.class, edit.class})
    private String rejectReason;

    /**
     * 面试缴费
     */
    @ApiModelProperty("面试缴费")
    @NotNull(message = "面试缴费不能为空", groups = {add.class, edit.class})
    private String interviewPay;

    /**
     * 技能缴费
     */
    @ApiModelProperty("技能缴费")
    @NotNull(message = "技能缴费不能为空", groups = {add.class, edit.class})
    private String skillPay;
    /**
     * 笔试缴费
     */
    @ApiModelProperty("笔试缴费")
    @NotNull(message = "笔试缴费不能为空", groups = {add.class, edit.class})
    private String writtenPay;
    /**
     * 资料提交
     */
    @ApiModelProperty("资料提交(0 未提交 1 已提交)")
    private String isDataStatus;
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
