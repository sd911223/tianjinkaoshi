package cn.stylefeng.guns.modular.admission.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.admission.entity.JnAdmission;
import cn.stylefeng.guns.modular.admission.model.param.JnAdmissionParam;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 专业技能准考证信息管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/16 17:35
 */
public interface JnAdmissionService extends IService<JnAdmission> {

    /**
     * 分页查询专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    PageResult<JnAdmission> page(JnAdmissionParam jnAdmissionParam);

    /**
     * 查询所有专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    List<JnAdmission> list(JnAdmissionParam jnAdmissionParam);

    /**
     * 添加专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    void add(JnAdmissionParam jnAdmissionParam);

    /**
     * 删除专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    void delete(JnAdmissionParam jnAdmissionParam);

    /**
     * 编辑专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    void edit(JnAdmissionParam jnAdmissionParam);

    /**
     * 查看详情专业技能准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/16 17:35
     */
    JnAdmission detail(JnAdmissionParam jnAdmissionParam);

    void export(Long[] id);

    void importExcel(MultipartFile file);
}