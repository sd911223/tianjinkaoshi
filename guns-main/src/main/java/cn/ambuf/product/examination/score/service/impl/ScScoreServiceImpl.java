package cn.ambuf.product.examination.score.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.core.util.PoiUtil;
import cn.ambuf.product.examination.admission.entity.ScAdmissionTypeEnum;
import cn.ambuf.product.examination.score.entity.ScScore;
import cn.ambuf.product.examination.score.enums.ScScoreExceptionEnum;
import cn.ambuf.product.examination.score.mapper.ScScoreMapper;
import cn.ambuf.product.examination.score.model.param.ScScoreParam;
import cn.ambuf.product.examination.score.service.ScScoreService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 综合笔试成绩管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/12 23:45
 */
@Service
public class ScScoreServiceImpl extends ServiceImpl<ScScoreMapper, ScScore> implements ScScoreService {

    @Override
    public PageResult<ScScore> page(ScScoreParam scScoreParam) {

        // 构造条件
        LambdaQueryWrapper<ScScore> queryWrapper = new LambdaQueryWrapper<>();
        //查询类型
        queryWrapper.eq(ScScore::getExamType, scScoreParam.getExamType());
        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<ScScore> list(ScScoreParam scScoreParam) {

        // 构造条件
        LambdaQueryWrapper<ScScore> queryWrapper = new LambdaQueryWrapper<>();
        //查询类型
        queryWrapper.eq(ScScore::getExamType, scScoreParam.getExamType());
        return this.list(queryWrapper);
    }

    @Override
    public void add(ScScoreParam scScoreParam) {

        // 将dto转为实体
        ScScore scScore = new ScScore();
        BeanUtil.copyProperties(scScoreParam, scScore);

        this.save(scScore);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(ScScoreParam scScoreParam) {
        this.removeById(scScoreParam.getId());
    }

    @Override
    public void edit(ScScoreParam scScoreParam) {

        // 根据id查询实体
        ScScore scScore = this.queryScScore(scScoreParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(scScoreParam, scScore);

        this.updateById(scScore);
    }

    @Override
    public ScScore detail(ScScoreParam scScoreParam) {
        return this.queryScScore(scScoreParam);
    }

    @Override
    public void importExcel(MultipartFile file, ScAdmissionTypeEnum scAdmissionTypeEnum) {
        List<ScScore> list = PoiUtil.importExcel(file, 0, 1, ScScore.class);
        if (!list.isEmpty()) {
            list.forEach(e -> {
                e.setCreateTime(new Date());
                e.setExamType(scAdmissionTypeEnum.getCode());
                this.save(e);
            });
        }
    }

    @Override
    public void export(Long[] id, ScAdmissionTypeEnum scAdmissionTypeEnum) {
        if (id == null) {
            ScScoreParam scoreParam = new ScScoreParam();
            scoreParam.setExamType(scAdmissionTypeEnum.getCode());
            List<ScScore> list = this.list(scoreParam);
            PoiUtil.exportExcelWithStream("ScScoreAndWritten.xls", ScScore.class, list);
        } else {
            List<Long> list = Arrays.asList(id);
            List<ScScore> scoreList = this.listByIds(list);
            PoiUtil.exportExcelWithStream("ScScoreAndWritten.xls", ScScore.class, scoreList);
        }
    }


    /**
     * 获取综合笔试成绩管理
     *
     * @author ShiTou
     * @since 2021/01/12 23:45
     */
    private ScScore queryScScore(ScScoreParam scScoreParam) {
        ScScore scScore = this.getById(scScoreParam.getId());
        if (ObjectUtil.isEmpty(scScore)) {
            throw new ServiceException(ScScoreExceptionEnum.NOT_EXISTED);
        }
        return scScore;
    }
}