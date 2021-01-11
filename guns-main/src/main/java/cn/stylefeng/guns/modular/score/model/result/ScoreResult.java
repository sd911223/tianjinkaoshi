package cn.stylefeng.guns.modular.score.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 考试成绩
 *
 * @author shiTou
 * @date 2021/01/11 17:27
 */
@Data
public class ScoreResult implements Serializable {

    /**
     * 主键ID
     */
    private Integer id;

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

}
