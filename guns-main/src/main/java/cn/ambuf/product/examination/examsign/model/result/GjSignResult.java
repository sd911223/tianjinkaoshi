package cn.ambuf.product.examination.examsign.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 高级报名考试管理
 *
 * @author ShiTou
 * @date 2021/01/20 21:15
 */
@Data
public class GjSignResult implements Serializable {

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
     * 选择报名资格（字典）
     */
    private Integer selectSignQualifications;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 登陆密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别（字典）
     */
    private Integer sex;

    /**
     * 出生日期
     */
    private Date bornTime;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 头像code
     */
    private Long headPortraitCode;

    /**
     * 教育情况
     */
    private String educateInfo;

    /**
     * 主管局
     */
    private String supervisorBureau;

    /**
     * 工作单位
     */
    private String workUnit;

    /**
     * 所在科室
     */
    private String department;

    /**
     * 参加工作时间
     */
    private Date joinWorkTime;

    /**
     * 从事专业
     */
    private String specialty;

    /**
     * 专业工作年限
     */
    private Integer specialtyWorkTime;

    /**
     * 现任专业技术职务（职称）
     */
    private String specialtyPosition;

    /**
     * 聘任时间
     */
    private Date engageTime;

    /**
     * 聘任年限
     */
    private Integer engageYears;

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
