package cn.stylefeng.guns.modular.model.result;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * tj_exam
 *
 * @author shiTou
 * @date 2021/01/10 19:37
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
     * 考试状态(字典id)
     */
    private String examStatus;

    /**
     * 删除标志（0代表存在 1代表删除）
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

}
