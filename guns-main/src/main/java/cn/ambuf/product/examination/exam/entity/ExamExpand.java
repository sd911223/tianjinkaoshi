package cn.ambuf.product.examination.exam.entity;

import lombok.Data;

@Data
public class ExamExpand {
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

    private String examTypeName;

    /**
     * 考试状态
     */
    private String examStatus;

    private String examStatusName;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;
}
