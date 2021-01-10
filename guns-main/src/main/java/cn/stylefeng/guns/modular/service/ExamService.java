package cn.stylefeng.guns.modular.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.entity.Exam;
import cn.stylefeng.guns.modular.model.param.ExamParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 考试 服务类
 *
 * @author shiTou
 * @date 2021/01/10 19:37
 */
public interface ExamService extends IService<Exam> {

    /**
     * 分页查询tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    PageResult<Exam> page(ExamParam examParam);

    /**
     * 查询所有tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    List<Exam> list(ExamParam examParam);

    /**
     * 添加tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    void add(ExamParam examParam);

    /**
     * 删除tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    void delete(Integer[] id);

    /**
     * 编辑tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    void edit(ExamParam examParam);

    /**
     * 查看详情tj_exam
     *
     * @author shiTou
     * @date 2021/01/10 19:37
     */
    Exam detail(ExamParam examParam);

}