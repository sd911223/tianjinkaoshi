package cn.ambuf.product.examination.admission.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.admission.entity.Admission;
import cn.ambuf.product.examination.admission.model.param.AdmissionParam;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 准考证管理 服务类
 *
 * @author shiTou
 * @date 2021/01/12 00:03
 */
public interface AdmissionService extends IService<Admission> {

    /**
     * 分页查询准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    PageResult<Admission> page(AdmissionParam admissionParam);

    /**
     * 查询所有准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    List<Admission> list(AdmissionParam admissionParam);

    /**
     * 添加准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    void add(AdmissionParam admissionParam);

    /**
     * 删除准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    void delete(Long[] id);

    /**
     * 编辑准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    void edit(AdmissionParam admissionParam);

    /**
     * 查看详情准考证管理
     *
     * @author shiTou
     * @date 2021/01/12 00:03
     */
    Admission detail(AdmissionParam admissionParam);

    void export(Long[] id);

    void importExcel(MultipartFile file,Long examId);
}