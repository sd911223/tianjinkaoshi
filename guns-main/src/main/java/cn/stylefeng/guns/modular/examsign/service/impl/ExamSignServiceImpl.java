package cn.stylefeng.guns.modular.examsign.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.enums.CommonStatusEnum;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.examsign.entity.ExamSign;
import cn.stylefeng.guns.modular.examsign.enums.ExamSignExceptionEnum;
import cn.stylefeng.guns.modular.examsign.mapper.ExamSignMapper;
import cn.stylefeng.guns.modular.examsign.model.param.ExamSignParam;
import cn.stylefeng.guns.modular.examsign.service.ExamSignService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 报名人员管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/14 22:39
 */
@Service
public class ExamSignServiceImpl extends ServiceImpl<ExamSignMapper, ExamSign> implements ExamSignService {

    @Override
    public PageResult<ExamSign> page(ExamSignParam examSignParam) {

        // 构造条件
        LambdaQueryWrapper<ExamSign> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(ExamSign::getDelFlag, CommonStatusEnum.ENABLE.getCode());
        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<ExamSign> list(ExamSignParam examSignParam) {

        // 构造条件
        LambdaQueryWrapper<ExamSign> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ExamSign::getDelFlag, CommonStatusEnum.ENABLE.getCode());
        return this.list(queryWrapper);
    }

    @Override
    public void add(ExamSignParam examSignParam) {

        // 将dto转为实体
        ExamSign examSign = new ExamSign();
        BeanUtil.copyProperties(examSignParam, examSign);

        this.save(examSign);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(ExamSignParam examSignParam) {
        this.removeById(examSignParam.getId());
    }

    @Override
    public void edit(ExamSignParam examSignParam) {

        // 根据id查询实体
        ExamSign examSign = this.queryExamSign(examSignParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(examSignParam, examSign);

        this.updateById(examSign);
    }

    @Override
    public ExamSign detail(ExamSignParam examSignParam) {
        return this.queryExamSign(examSignParam);
    }


    /**
     * 获取报名人员管理
     *
     * @author ShiTou
     * @since 2021/01/14 22:39
     */
    private ExamSign queryExamSign(ExamSignParam examSignParam) {
        ExamSign examSign = this.getById(examSignParam.getId());
        if (ObjectUtil.isEmpty(examSign)) {
            throw new ServiceException(ExamSignExceptionEnum.NOT_EXISTED);
        }
        return examSign;
    }
}