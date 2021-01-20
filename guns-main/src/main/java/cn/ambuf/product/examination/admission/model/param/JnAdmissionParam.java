package cn.ambuf.product.examination.admission.model.param;

import cn.stylefeng.guns.core.pojo.base.param.BaseParam;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 专业技能准考证信息管理
 *
 * @author ShiTou
 * @date 2021/01/16 17:35
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class JnAdmissionParam extends BaseParam {

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
     * 考场号
     */
    @NotNull(message = "考场号不能为空",groups = {add.class,edit.class})
    private String examinationNumber;

    /**
     * 准考证号
     */
    @NotNull(message = "准考证号不能为空",groups = {add.class,edit.class})
    private String admissionNumber;

    /**
     * 座位号
     */
    @NotNull(message = "座位号不能为空",groups = {add.class,edit.class})
    private String seatNumber;

    /**
     * 考场地址
     */
    @NotNull(message = "考场地址不能为空",groups = {add.class,edit.class})
    private String examAddress;

    /**
     * 考试时间
     */
    @NotNull(message = "考试时间不能为空",groups = {add.class,edit.class})
    private Date examTime;

    /**
     * 第二考场名称
     */
    @NotNull(message = "第二考场名称不能为空",groups = {add.class,edit.class})
    private String examinationNameTow;

    /**
     * 准考证号二
     */
    @NotNull(message = "准考证号二不能为空",groups = {add.class,edit.class})
    private String admissionNumberTow;

    /**
     * 考场号二
     */
    @NotNull(message = "考场号二不能为空",groups = {add.class,edit.class})
    private String examinationNumberTow;

    /**
     * 座位号二
     */
    @NotNull(message = "座位号二不能为空",groups = {add.class,edit.class})
    private String seatNumberTow;

    /**
     * 考场地址二
     */
    @NotNull(message = "考场地址二不能为空",groups = {add.class,edit.class})
    private String examAddressTow;

    /**
     * 考试时间二
     */
    @NotNull(message = "考试时间二不能为空",groups = {add.class,edit.class})
    private Date examTimeTow;

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
