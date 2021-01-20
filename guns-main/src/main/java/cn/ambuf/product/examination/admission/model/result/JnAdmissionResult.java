package cn.ambuf.product.examination.admission.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 专业技能准考证信息管理
 *
 * @author ShiTou
 * @date 2021/01/16 17:35
 */
@Data
public class JnAdmissionResult implements Serializable {

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
     * 考场号
     */
    private String examinationNumber;

    /**
     * 准考证号
     */
    private String admissionNumber;

    /**
     * 座位号
     */
    private String seatNumber;

    /**
     * 考场地址
     */
    private String examAddress;

    /**
     * 考试时间
     */
    private Date examTime;

    /**
     * 第二考场名称
     */
    private String examinationNameTow;

    /**
     * 准考证号二
     */
    private String admissionNumberTow;

    /**
     * 考场号二
     */
    private String examinationNumberTow;

    /**
     * 座位号二
     */
    private String seatNumberTow;

    /**
     * 考场地址二
     */
    private String examAddressTow;

    /**
     * 考试时间二
     */
    private String examTimeTow;

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
