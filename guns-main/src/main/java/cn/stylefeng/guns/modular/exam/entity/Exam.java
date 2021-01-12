package cn.stylefeng.guns.modular.exam.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 考试管理
 *
 * @author ShiTou
 * @date 2021/01/13 01:35
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_exam")
public class Exam extends BaseEntity {

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 考试名称
     */
    @TableField("exam_name")
    private String examName;

    /**
     * 考试类型(字典id)
     */
    @TableField("exam_type")
    private String examType;

    /**
     * 考试状态
     */
    @TableField("exam_status")
    private String examStatus;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @TableField("del_flag")
    private String delFlag;

}
