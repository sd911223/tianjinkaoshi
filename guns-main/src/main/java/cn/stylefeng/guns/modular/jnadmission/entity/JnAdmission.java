package cn.stylefeng.guns.modular.jnadmission.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 专业技能准考证信息管理
 *
 * @author ShiTou
 * @date 2021/01/16 17:35
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_jn_admission")
public class JnAdmission extends BaseEntity {

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 身份证号
     */
    @Excel(name = "身份证号")
    @TableField("id_card")
    private String idCard;

    /**
     * 考场名称
     */
    @Excel(name = "考场名称")
    @TableField("examination_name")
    private String examinationName;

    /**
     * 考场号
     */
    @Excel(name = "考场号")
    @TableField("examination_number")
    private String examinationNumber;

    /**
     * 准考证号
     */
    @Excel(name = "准考证号")
    @TableField("admission_number")
    private String admissionNumber;

    /**
     * 座位号
     */
    @Excel(name = "座位号")
    @TableField("seat_number")
    private String seatNumber;

    /**
     * 考场地址
     */
    @Excel(name = "考场地址")
    @TableField("exam_address")
    private String examAddress;

    /**
     * 考试时间
     */
    @Excel(name = "考试时间",databaseFormat = "yyyy-MM-dd HH:mm:ss", format = "yyyy-MM-dd HH:mm:ss")
    @TableField("exam_time")
    private Date examTime;

    /**
     * 第二考场名称
     */
    @Excel(name = "第二考场名称")
    @TableField("examination_name_tow")
    private String examinationNameTow;

    /**
     * 准考证号二
     */
    @Excel(name = "准考证号二")
    @TableField("admission_number_tow")
    private String admissionNumberTow;

    /**
     * 考场号二
     */
    @Excel(name = "考场号二")
    @TableField("examination_number_tow")
    private String examinationNumberTow;

    /**
     * 座位号二
     */
    @Excel(name = "座位号二")
    @TableField("seat_number_tow")
    private String seatNumberTow;

    /**
     * 考场地址二
     */
    @Excel(name = "考场地址二")
    @TableField("exam_address_tow")
    private String examAddressTow;

    /**
     * 考试时间二
     */
    @Excel(name = "考试时间二",databaseFormat = "yyyy-MM-dd HH:mm:ss", format = "yyyy-MM-dd HH:mm:ss")
    @TableField("exam_time_tow")
    private String examTimeTow;

}
