package cn.stylefeng.guns.modular.examset.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.examset.entity.ScSet;
import cn.stylefeng.guns.modular.examset.model.param.ScSetParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 师承设置 服务类
 *
 * @author ShiTou
 * @date 2021/01/13 04:10
 */
public interface ScSetService extends IService<ScSet> {

    /**
     * 分页查询师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    PageResult<ScSet> page(ScSetParam scSetParam);

    /**
     * 查询所有师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    List<ScSet> list(ScSetParam scSetParam);

    /**
     * 添加师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    void add(ScSetParam scSetParam);

    /**
     * 删除师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    void delete(ScSetParam scSetParam);

    /**
     * 编辑师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    void edit(ScSetParam scSetParam);

    /**
     * 查看详情师承设置
     *
     * @author ShiTou
     * @date 2021/01/13 04:10
     */
    ScSet detail(ScSetParam scSetParam);

}