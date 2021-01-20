package cn.ambuf.product.examination.score.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.core.util.PoiUtil;
import cn.ambuf.product.examination.score.entity.JnScore;
import cn.ambuf.product.examination.score.enums.JnScoreExceptionEnum;
import cn.ambuf.product.examination.score.mapper.JnScoreMapper;
import cn.ambuf.product.examination.score.model.param.JnScoreParam;
import cn.ambuf.product.examination.score.service.JnScoreService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 专业技能成绩管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/17 18:10
 */
@Service
public class JnScoreServiceImpl extends ServiceImpl<JnScoreMapper, JnScore> implements JnScoreService {

    @Override
    public PageResult<JnScore> page(JnScoreParam jnScoreParam) {

        // 构造条件
        LambdaQueryWrapper<JnScore> queryWrapper = new LambdaQueryWrapper<>();

        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<JnScore> list(JnScoreParam jnScoreParam) {

        // 构造条件
        LambdaQueryWrapper<JnScore> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(JnScoreParam jnScoreParam) {

        // 将dto转为实体
        JnScore jnScore = new JnScore();
        BeanUtil.copyProperties(jnScoreParam, jnScore);

        this.save(jnScore);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(JnScoreParam jnScoreParam) {
        this.removeById(jnScoreParam.getId());
    }

    @Override
    public void edit(JnScoreParam jnScoreParam) {

        // 根据id查询实体
        JnScore jnScore = this.queryJnScore(jnScoreParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(jnScoreParam, jnScore);

        this.updateById(jnScore);
    }

    @Override
    public JnScore detail(JnScoreParam jnScoreParam) {
        return this.queryJnScore(jnScoreParam);
    }

    @Override
    public void export(Long[] id) {
        if (id == null) {
            JnScoreParam jnScoreParam = new JnScoreParam();
            List<JnScore> jnScoreList = this.list(jnScoreParam);
            PoiUtil.exportExcelWithStream("JnScore.xls", JnScore.class, jnScoreList);
        } else {
            List<Long> list = Arrays.asList(id);
            List<JnScore> jnScoreList = this.listByIds(list);
            PoiUtil.exportExcelWithStream("JnScore.xls", JnScore.class, jnScoreList);
        }
    }

    @Override
    public void importExcel(MultipartFile file) {
        List<JnScore> list = PoiUtil.importExcel(file, 0, 1, JnScore.class);
        if (!list.isEmpty()) {
            list.forEach(e -> {
                e.setCreateTime(new Date());
                this.save(e);
            });
        }
    }


    /**
     * 获取专业技能成绩管理
     *
     * @author ShiTou
     * @since 2021/01/17 18:10
     */
    private JnScore queryJnScore(JnScoreParam jnScoreParam) {
        JnScore jnScore = this.getById(jnScoreParam.getId());
        if (ObjectUtil.isEmpty(jnScore)) {
            throw new ServiceException(JnScoreExceptionEnum.NOT_EXISTED);
        }
        return jnScore;
    }
}