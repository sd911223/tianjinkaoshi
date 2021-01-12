package cn.stylefeng.guns.modular.scadmission.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 师承综合笔试准考证信息管理
 *
 * @author ShiTou
 * @date 2021/01/12 23:31
 */
@Data
public class ScAdmissionResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 报考序号
     */
    private String applyNumber;

    /**
     * 考试时间
     */
    private Date examTime;

    /**
     * 签到时间
     */
    private Date signTime;

    /**
     * 考场地址
     */
    private String examinationAddress;

    /**
     * 签到地点
     */
    private String signAddress;

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
