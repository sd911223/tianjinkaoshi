package cn.ambuf.product.examination.score.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 综合笔试成绩管理
 *
 * @author ShiTou
 * @date 2021/01/12 23:45
 */
@Data
public class ScScoreResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 考试结果
     */
    private String examResult;

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
    private Date createUser;

    /**
     * 修改人
     */
    private Date updateUser;

}
