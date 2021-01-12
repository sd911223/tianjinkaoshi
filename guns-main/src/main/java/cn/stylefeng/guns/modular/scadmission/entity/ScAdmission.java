package cn.stylefeng.guns.modular.scadmission.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 师承综合笔试准考证信息管理
 *
 * @author ShiTou
 * @date 2021/01/12 23:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_sc_admission")
public class ScAdmission extends BaseEntity {

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 身份证号
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 报考序号
     */
    @TableField("apply_number")
    private String applyNumber;

    /**
     * 考试时间
     */
    @TableField("exam_time")
    private Date examTime;

    /**
     * 签到时间
     */
    @TableField("sign_time")
    private Date signTime;

    /**
     * 考场地址
     */
    @TableField("examination_address")
    private String examinationAddress;

    /**
     * 签到地点
     */
    @TableField("sign_address")
    private String signAddress;

}
