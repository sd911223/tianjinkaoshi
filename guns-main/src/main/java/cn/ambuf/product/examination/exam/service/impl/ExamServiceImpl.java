package cn.ambuf.product.examination.exam.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.enums.CommonStatusEnum;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.admission.entity.Admission;
import cn.ambuf.product.examination.admission.mapper.AdmissionMapper;
import cn.ambuf.product.examination.exam.entity.Exam;
import cn.ambuf.product.examination.exam.enums.ExamExceptionEnum;
import cn.ambuf.product.examination.exam.enums.ExamStatusEnum;
import cn.ambuf.product.examination.exam.mapper.ExamMapper;
import cn.ambuf.product.examination.exam.model.param.ExamParam;
import cn.ambuf.product.examination.exam.service.ExamService;
import cn.ambuf.product.examination.score.entity.JcScore;
import cn.ambuf.product.examination.score.mapper.JcScoreMapper;
import cn.ambuf.product.examination.admission.entity.JnAdmission;
import cn.ambuf.product.examination.admission.mapper.JnAdmissionMapper;
import cn.ambuf.product.examination.score.entity.JnScore;
import cn.ambuf.product.examination.score.mapper.JnScoreMapper;
import cn.ambuf.product.examination.admission.entity.ScAdmission;
import cn.ambuf.product.examination.admission.mapper.ScAdmissionMapper;
import cn.ambuf.product.examination.score.entity.Score;
import cn.ambuf.product.examination.score.mapper.ScoreMapper;
import cn.ambuf.product.examination.score.entity.ScScore;
import cn.ambuf.product.examination.score.mapper.ScScoreMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 考试管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/13 01:35
 */
@Service
public class ExamServiceImpl extends ServiceImpl<ExamMapper, Exam> implements ExamService {
    @Resource
    ExamMapper examMapper;
    @Resource
    ScoreMapper scoreMapper;
    @Resource
    JcScoreMapper jcScoreMapper;
    @Resource
    ScScoreMapper scScoreMapper;
    @Resource
    JnScoreMapper jnScoreMapper;
    @Resource
    AdmissionMapper admissionMapper;
    @Resource
    JnAdmissionMapper jnAdmissionMapper;
    @Resource
    ScAdmissionMapper scAdmissionMapper;

    @Override
    public PageResult<Exam> page(ExamParam examParam) {

        // 构造条件
        LambdaQueryWrapper<Exam> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Exam::getDelFlag, CommonStatusEnum.ENABLE.getCode());
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
        exam.setExamStatus(ExamStatusEnum.NOT_SET.getCode());
        this.save(exam);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long[] id) {

        examMapper.deleteExamByIds(id);
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

    @Override
    public void revoke(Long[] id) {
        examMapper.updateExamStatusByIds(id);
    }

    @Override
    public void eliminate(Long[] id) {
        List<Long> list = Arrays.asList(id);
        if (!list.isEmpty()) {
            list.forEach(e -> {
                Exam exam = this.getById(e);
                //高级
                if (exam.getExamType().equals(String.valueOf(1348282279595782145L))) {
                    LambdaQueryWrapper<Score> queryWrapper = new LambdaQueryWrapper<>();
                    scoreMapper.delete(queryWrapper);
                    LambdaQueryWrapper<Admission> admissionQueryWrapper = new LambdaQueryWrapper<>();
                    admissionQueryWrapper.eq(Admission::getBelongingExam, e);
                    admissionMapper.delete(admissionQueryWrapper);
                }
                //师承
                if (exam.getExamType().equals(String.valueOf(1348282758375583745L))) {
                    LambdaQueryWrapper<ScScore> queryWrapper = new LambdaQueryWrapper<>();
                    scScoreMapper.delete(queryWrapper);
                    LambdaQueryWrapper<ScAdmission> scAdmissionLambdaQueryWrapper = new LambdaQueryWrapper<>();
                    scAdmissionMapper.delete(scAdmissionLambdaQueryWrapper);
                }
                //专业技术
                if (exam.getExamType().equals(String.valueOf(1348282813102862338L))) {
                    LambdaQueryWrapper<JnScore> queryWrapper = new LambdaQueryWrapper<>();
                    jnScoreMapper.delete(queryWrapper);
                    LambdaQueryWrapper<JnAdmission> jnAdmissionLambdaQueryWrapper = new LambdaQueryWrapper<>();
                    jnAdmissionMapper.delete(jnAdmissionLambdaQueryWrapper);
                }
                //基层
                if (exam.getExamType().equals(String.valueOf(1348282880262057985L))) {
                    LambdaQueryWrapper<JcScore> queryWrapper = new LambdaQueryWrapper<>();
                    jcScoreMapper.delete(queryWrapper);
                    LambdaQueryWrapper<Admission> admissionQueryWrapper = new LambdaQueryWrapper<>();
                    admissionQueryWrapper.eq(Admission::getBelongingExam, e);
                    admissionMapper.delete(admissionQueryWrapper);
                }
                //中医
                if (exam.getExamType().equals(String.valueOf(1348282952060153857L))) {

                }
            });
        }
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