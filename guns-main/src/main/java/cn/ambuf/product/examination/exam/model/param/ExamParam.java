package cn.ambuf.product.examination.exam.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 考试管理
 *
 * @author ShiTou
 * @date 2021/01/13 01:35
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExamParam extends BaseParam {

    /**
     * 主键ID
     */
    @NotNull(message = "主键ID不能为空",groups = {edit.class})
    private Long id;

    /**
     * 考试名称
     */
    @NotNull(message = "考试名称不能为空",groups = {add.class,edit.class})
    private String examName;

    /**
     * 考试类型(字典id)
     */
    @NotNull(message = "考试类型(字典id)不能为空",groups = {add.class,edit.class})
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
