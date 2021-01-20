package cn.ambuf.product.examination.score.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.core.util.PoiUtil;
import cn.ambuf.product.examination.score.entity.JcScore;
import cn.ambuf.product.examination.score.entity.JcScoreExceptionEnum;
import cn.ambuf.product.examination.score.mapper.JcScoreMapper;
import cn.ambuf.product.examination.score.model.param.JcScoreParam;
import cn.ambuf.product.examination.score.service.JcScoreService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 基础考试成绩 服务实现类
 *
 * @author shiTou
 * @date 2021/01/12 22:59
 */
@Service
public class JcScoreServiceImpl extends ServiceImpl<JcScoreMapper, JcScore> implements JcScoreService {

    @Override
    public PageResult<JcScore> page(JcScoreParam jcScoreParam) {

        // 构造条件
        LambdaQueryWrapper<JcScore> queryWrapper = new LambdaQueryWrapper<>();
        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<JcScore> list(JcScoreParam jcScoreParam) {

        // 构造条件
        LambdaQueryWrapper<JcScore> queryWrapper = new LambdaQueryWrapper<>();
        return this.list(queryWrapper);
    }

    @Override
    public void add(JcScoreParam jcScoreParam) {

        // 将dto转为实体
        JcScore jcScore = new JcScore();
        BeanUtil.copyProperties(jcScoreParam, jcScore);

        this.save(jcScore);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(JcScoreParam jcScoreParam) {
        this.removeById(jcScoreParam.getId());
    }

    @Override
    public void edit(JcScoreParam jcScoreParam) {

        // 根据id查询实体
        JcScore jcScore = this.queryJcScore(jcScoreParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(jcScoreParam, jcScore);

        this.updateById(jcScore);
    }

    @Override
    public JcScore detail(JcScoreParam jcScoreParam) {
        return this.queryJcScore(jcScoreParam);
    }

    @Override
    public void export(Long[] id) {
        if (id == null) {
            JcScoreParam scoreParam = new JcScoreParam();
            List<JcScore> list = this.list(scoreParam);
            PoiUtil.exportExcelWithStream("JcScore.xls", JcScore.class, list);
        } else {
            List<Long> list = Arrays.asList(id);
            List<JcScore> scoreList = this.listByIds(list);
            PoiUtil.exportExcelWithStream("JcScore.xls", JcScore.class, scoreList);
        }
    }

    @Override
    public void importExcel(MultipartFile file) {
        List<JcScore> list = PoiUtil.importExcel(file, 0, 1, JcScore.class);
        if (!list.isEmpty()) {
            list.forEach(e -> {
                e.setCreateTime(new Date());
                this.save(e);
            });
        }
    }


    /**
     * 获取基础考试成绩
     *
     * @author shiTou
     * @since 2021/01/12 22:59
     */
    private JcScore queryJcScore(JcScoreParam jcScoreParam) {
        JcScore jcScore = this.getById(jcScoreParam.getId());
        if (ObjectUtil.isEmpty(jcScore)) {
            throw new ServiceException(JcScoreExceptionEnum.NOT_EXISTED);
        }
        return jcScore;
    }
}