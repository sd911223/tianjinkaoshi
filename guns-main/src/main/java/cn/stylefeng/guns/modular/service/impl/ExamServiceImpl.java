package cn.stylefeng.guns.modular.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.entity.Exam;
import cn.stylefeng.guns.modular.enums.ExamExceptionEnum;
import cn.stylefeng.guns.modular.mapper.ExamMapper;
import cn.stylefeng.guns.modular.model.param.ExamParam;
import cn.stylefeng.guns.modular.service.ExamService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * tj_exam 服务实现类
 *
 * @author shiTou
 * @date 2021/01/10 19:37
 */
@Service
public class ExamServiceImpl extends ServiceImpl<ExamMapper, Exam> implements ExamService {

    @Override
    public PageResult<Exam> page(ExamParam examParam) {

        // 构造条件
        LambdaQueryWrapper<Exam> queryWrapper = new LambdaQueryWrapper<>();

        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<Exam> list(ExamParam examParam) {

        // 构造条件
        LambdaQueryWrapper<Exam> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(ExamParam examParam) {

        // 将dto转为实体
        Exam exam = new Exam();
        BeanUtil.copyProperties(examParam, exam);

        this.save(exam);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer[] id) {

//        examMapper.deleteExamByIds(id);
    }

    @Override
    public void edit(ExamParam examParam) {

        // 根据id查询实体
        Exam exam = this.queryTjExam(examParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(examParam, exam);

        this.updateById(exam);
    }

    @Override
    public Exam detail(ExamParam examParam) {
        return this.queryTjExam(examParam);
    }


    /**
     * 获取tj_exam
     *
     * @author shiTou
     * @since 2021/01/10 19:37
     */
    private Exam queryTjExam(ExamParam examParam) {
        Exam exam = this.getById(examParam.getId());
        if (ObjectUtil.isEmpty(exam)) {
            throw new ServiceException(ExamExceptionEnum.NOT_EXISTED);
        }
        return exam;
    }
}