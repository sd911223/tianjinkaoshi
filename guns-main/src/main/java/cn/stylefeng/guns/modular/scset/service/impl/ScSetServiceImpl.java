package cn.stylefeng.guns.modular.scset.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.scset.entity.ScSet;
import cn.stylefeng.guns.modular.scset.mapper.ScSetMapper;
import cn.stylefeng.guns.modular.scset.model.param.ScSetParam;
import cn.stylefeng.guns.modular.scset.service.ScSetService;
import cn.stylefeng.guns.modular.scset.enums.ScSetExceptionEnum;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 师承设置 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/13 04:10
 */
@Service
public class ScSetServiceImpl extends ServiceImpl<ScSetMapper, ScSet> implements ScSetService {

    @Override
    public PageResult<ScSet> page(ScSetParam scSetParam) {

        // 构造条件
        LambdaQueryWrapper<ScSet> queryWrapper = new LambdaQueryWrapper<>();

        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<ScSet> list(ScSetParam scSetParam) {

        // 构造条件
        LambdaQueryWrapper<ScSet> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(ScSetParam scSetParam) {

        // 将dto转为实体
        ScSet scSet = new ScSet();
        BeanUtil.copyProperties(scSetParam, scSet);

        this.save(scSet);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(ScSetParam scSetParam) {
        this.removeById(scSetParam.getId());
    }

    @Override
    public void edit(ScSetParam scSetParam) {

        // 根据id查询实体
        ScSet scSet = this.queryScSet(scSetParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(scSetParam, scSet);

        this.updateById(scSet);
    }

    @Override
    public ScSet detail(ScSetParam scSetParam) {
        return this.queryScSet(scSetParam);
    }



    /**
     * 获取师承设置
     *
     * @author ShiTou
     * @since 2021/01/13 04:10
     */
    private ScSet queryScSet(ScSetParam scSetParam) {
        ScSet scSet = this.getById(scSetParam.getId());
        if (ObjectUtil.isEmpty(scSet)) {
            throw new ServiceException(ScSetExceptionEnum.NOT_EXISTED);
        }
        return scSet;
    }
}