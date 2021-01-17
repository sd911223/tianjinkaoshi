package cn.stylefeng.guns.modular.jnscore.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 专业技能成绩管理
 *
 * @author ShiTou
 * @date 2021/01/17 18:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_jn_score")
public class JnScore extends BaseEntity {

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 身份证
     */
    @Excel(name = "身份证")
    @TableField("id_card")
    private String idCard;

    /**
     * 准考号
     */
    @Excel(name = "准考号")
    @TableField("examination_number")
    private String examinationNumber;

    /**
     * 科目一成绩
     */
    @Excel(name = "科目一成绩")
    @TableField("one_score")
    private String oneScore;

    /**
     * 科目二成绩
     */
    @Excel(name = "科目二成绩")
    @TableField("tow_score")
    private String towScore;

}
