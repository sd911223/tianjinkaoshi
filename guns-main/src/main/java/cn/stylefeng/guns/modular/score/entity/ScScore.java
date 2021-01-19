package cn.stylefeng.guns.modular.score.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 综合笔试成绩管理
 *
 * @author ShiTou
 * @date 2021/01/12 23:45
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_sc_score")
public class ScScore extends BaseEntity {

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
     * 考试结果
     */
    @TableField("exam_result")
    @Excel(name = "考试结果")
    private String examResult;
    /**
     * 类型(SKILL_ADMISSION:技能准考证信息管理   SKILL_ADMISSION:综合笔试准考证信息管理)
     */
    @TableField("exam_type")
    private String examType;
}
