package cn.stylefeng.guns.modular.scadmission.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

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
    @Excel(name = "身份证号")
    private String idCard;

    /**
     * 报考序号
     */
    @Excel(name = "报考序号")
    @TableField("apply_number")
    private String applyNumber;

    /**
     * 考试时间
     */
    @Excel(name = "考试时间",databaseFormat = "yyyy-MM-dd HH:mm:ss", format = "yyyy-MM-dd HH:mm:ss")
    @TableField("exam_time")
    private Date examTime;

    /**
     * 签到时间
     */
    @Excel(name = "签到时间",databaseFormat = "HH:mm", format = "HH:mm")
    @TableField("sign_time")
    private String signTime;

    /**
     * 考场地址
     */
    @Excel(name = "考场地址")
    @TableField("examination_address")
    private String examinationAddress;

    /**
     * 签到地点
     */
    @Excel(name = "签到地点")
    @TableField("sign_address")
    private String signAddress;

    /**
     * 类型(SKILL_ADMISSION:技能准考证信息管理   SKILL_ADMISSION:综合笔试准考证信息管理)
     */
    @TableField("exam_type")
    private String examType;
}
