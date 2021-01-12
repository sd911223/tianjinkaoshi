package cn.stylefeng.guns.modular.score.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.enums.CommonStatusEnum;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.core.util.PoiUtil;
import cn.stylefeng.guns.modular.score.entity.Score;
import cn.stylefeng.guns.modular.score.enums.ScoreExceptionEnum;
import cn.stylefeng.guns.modular.score.mapper.ScoreMapper;
import cn.stylefeng.guns.modular.score.model.param.ScoreParam;
import cn.stylefeng.guns.modular.score.service.ScoreService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 考试成绩 服务实现类
 *
 * @author shiTou
 * @date 2021/01/11 17:27
 */
@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {
    @Resource
    ScoreMapper scoreMapper;

    @Override
    public PageResult<Score> page(ScoreParam scoreParam) {

        // 构造条件
        LambdaQueryWrapper<Score> queryWrapper = new LambdaQueryWrapper<>();
        //有效的数据
        queryWrapper.eq(Score::getDelFlag, CommonStatusEnum.ENABLE.getCode());
        //所属考试
        queryWrapper.eq(Score::getBelongingExam, scoreParam.getBelongingExam());
        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<Score> list(ScoreParam scoreParam) {

        // 构造条件
        LambdaQueryWrapper<Score> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Score::getDelFlag, CommonStatusEnum.ENABLE.getCode());
        return this.list(queryWrapper);
    }

    @Override
    public void add(ScoreParam scoreParam) {

        // 将dto转为实体
        Score score = new Score();
        BeanUtil.copyProperties(scoreParam, score);

        this.save(score);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long[] id) {
        scoreMapper.deleteScoreByIds(id);
    }

    @Override
    public void edit(ScoreParam scoreParam) {

        // 根据id查询实体
        Score score = this.queryScore(scoreParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(scoreParam, score);

        this.updateById(score);
    }

    @Override
    public Score detail(ScoreParam scoreParam) {
        return this.queryScore(scoreParam);
    }

    @Override
    public void export(Integer[] id) {
        if (id == null) {
            ScoreParam scoreParam = new ScoreParam();
            List<Score> list = this.list(scoreParam);
            PoiUtil.exportExcelWithStream("Score.xls", Score.class, list);
        } else {
            List<Integer> list = Arrays.asList(id);
            List<Score> scoreList = this.listByIds(list);
            PoiUtil.exportExcelWithStream("Score.xls", Score.class, scoreList);
        }

    }

    @Override
    public void importExcel(MultipartFile file, Long examId) {
        List<Score> list = PoiUtil.importExcel(file, 0, 1, Score.class);
        if (!list.isEmpty()) {
            list.forEach(e -> {
                e.setCreateTime(new Date());
                e.setBelongingExam(examId);
                this.save(e);
            });
        }
    }


    /**
     * 获取考试成绩
     *
     * @author shiTou
     * @since 2021/01/11 17:27
     */
    private Score queryScore(ScoreParam scoreParam) {
        Score score = this.getById(scoreParam.getId());
        if (ObjectUtil.isEmpty(score)) {
            throw new ServiceException(ScoreExceptionEnum.NOT_EXISTED);
        }
        return score;
    }
}