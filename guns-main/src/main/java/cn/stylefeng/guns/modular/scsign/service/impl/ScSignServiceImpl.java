package cn.stylefeng.guns.modular.scsign.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.scsign.entity.ScSign;
import cn.stylefeng.guns.modular.scsign.mapper.ScSignMapper;
import cn.stylefeng.guns.modular.scsign.model.param.ScSignParam;
import cn.stylefeng.guns.modular.scsign.service.ScSignService;
import cn.stylefeng.guns.modular.scsign.enums.ScSignExceptionEnum;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 师承报名人员管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/16 16:19
 */
@Service
public class ScSignServiceImpl extends ServiceImpl<ScSignMapper, ScSign> implements ScSignService {

    @Override
    public PageResult<ScSign> page(ScSignParam scSignParam) {

        // 构造条件
        LambdaQueryWrapper<ScSign> queryWrapper = new LambdaQueryWrapper<>();

        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<ScSign> list(ScSignParam scSignParam) {

        // 构造条件
        LambdaQueryWrapper<ScSign> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(ScSignParam scSignParam) {

        // 将dto转为实体
        ScSign scSign = new ScSign();
        BeanUtil.copyProperties(scSignParam, scSign);

        this.save(scSign);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(ScSignParam scSignParam) {
        this.removeById(scSignParam.getId());
    }

    @Override
    public void edit(ScSignParam scSignParam) {

        // 根据id查询实体
        ScSign scSign = this.queryScSign(scSignParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(scSignParam, scSign);

        this.updateById(scSign);
    }

    @Override
    public ScSign detail(ScSignParam scSignParam) {
        return this.queryScSign(scSignParam);
    }



    /**
     * 获取师承报名人员管理
     *
     * @author ShiTou
     * @since 2021/01/16 16:19
     */
    private ScSign queryScSign(ScSignParam scSignParam) {
        ScSign scSign = this.getById(scSignParam.getId());
        if (ObjectUtil.isEmpty(scSign)) {
            throw new ServiceException(ScSignExceptionEnum.NOT_EXISTED);
        }
        return scSign;
    }
}