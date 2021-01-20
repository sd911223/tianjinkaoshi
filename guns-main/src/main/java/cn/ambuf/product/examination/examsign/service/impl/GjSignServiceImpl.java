package cn.ambuf.product.examination.examsign.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.examsign.enums.ExamSignStatusEnum;
import cn.ambuf.product.examination.examsign.entity.GjSign;
import cn.ambuf.product.examination.examsign.enums.GjSignExceptionEnum;
import cn.ambuf.product.examination.examsign.mapper.GjSignMapper;
import cn.ambuf.product.examination.examsign.model.param.GjSignParam;
import cn.ambuf.product.examination.examsign.service.GjSignService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 高级报名考试管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/20 21:15
 */
@Service
public class GjSignServiceImpl extends ServiceImpl<GjSignMapper, GjSign> implements GjSignService {

    @Override
    public PageResult<GjSign> page(GjSignParam gjSignParam) {

        // 构造条件
        LambdaQueryWrapper<GjSign> queryWrapper = new LambdaQueryWrapper<>();
        //查询正式
        queryWrapper.eq(GjSign::getSignStatus, ExamSignStatusEnum.SIGN.getCode());
        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<GjSign> list(GjSignParam gjSignParam) {

        // 构造条件
        LambdaQueryWrapper<GjSign> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(GjSignParam gjSignParam) {

        // 将dto转为实体
        GjSign gjSign = new GjSign();
        BeanUtil.copyProperties(gjSignParam, gjSign);

        this.save(gjSign);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(GjSignParam gjSignParam) {
        this.removeById(gjSignParam.getId());
    }

    @Override
    public void edit(GjSignParam gjSignParam) {

        // 根据id查询实体
        GjSign gjSign = this.queryGjSign(gjSignParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(gjSignParam, gjSign);

        this.updateById(gjSign);
    }

    @Override
    public GjSign detail(GjSignParam gjSignParam) {
        return this.queryGjSign(gjSignParam);
    }


    /**
     * 获取高级报名考试管理
     *
     * @author ShiTou
     * @since 2021/01/20 21:15
     */
    private GjSign queryGjSign(GjSignParam gjSignParam) {
        GjSign gjSign = this.getById(gjSignParam.getId());
        if (ObjectUtil.isEmpty(gjSign)) {
            throw new ServiceException(GjSignExceptionEnum.NOT_EXISTED);
        }
        return gjSign;
    }
}