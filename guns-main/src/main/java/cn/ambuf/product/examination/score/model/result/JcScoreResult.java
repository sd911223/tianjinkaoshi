package cn.ambuf.product.examination.score.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 基础考试成绩
 *
 * @author shiTou
 * @date 2021/01/12 22:59
 */
@Data
public class JcScoreResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 准考证
     */
    private String admissionNumber;

    /**
     * 分数
     */
    private String fraction;

    /**
     * 状态
     */
    private String scoreStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 修改人
     */
    private Long updateUser;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 所属考试
     */
    private Long belongingExam;

}
