package cn.stylefeng.guns.modular.admission.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 准考证管理
 *
 * @author shiTou
 * @date 2021/01/12 00:03
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdmissionParam extends BaseParam {

    /**
     * 主键ID
     */
    @NotNull(message = "主键ID不能为空",groups = {edit.class})
    private Long id;

    /**
     * 身份证号
     */
    @NotNull(message = "身份证号不能为空",groups = {add.class,edit.class})
    private String idCard;

    /**
     * 考场名称
     */
    @NotNull(message = "考场名称不能为空",groups = {add.class,edit.class})
    private String examinationName;

    /**
     * 准考号
     */
    @NotNull(message = "准考号不能为空",groups = {add.class,edit.class})
    private String admissionNumber;

    /**
     * 考场号
     */
    @NotNull(message = "考场号不能为空",groups = {add.class,edit.class})
    private String examinationNumber;

    /**
     * 座位号
     */
    @NotNull(message = "座位号不能为空",groups = {add.class,edit.class})
    private String seatNumber;

    /**
     * 考场地址
     */
    @NotNull(message = "考场地址不能为空",groups = {add.class,edit.class})
    private String examinationAddress;

    /**
     * 考试时间
     */
    @NotNull(message = "考试时间不能为空",groups = {add.class,edit.class})
    private Date examTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 更新人
     */
    private Long updateUser;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @NotNull(message = "删除标志（0代表存在 2代表删除）不能为空",groups = {add.class,edit.class})
    private String delFlag;

}
