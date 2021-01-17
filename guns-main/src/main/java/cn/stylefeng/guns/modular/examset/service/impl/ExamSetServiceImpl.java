package cn.stylefeng.guns.modular.examset.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.examset.entity.ExamSet;
import cn.stylefeng.guns.modular.examset.enums.ExamSetExceptionEnum;
import cn.stylefeng.guns.modular.examset.mapper.ExamSetMapper;
import cn.stylefeng.guns.modular.examset.model.param.ExamSetParam;
import cn.stylefeng.guns.modular.examset.service.ExamSetService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 考试设置 服务实现类
 *
 * @author shiTou
 * @date 2021/01/12 22:20
 */
@Service
public class ExamSetServiceImpl extends ServiceImpl<ExamSetMapper, ExamSet> implements ExamSetService {

    @Override
    public PageResult<ExamSet> page(ExamSetParam examSetParam) {

        // 构造条件
        LambdaQueryWrapper<ExamSet> queryWrapper = new LambdaQueryWrapper<>();

        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<ExamSet> list(ExamSetParam examSetParam) {

        // 构造条件
        LambdaQueryWrapper<ExamSet> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(ExamSetParam examSetParam) {

        // 将dto转为实体
        ExamSet examSet = new ExamSet();
        BeanUtil.copyProperties(examSetParam, examSet);

        this.save(examSet);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(ExamSetParam examSetParam) {
        this.removeById(examSetParam.getId());
    }

    @Override
    public void edit(ExamSetParam examSetParam) {

        // 根据id查询实体
        ExamSet examSet = this.queryExamSet(examSetParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(examSetParam, examSet);

        this.updateById(examSet);
    }

    @Override
    public ExamSet detail(ExamSetParam examSetParam) {

        // 构造条件
        LambdaQueryWrapper<ExamSet> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ExamSet::getExamId, examSetParam.getExamId());
        return this.getOne(queryWrapper);
    }


    /**
     * 获取考试设置
     *
     * @author shiTou
     * @since 2021/01/12 22:20
     */
    private ExamSet queryExamSet(ExamSetParam examSetParam) {
        ExamSet examSet = this.getById(examSetParam.getId());
        if (ObjectUtil.isEmpty(examSet)) {
            throw new ServiceException(ExamSetExceptionEnum.NOT_EXISTED);
        }
        return examSet;
    }
}