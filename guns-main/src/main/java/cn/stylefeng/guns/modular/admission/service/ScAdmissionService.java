package cn.stylefeng.guns.modular.admission.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.admission.entity.ScAdmission;
import cn.stylefeng.guns.modular.admission.entity.ScAdmissionTypeEnum;
import cn.stylefeng.guns.modular.admission.model.param.ScAdmissionParam;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 师承综合笔试准考证信息管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/12 23:31
 */
public interface ScAdmissionService extends IService<ScAdmission> {

    /**
     * 分页查询师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    PageResult<ScAdmission> page(ScAdmissionParam scAdmissionParam);

    /**
     * 查询所有师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    List<ScAdmission> list(ScAdmissionParam scAdmissionParam);

    /**
     * 添加师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    void add(ScAdmissionParam scAdmissionParam);

    /**
     * 删除师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    void delete(ScAdmissionParam scAdmissionParam);

    /**
     * 编辑师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    void edit(ScAdmissionParam scAdmissionParam);

    /**
     * 查看详情师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:31
     */
    ScAdmission detail(ScAdmissionParam scAdmissionParam);

    void export(Long[] id, ScAdmissionTypeEnum scAdmissionTypeEnum);

    void importExcel(MultipartFile file, ScAdmissionTypeEnum scAdmissionTypeEnum);
}