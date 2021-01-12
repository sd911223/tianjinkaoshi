package cn.stylefeng.guns.modular.examset.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.examset.entity.ExamSet;
import cn.stylefeng.guns.modular.examset.model.param.ExamSetParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 考试设置 服务类
 *
 * @author shiTou
 * @date 2021/01/12 22:20
 */
public interface ExamSetService extends IService<ExamSet> {

    /**
     * 分页查询考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    PageResult<ExamSet> page(ExamSetParam examSetParam);

    /**
     * 查询所有考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    List<ExamSet> list(ExamSetParam examSetParam);

    /**
     * 添加考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    void add(ExamSetParam examSetParam);

    /**
     * 删除考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    void delete(ExamSetParam examSetParam);

    /**
     * 编辑考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    void edit(ExamSetParam examSetParam);

    /**
     * 查看详情考试设置
     *
     * @author shiTou
     * @date 2021/01/12 22:20
     */
    ExamSet detail(ExamSetParam examSetParam);

}