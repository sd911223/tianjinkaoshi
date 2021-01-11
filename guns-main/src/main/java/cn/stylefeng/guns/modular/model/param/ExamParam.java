package cn.stylefeng.guns.modular.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * tj_exam
 *
 * @author shiTou
 * @date 2021/01/10 19:37
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExamParam extends BaseParam {

    /**
     * 主键ID
     */
    @NotNull(message = "主键ID不能为空", groups = {edit.class})
    private Integer id;

    /**
     * 考试名称
     */
    @NotNull(message = "考试名称不能为空", groups = {add.class, edit.class})
    private String examName;

    /**
     * 考试类型(字典id)
     */
    @NotNull(message = "考试类型(字典id)不能为空", groups = {add.class, edit.class})
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
