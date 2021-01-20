package cn.ambuf.product.examination.admission.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.ambuf.product.examination.admission.entity.Admission;

/**
 * 准考证管理 Mapper 接口
 *
 * @author shiTou
 * @date 2021/01/12 00:03
 */
public interface AdmissionMapper extends BaseMapper<Admission> {

    int deleteAdmissionByIds(Long[] id);
}