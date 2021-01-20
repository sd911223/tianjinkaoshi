package cn.ambuf.product.examination.exam.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 考试管理
 *
 * @author ShiTou
 * @date 2021/01/13 01:35
 */
@Data
public class ExamResult implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 考试名称
     */
    private String examName;

    /**
     * 考试类型(字典id)
     */
    private String examType;

    /**
     * 考试状态
     */
    private String examStatus;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

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

}
