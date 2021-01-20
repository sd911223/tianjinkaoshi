package cn.ambuf.product.examination.examsign.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.examsign.enums.ExamSignStatusEnum;
import cn.ambuf.product.examination.examsign.entity.JnSign;
import cn.ambuf.product.examination.examsign.mapper.JnSignMapper;
import cn.ambuf.product.examination.examsign.model.param.JnSignParam;
import cn.ambuf.product.examination.examsign.service.JnSignService;
import cn.ambuf.product.examination.examsign.enums.JnSignExceptionEnum;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 专业技术报名人员管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/20 21:48
 */
@Service
public class JnSignServiceImpl extends ServiceImpl<JnSignMapper, JnSign> implements JnSignService {

    @Override
    public PageResult<JnSign> page(JnSignParam jnSignParam) {

        // 构造条件
        LambdaQueryWrapper<JnSign> queryWrapper = new LambdaQueryWrapper<>();
        //查询正式的
        queryWrapper.eq(JnSign::getSignStatus, ExamSignStatusEnum.SIGN.getCode());
        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<JnSign> list(JnSignParam jnSignParam) {

        // 构造条件
        LambdaQueryWrapper<JnSign> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(JnSignParam jnSignParam) {

        // 将dto转为实体
        JnSign jnSign = new JnSign();
        BeanUtil.copyProperties(jnSignParam, jnSign);

        this.save(jnSign);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(JnSignParam jnSignParam) {
        this.removeById(jnSignParam.getId());
    }

    @Override
    public void edit(JnSignParam jnSignParam) {

        // 根据id查询实体
        JnSign jnSign = this.queryJnSign(jnSignParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(jnSignParam, jnSign);

        this.updateById(jnSign);
    }

    @Override
    public JnSign detail(JnSignParam jnSignParam) {
        return this.queryJnSign(jnSignParam);
    }



    /**
     * 获取专业技术报名人员管理
     *
     * @author ShiTou
     * @since 2021/01/20 21:48
     */
    private JnSign queryJnSign(JnSignParam jnSignParam) {
        JnSign jnSign = this.getById(jnSignParam.getId());
        if (ObjectUtil.isEmpty(jnSign)) {
            throw new ServiceException(JnSignExceptionEnum.NOT_EXISTED);
        }
        return jnSign;
    }
}