package cn.ambuf.product.examination.examsign.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.examsign.entity.GjSign;
import cn.ambuf.product.examination.examsign.model.param.GjSignParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 高级报名考试管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/20 21:15
 */
public interface GjSignService extends IService<GjSign> {

    /**
     * 分页查询高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    PageResult<GjSign> page(GjSignParam gjSignParam);

    /**
     * 查询所有高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    List<GjSign> list(GjSignParam gjSignParam);

    /**
     * 添加高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    void add(GjSignParam gjSignParam);

    /**
     * 删除高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    void delete(GjSignParam gjSignParam);

    /**
     * 编辑高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    void edit(GjSignParam gjSignParam);

    /**
     * 查看详情高级报名考试管理
     *
     * @author ShiTou
     * @date 2021/01/20 21:15
     */
    GjSign detail(GjSignParam gjSignParam);

}