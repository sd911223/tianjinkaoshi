package cn.stylefeng.guns.modular.examsign.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 报名人员管理
 *
 * @author ShiTou
 * @date 2021/01/14 22:39
 */
@Data
public class ExamSignResult implements Serializable {

    /**
     * 主键
     */
    private Long id;
    /**
     * 报考人员ID
     */
    private Long userId;
    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 是否面试
     */
    private String isInterview;

    /**
     * 资料审核
     */
    private String dataReview;

    /**
     * 资料状态
     */
    private String dataStatus;

    /**
     * 支付状态
     */
    private String payStatus;

    /**
     * 银行单号
     */
    private String bankNumber;

    /**
     * 报名支付单号
     */
    private String signPayNumber;

    /**
     * 专业
     */
    private String profession;

    /**
     * 报考资格
     */
    private String applyQualifications;

    /**
     * 性别
     */
    private String sex;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 登陆密码
     */
    private String loginPassword;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 出生日期
     */
    private Date dateOfBirth;

    /**
     * 教育情况
     */
    private String educationInfo;

    /**
     * 主管局
     */
    private String office;

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
    private Date workTime;

    /**
     * 从事专业
     */
    private String engageSpecialty;

    /**
     * 专业工作年限
     */
    private Integer workYears;

    /**
     * 聘任时间
     */
    private Date engageTime;

    /**
     * 现任专业技术职务（职称）
     */
    private String skillPost;

    /**
     * 聘任年限
     */
    private Integer engageYears;

    /**
     * 会员状态
     */
    private String memberStatus;

    /**
     * 资料提交
     */
    private String isDataStatus;

    /**
     * 资料审核
     */
    private String isReviewStatus;

    /**
     * 驳回原因
     */
    private String reject;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
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
