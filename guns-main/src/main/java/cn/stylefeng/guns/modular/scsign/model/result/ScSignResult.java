package cn.stylefeng.guns.modular.scsign.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 师承报名人员管理
 *
 * @author ShiTou
 * @date 2021/01/16 16:19
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
     * 头像地址
     */
    private String avatarImg;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 性别
     */
    private String sex;

    /**
     * 户籍地
     */
    private String domicile;

    /**
     * 政治面貌
     */
    private String politicalStatus;

    /**
     * 健康状况
     */
    private String healthStatus;

    /**
     * 民族
     */
    private String ethnic;

    /**
     * 生源地
     */
    private String birthplace;

    /**
     * 婚姻状况
     */
    private String marriageStatus;

    /**
     * 联系地址
     */
    private String contactAddress;

    /**
     * 身高
     */
    private String height;

    /**
     * 出生日期
     */
    private Date bornTime;

    /**
     * 最低单眼裸视视力
     */
    private String vision;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 联系电话
     */
    private String landline;

    /**
     * 邮箱
     */
    private String mailbox;

    /**
     * 毕业院校
     */
    private String graduationSchool;

    /**
     * 所学专业
     */
    private String vocational;

    /**
     * 毕业时间
     */
    private Date graduationTime;

    /**
     * 外语水平及分数
     */
    private String foreignFraction;

    /**
     * 学历
     */
    private String education;

    /**
     * 学位
     */
    private String degree;

    /**
     * 学制
     */
    private String schoolSystem;

    /**
     * 学历类型
     */
    private String learnType;

    /**
     * 计算机水平
     */
    private String computer;

    /**
     * 是否取得执业职格
     */
    private String isProfessionQualifications;

    /**
     * 工作单位
     */
    private String workUnit;

    /**
     * 参加工作时间
     */
    private Date joinWorkTime;

    /**
     * 现有职称
     */
    private String jobTitle;

    /**
     * 是否具备岗位要求的工作经历
     */
    private String workExperience;

    /**
     * 学习简历
     */
    private String learningResume;

    /**
     * 获取证书情况
     */
    private String certificateInfo;

    /**
     * 工作简历
     */
    private String workResume;

    /**
     * 意向招聘单位
     */
    private String advertiseJobOffers;

    /**
     * 是否通过
     */
    private String isPass;

    /**
     * 驳回理由
     */
    private String rejectReason;

    /**
     * 面试缴费
     */
    private String interviewPay;

    /**
     * 笔试缴费
     */
    private String writtenPay;

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
