package cn.stylefeng.guns.modular.score.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 考试成绩
 *
 * @author shiTou
 * @date 2021/01/11 17:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_score")
public class Score extends BaseEntity {

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
     * 准考证号
     */
    @TableField("admission_number")
    @Excel(name = "准考证号")
    private String admissionNumber;

    /**
     * 分数
     */
    @Excel(name = "分数")
    @TableField("fraction")
    private String fraction;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @TableField("del_flag")
    private String delFlag;
    /**
     * 所属考试
     */
    @TableField("belonging_exam")
    private Long belongingExam;
}
