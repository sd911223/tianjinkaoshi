package cn.stylefeng.guns.modular.examset.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.examset.entity.JnSet;
import cn.stylefeng.guns.modular.examset.model.param.JnSetParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 技能设置 服务类
 *
 * @author ShiTou
 * @date 2021/01/13 14:15
 */
public interface JnSetService extends IService<JnSet> {

    /**
     * 分页查询技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    PageResult<JnSet> page(JnSetParam jnSetParam);

    /**
     * 查询所有技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    List<JnSet> list(JnSetParam jnSetParam);

    /**
     * 添加技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    void add(JnSetParam jnSetParam);

    /**
     * 删除技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    void delete(JnSetParam jnSetParam);

    /**
     * 编辑技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    void edit(JnSetParam jnSetParam);

    /**
     * 查看详情技能设置
     *
     * @author ShiTou
     * @date 2021/01/13 14:15
     */
    JnSet detail(JnSetParam jnSetParam);

}