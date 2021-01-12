package cn.stylefeng.guns.modular.scscore.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
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
    @TableField("id_card")
    private String idCard;

    /**
     * 考试结果
     */
    @TableField("exam_result")
    private String examResult;

}
