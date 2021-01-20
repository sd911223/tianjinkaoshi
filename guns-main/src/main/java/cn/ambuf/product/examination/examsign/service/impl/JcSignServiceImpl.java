package cn.ambuf.product.examination.examsign.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.examsign.enums.ExamSignStatusEnum;
import cn.ambuf.product.examination.examsign.entity.JcSign;
import cn.ambuf.product.examination.examsign.enums.JcSignExceptionEnum;
import cn.ambuf.product.examination.examsign.mapper.JcSignMapper;
import cn.ambuf.product.examination.examsign.model.param.JcSignParam;
import cn.ambuf.product.examination.examsign.service.JcSignService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 基层报名管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/20 23:45
 */
@Service
public class JcSignServiceImpl extends ServiceImpl<JcSignMapper, JcSign> implements JcSignService {

    @Override
    public PageResult<JcSign> page(JcSignParam jcSignParam) {

        // 构造条件
        LambdaQueryWrapper<JcSign> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(JcSign::getSignStatus, ExamSignStatusEnum.SIGN.getCode());
        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<JcSign> list(JcSignParam jcSignParam) {

        // 构造条件
        LambdaQueryWrapper<JcSign> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(JcSignParam jcSignParam) {

        // 将dto转为实体
        JcSign jcSign = new JcSign();
        BeanUtil.copyProperties(jcSignParam, jcSign);

        this.save(jcSign);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(JcSignParam jcSignParam) {
        this.removeById(jcSignParam.getId());
    }

    @Override
    public void edit(JcSignParam jcSignParam) {

        // 根据id查询实体
        JcSign jcSign = this.queryJcSign(jcSignParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(jcSignParam, jcSign);

        this.updateById(jcSign);
    }

    @Override
    public JcSign detail(JcSignParam jcSignParam) {
        return this.queryJcSign(jcSignParam);
    }


    /**
     * 获取基层报名管理
     *
     * @author ShiTou
     * @since 2021/01/20 23:45
     */
    private JcSign queryJcSign(JcSignParam jcSignParam) {
        JcSign jcSign = this.getById(jcSignParam.getId());
        if (ObjectUtil.isEmpty(jcSign)) {
            throw new ServiceException(JcSignExceptionEnum.NOT_EXISTED);
        }
        return jcSign;
    }
}