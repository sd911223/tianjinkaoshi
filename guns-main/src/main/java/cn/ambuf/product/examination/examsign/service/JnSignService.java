package cn.ambuf.product.examination.examsign.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.examsign.entity.JnSign;
import cn.ambuf.product.examination.examsign.model.param.JnSignParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 专业技术报名人员管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/20 21:48
 */
public interface JnSignService extends IService<JnSign> {

    /**
     * 分页查询专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    PageResult<JnSign> page(JnSignParam jnSignParam);

    /**
     * 查询所有专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    List<JnSign> list(JnSignParam jnSignParam);

    /**
     * 添加专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    void add(JnSignParam jnSignParam);

    /**
     * 删除专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    void delete(JnSignParam jnSignParam);

    /**
     * 编辑专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    void edit(JnSignParam jnSignParam);

    /**
     * 查看详情专业技术报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:48
     */
    JnSign detail(JnSignParam jnSignParam);

}