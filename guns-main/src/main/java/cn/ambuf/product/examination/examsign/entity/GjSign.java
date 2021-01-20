package cn.ambuf.product.examination.examsign.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 高级报名考试管理
 *
 * @author ShiTou
 * @date 2021/01/20 21:15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_gj_sign")
public class GjSign extends BaseEntity {

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 考试ID
     */
    @TableField("exam_id")
    private Long examId;

    /**
     * 选择专业（字典）
     */
    @TableField("select_specialty")
    private Integer selectSpecialty;

    /**
     * 选择报名资格（字典）
     */
    @TableField("select_sign_qualifications")
    private Integer selectSignQualifications;

    /**
     * 身份证号
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 登陆密码
     */
    @TableField("password")
    private String password;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 性别（字典）
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 出生日期
     */
    @TableField("born_time")
    private Date bornTime;

    /**
     * 联系电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 头像code
     */
    @TableField("head_portrait_code")
    private Long headPortraitCode;

    /**
     * 教育情况
     */
    @TableField("educate_info")
    private String educateInfo;

    /**
     * 主管局
     */
    @TableField("supervisor_bureau")
    private String supervisorBureau;

    /**
     * 工作单位
     */
    @TableField("work_unit")
    private String workUnit;

    /**
     * 所在科室
     */
    @TableField("department")
    private String department;

    /**
     * 参加工作时间
     */
    @TableField("join_work_time")
    private Date joinWorkTime;

    /**
     * 从事专业
     */
    @TableField("specialty")
    private String specialty;

    /**
     * 专业工作年限
     */
    @TableField("specialty_work_time")
    private Integer specialtyWorkTime;

    /**
     * 现任专业技术职务（职称）
     */
    @TableField("specialty_position")
    private String specialtyPosition;

    /**
     * 聘任时间
     */
    @TableField("engage_time")
    private Date engageTime;

    /**
     * 聘任年限
     */
    @TableField("engage_years")
    private Integer engageYears;

    /**
     * 会员状态（0：正常，1：锁定）
     */
    @TableField("member_status")
    private Integer memberStatus;

    /**
     * 资料提交（0：未提交，1：已提交）
     */
    @TableField("data_submit_status")
    private Integer dataSubmitStatus;

    /**
     * 资料审核（0：未生效，1：生效，2：驳回）
     */
    @TableField("data_check_status")
    private Integer dataCheckStatus;

    /**
     * 驳回原因
     */
    @TableField("reject_reason")
    private String rejectReason;

    /**
     * 支付信息（0：未付，1：已付）
     */
    @TableField("pay_status")
    private Integer payStatus;

    /**
     * 订单号
     */
    @TableField("order_number")
    private String orderNumber;

    /**
     * 银行返回单号
     */
    @TableField("bank_order_number")
    private String bankOrderNumber;

    /**
     * 报名状态（0：草稿，1：正式）
     */
    @TableField("sign_status")
    private Integer signStatus;

}
