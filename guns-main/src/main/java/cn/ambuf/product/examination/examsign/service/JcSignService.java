package cn.ambuf.product.examination.examsign.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.examsign.entity.JcSign;
import cn.ambuf.product.examination.examsign.model.param.JcSignParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 基层报名管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/20 23:45
 */
public interface JcSignService extends IService<JcSign> {

    /**
     * 分页查询基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    PageResult<JcSign> page(JcSignParam jcSignParam);

    /**
     * 查询所有基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    List<JcSign> list(JcSignParam jcSignParam);

    /**
     * 添加基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    void add(JcSignParam jcSignParam);

    /**
     * 删除基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    void delete(JcSignParam jcSignParam);

    /**
     * 编辑基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    void edit(JcSignParam jcSignParam);

    /**
     * 查看详情基层报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 23:45
     */
    JcSign detail(JcSignParam jcSignParam);

}