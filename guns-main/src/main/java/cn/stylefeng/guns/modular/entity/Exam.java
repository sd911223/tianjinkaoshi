package cn.stylefeng.guns.modular.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * tj_exam
 *
 * @author shiTou
 * @date 2021/01/10 19:37
 */
@Data
@TableName("tj_exam")
public class Exam {

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
     * 考试状态(字典id)
     */
    @TableField("exam_status")
    private String examStatus;

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @TableField("del_flag")
    private String delFlag;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

}
