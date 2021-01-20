package cn.ambuf.product.examination.examsign.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.examsign.entity.ScSign;
import cn.ambuf.product.examination.examsign.model.param.ScSignParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 师承报名管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/20 22:47
 */
public interface ScSignService extends IService<ScSign> {

    /**
     * 分页查询师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    PageResult<ScSign> page(ScSignParam scSignParam);

    /**
     * 查询所有师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    List<ScSign> list(ScSignParam scSignParam);

    /**
     * 添加师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    void add(ScSignParam scSignParam);

    /**
     * 删除师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    void delete(ScSignParam scSignParam);

    /**
     * 编辑师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    void edit(ScSignParam scSignParam);

    /**
     * 查看详情师承报名管理
     *
     * @author ShiTou
     * @date 2021/01/20 22:47
     */
    ScSign detail(ScSignParam scSignParam);

}