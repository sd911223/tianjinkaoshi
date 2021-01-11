package cn.stylefeng.guns.modular.admission.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 准考证管理
 *
 * @author shiTou
 * @date 2021/01/12 00:03
 */
@Data
public class AdmissionResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 考场名称
     */
    private String examinationName;

    /**
     * 准考号
     */
    private String admissionNumber;

    /**
     * 考场号
     */
    private String examinationNumber;

    /**
     * 座位号
     */
    private String seatNumber;

    /**
     * 考场地址
     */
    private String examinationAddress;

    /**
     * 考试时间
     */
    private Date examTime;

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

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

}
