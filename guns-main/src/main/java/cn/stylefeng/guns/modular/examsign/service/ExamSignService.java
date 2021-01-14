package cn.stylefeng.guns.modular.examsign.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.examsign.entity.ExamSign;
import cn.stylefeng.guns.modular.examsign.model.param.ExamSignParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 报名人员管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/14 22:39
 */
public interface ExamSignService extends IService<ExamSign> {

    /**
     * 分页查询报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    PageResult<ExamSign> page(ExamSignParam examSignParam);

    /**
     * 查询所有报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    List<ExamSign> list(ExamSignParam examSignParam);

    /**
     * 添加报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    void add(ExamSignParam examSignParam);

    /**
     * 删除报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    void delete(ExamSignParam examSignParam);

    /**
     * 编辑报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    void edit(ExamSignParam examSignParam);

    /**
     * 查看详情报名人员管理
     *
     * @author ShiTou
     * @date 2021/01/14 22:39
     */
    ExamSign detail(ExamSignParam examSignParam);

}