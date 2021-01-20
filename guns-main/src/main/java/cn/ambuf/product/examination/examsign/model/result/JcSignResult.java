package cn.ambuf.product.examination.examsign.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 基层报名管理
 *
 * @author ShiTou
 * @date 2021/01/20 23:45
 */
@Data
public class JcSignResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 考试ID
     */
    private Long examId;

    /**
     * 选择专业（字典）
     */
    private Integer selectSpecialty;

    /**
     * 选择报考级别(字典)
     */
    private Integer selectApplyLevel;

    /**
     * 报考科目
     */
    private String applySubject;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 民族
     */
    private Integer ethnic;

    /**
     * 姓名
     */
    private String name;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 头像code
     */
    private Long avatarCode;

    /**
     * 最高学历
     */
    private Integer highestEducation;

    /**
     * 毕业时间
     */
    private Date graduateTime;

    /**
     * 学位
     */
    private Integer educational;

    /**
     * 	学制
     */
    private Integer schoolSystem;

    /**
     * 毕业院校
     */
    private String graduateSchool;

    /**
     * 毕业专业
     */
    private String graduateSpecialty;

    /**
     * 现有技术资格
     */
    private Integer skillQualifications;

    /**
     * 资格取得年限
     */
    private Integer qualificationsYears;

    /**
     * 聘任时间
     */
    private Date engageTime;

    /**
     * 聘任年限
     */
    private Integer engageYears;

    /**
     * 工作单位
     */
    private String workUnit;

    /**
     * 所属主管局
     */
    private String supervisorBureau;

    /**
     * 所在科室
     */
    private String department;

    /**
     * 工作年限
     */
    private Integer workTime;

    /**
     * 会员状态（0：正常，1：锁定）
     */
    private Integer memberStatus;

    /**
     * 资料提交（0：未提交，1：已提交）
     */
    private Integer dataSubmitStatus;

    /**
     * 资料审核（0：未生效，1：生效，2：驳回）
     */
    private Integer dataCheckStatus;

    /**
     * 驳回原因
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
