package cn.ambuf.product.examination.score.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 专业技能成绩管理
 *
 * @author ShiTou
 * @date 2021/01/17 18:10
 */
@Data
public class JnScoreResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 准考号
     */
    private String examinationNumber;

    /**
     * 科目一成绩
     */
    private String oneScore;

    /**
     * 科目二成绩
     */
    private String towScore;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * update_time
     */
    private Date updateTime;

    /**
     * create_user
     */
    private Long createUser;

    /**
     * update_user
     */
    private Long updateUser;

}
