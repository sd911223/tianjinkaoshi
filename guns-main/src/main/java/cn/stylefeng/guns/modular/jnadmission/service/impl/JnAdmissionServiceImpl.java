package cn.stylefeng.guns.modular.jnadmission.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.core.util.PoiUtil;
import cn.stylefeng.guns.modular.jcscore.entity.JcScore;
import cn.stylefeng.guns.modular.jnadmission.entity.JnAdmission;
import cn.stylefeng.guns.modular.jnadmission.enums.JnAdmissionExceptionEnum;
import cn.stylefeng.guns.modular.jnadmission.mapper.JnAdmissionMapper;
import cn.stylefeng.guns.modular.jnadmission.model.param.JnAdmissionParam;
import cn.stylefeng.guns.modular.jnadmission.service.JnAdmissionService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 专业技能准考证信息管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/16 17:35
 */
@Service
public class JnAdmissionServiceImpl extends ServiceImpl<JnAdmissionMapper, JnAdmission> implements JnAdmissionService {

    @Override
    public PageResult<JnAdmission> page(JnAdmissionParam jnAdmissionParam) {

        // 构造条件
        LambdaQueryWrapper<JnAdmission> queryWrapper = new LambdaQueryWrapper<>();

        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<JnAdmission> list(JnAdmissionParam jnAdmissionParam) {

        // 构造条件
        LambdaQueryWrapper<JnAdmission> queryWrapper = new LambdaQueryWrapper<>();

        return this.list(queryWrapper);
    }

    @Override
    public void add(JnAdmissionParam jnAdmissionParam) {

        // 将dto转为实体
        JnAdmission jnAdmission = new JnAdmission();
        BeanUtil.copyProperties(jnAdmissionParam, jnAdmission);

        this.save(jnAdmission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(JnAdmissionParam jnAdmissionParam) {
        this.removeById(jnAdmissionParam.getId());
    }

    @Override
    public void edit(JnAdmissionParam jnAdmissionParam) {

        // 根据id查询实体
        JnAdmission jnAdmission = this.queryJnAdmission(jnAdmissionParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(jnAdmissionParam, jnAdmission);

        this.updateById(jnAdmission);
    }

    @Override
    public JnAdmission detail(JnAdmissionParam jnAdmissionParam) {
        return this.queryJnAdmission(jnAdmissionParam);
    }

    @Override
    public void export(Long[] id) {
        if (id == null) {
            JnAdmissionParam jnAdmissionParam = new JnAdmissionParam();
            List<JnAdmission> list = this.list(jnAdmissionParam);
            PoiUtil.exportExcelWithStream("JnAdmission.xls", JcScore.class, list);
        } else {
            List<Long> list = Arrays.asList(id);
            List<JnAdmission> scoreList = this.listByIds(list);
            PoiUtil.exportExcelWithStream("JnAdmission.xls", JcScore.class, scoreList);
        }
    }

    @Override
    public void importExcel(MultipartFile file) {
        List<JnAdmission> list = PoiUtil.importExcel(file, 0, 1, JnAdmission.class);
        if (!list.isEmpty()) {
            list.forEach(e -> {
                e.setCreateTime(new Date());
                this.save(e);
            });
        }
    }


    /**
     * 获取专业技能准考证信息管理
     *
     * @author ShiTou
     * @since 2021/01/16 17:35
     */
    private JnAdmission queryJnAdmission(JnAdmissionParam jnAdmissionParam) {
        JnAdmission jnAdmission = this.getById(jnAdmissionParam.getId());
        if (ObjectUtil.isEmpty(jnAdmission)) {
            throw new ServiceException(JnAdmissionExceptionEnum.NOT_EXISTED);
        }
        return jnAdmission;
    }
}