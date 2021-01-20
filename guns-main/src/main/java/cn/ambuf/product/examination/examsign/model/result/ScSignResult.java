package cn.ambuf.product.examination.examsign.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 师承报名管理
 *
 * @author ShiTou
 * @date 2021/01/20 22:47
 */
@Data
public class ScSignResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 考试ID
     */
    private Long examId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别(字典 1:男,2:女)
     */
    private Integer sex;

    /**
     * 出生日期
     */
    private Date bornTime;

    /**
     * 出生地址
     */
    private String bornAddress;

    /**
     * 籍贯
     */
    private String hometown;

    /**
     * 民族
     */
    private Integer ethnic;

    /**
     * 头像code
     */
    private Long avatarCode;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 电子邮箱
     */
    private String mailbox;

    /**
     * 最高学历(字典)
     */
    private Integer highestEducation;

    /**
     * 获取学位(字典)
     */
    private Integer obtainEducational;

    /**
     * 参加工作时间
     */
    private Date joinWorkTime;

    /**
     * 现主要从事职业
     */
    private String engageProfession;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 通信地址
     */
    private String communicateAddress;

    /**
     * 本人档案存放单位
     */
    private String fileStore;

    /**
     * 存放单位邮编
     */
    private String storePostcode;

    /**
     * 存放单位通信地址
     */
    private String storeCommunicateAddress;

    /**
     * 指导老师姓名
     */
    private String guideTeacherName;

    /**
     * 指导老师职称
     */
    private String guideTeacherAppellation;

    /**
     * 指导老师电话
     */
    private String guideTeacherPhone;

    /**
     * 指导老师工作年限(字典)
     */
    private Integer guideTeacherYears;

    /**
     * 指导老师单位
     */
    private String guideTeacherUnit;

    /**
     * 指导老师通信地址
     */
    private String guideTeacherAddress;

    /**
     * 指导老师主要学术
     */
    private String guideTeacherSpeciality;

    /**
     * 个人简历信息
     */
    private String personalResume;

    /**
     * 会员状态（0：正常，1：锁定）
     */
    private Integer memberStatus;

    /**
     * 资料提交（0：未提交，1：已提交）
     */
    private Integer dataSubmitStatus;

    /**
     * 资料审核（0：未生效，1：现场审核驳回，2：现场审核生效,3:笔试审核驳回,4:笔试审核通过）
     */
    private Integer dataCheckStatus;

    /**
     * 现场驳回原因
     */
    private String rejectReason;

    /**
     * 支付信息（0：未付，1：已付）
     */
    private Integer payStatus;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 银行返回单号
     */
    private String bankOrderNumber;

    /**
     * 报名状态（0：草稿，1：正式）
     */
    private Integer signStatus;

    /**
     * 发布时间
     */
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
