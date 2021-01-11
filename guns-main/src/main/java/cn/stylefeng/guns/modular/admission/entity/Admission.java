package cn.stylefeng.guns.modular.admission.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 准考证管理
 *
 * @author shiTou
 * @date 2021/01/12 00:03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_admission")
public class Admission extends BaseEntity {

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
     * 考场名称
     */
    @Excel(name = "考场名称")
    @TableField("examination_name")
    private String examinationName;

    /**
     * 准考号
     */
    @Excel(name = "准考号")
    @TableField("admission_number")
    private String admissionNumber;

    /**
     * 考场号
     */
    @Excel(name = "考场号")
    @TableField("examination_number")
    private String examinationNumber;

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
    @TableField("examination_address")
    private String examinationAddress;

    /**
     * 考试时间
     */
    @Excel(name = "考试时间")
    @TableField("exam_time")
    private Date examTime;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @TableField("del_flag")
    private String delFlag;

}
