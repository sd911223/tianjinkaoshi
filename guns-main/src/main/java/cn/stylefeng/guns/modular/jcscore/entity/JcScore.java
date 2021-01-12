package cn.stylefeng.guns.modular.jcscore.entity;

import cn.stylefeng.guns.core.pojo.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 基础考试成绩
 *
 * @author shiTou
 * @date 2021/01/12 22:59
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tj_jc_score")
public class JcScore extends BaseEntity {

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
     * 准考证
     */
    @TableField("admission_number")
    private String admissionNumber;

    /**
     * 分数
     */
    @TableField("fraction")
    private String fraction;

    /**
     * 状态
     */
    @TableField("score_status")
    private String scoreStatus;


}
