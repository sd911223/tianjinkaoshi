package cn.stylefeng.guns.modular.jnset.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.jnset.entity.JnSet;
import cn.stylefeng.guns.modular.jnset.enums.JnSetExceptionEnum;
import cn.stylefeng.guns.modular.jnset.mapper.JnSetMapper;
import cn.stylefeng.guns.modular.jnset.model.param.JnSetParam;
import cn.stylefeng.guns.modular.jnset.service.JnSetService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 技能设置 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/13 14:15
 */
@Service
public class JnSetServiceImpl extends ServiceImpl<JnSetMapper, JnSet> implements JnSetService {

    @Override
    public PageResult<JnSet> page(JnSetParam jnSetParam) {

        // 构造条件
        LambdaQueryWrapper<JnSet> queryWrapper = new LambdaQueryWrapper<>();

        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<JnSet> list(JnSetParam jnSetParam) {

        // 构造条件
        LambdaQueryWrapper<JnSet> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(JnSetParam jnSetParam) {

        // 将dto转为实体
        JnSet jnSet = new JnSet();
        BeanUtil.copyProperties(jnSetParam, jnSet);

        this.save(jnSet);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(JnSetParam jnSetParam) {
        this.removeById(jnSetParam.getId());
    }

    @Override
    public void edit(JnSetParam jnSetParam) {

        // 根据id查询实体
        JnSet jnSet = this.queryJnSet(jnSetParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(jnSetParam, jnSet);

        this.updateById(jnSet);
    }

    @Override
    public JnSet detail(JnSetParam jnSetParam) {
        // 构造条件
        LambdaQueryWrapper<JnSet> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(JnSet::getExamId,jnSetParam.getExamId());
        return this.getOne(queryWrapper);
    }


    /**
     * 获取技能设置
     *
     * @author ShiTou
     * @since 2021/01/13 14:15
     */
    private JnSet queryJnSet(JnSetParam jnSetParam) {
        JnSet jnSet = this.getById(jnSetParam.getId());
        if (ObjectUtil.isEmpty(jnSet)) {
            throw new ServiceException(JnSetExceptionEnum.NOT_EXISTED);
        }
        return jnSet;
    }
}