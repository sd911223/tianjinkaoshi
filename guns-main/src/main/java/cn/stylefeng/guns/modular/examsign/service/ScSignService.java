package cn.stylefeng.guns.modular.examsign.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.examsign.entity.ScSign;
import cn.stylefeng.guns.modular.examsign.model.param.ScSignParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 师承报名人员管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/16 16:19
 */
public interface ScSignService extends IService<ScSign> {

    /**
     * 分页查询师承报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/16 16:19
     */
    PageResult<ScSign> page(ScSignParam scSignParam);

    /**
     * 查询所有师承报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/16 16:19
     */
    List<ScSign> list(ScSignParam scSignParam);

    /**
     * 添加师承报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/16 16:19
     */
    void add(ScSignParam scSignParam);

    /**
     * 删除师承报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/16 16:19
     */
    void delete(ScSignParam scSignParam);

    /**
     * 编辑师承报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/16 16:19
     */
    void edit(ScSignParam scSignParam);

    /**
     * 查看详情师承报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/16 16:19
     */
    ScSign detail(ScSignParam scSignParam);

}