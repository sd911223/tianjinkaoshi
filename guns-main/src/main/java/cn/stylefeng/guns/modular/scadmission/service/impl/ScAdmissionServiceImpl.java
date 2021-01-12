package cn.stylefeng.guns.modular.scadmission.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.core.util.PoiUtil;
import cn.stylefeng.guns.modular.scadmission.entity.ScAdmission;
import cn.stylefeng.guns.modular.scadmission.enums.ScAdmissionExceptionEnum;
import cn.stylefeng.guns.modular.scadmission.enums.ScAdmissionTypeEnum;
import cn.stylefeng.guns.modular.scadmission.mapper.ScAdmissionMapper;
import cn.stylefeng.guns.modular.scadmission.model.param.ScAdmissionParam;
import cn.stylefeng.guns.modular.scadmission.service.ScAdmissionService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 师承综合笔试准考证信息管理 服务实现类
 *
 * @author ShiTou
 * @date 2021/01/12 23:31
 */
@Service
public class ScAdmissionServiceImpl extends ServiceImpl<ScAdmissionMapper, ScAdmission> implements ScAdmissionService {

    @Override
    public PageResult<ScAdmission> page(ScAdmissionParam scAdmissionParam) {

        // 构造条件
        LambdaQueryWrapper<ScAdmission> queryWrapper = new LambdaQueryWrapper<>();
        //查询类型
        queryWrapper.eq(ScAdmission::getExamType, scAdmissionParam.getExamType());
        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<ScAdmission> list(ScAdmissionParam scAdmissionParam) {

        // 构造条件
        LambdaQueryWrapper<ScAdmission> queryWrapper = new LambdaQueryWrapper<>();
        //查询类型
        queryWrapper.eq(ScAdmission::getExamType, scAdmissionParam.getExamType());
        return this.list(queryWrapper);
    }

    @Override
    public void add(ScAdmissionParam scAdmissionParam) {

        // 将dto转为实体
        ScAdmission scAdmission = new ScAdmission();
        BeanUtil.copyProperties(scAdmissionParam, scAdmission);

        this.save(scAdmission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(ScAdmissionParam scAdmissionParam) {
        this.removeById(scAdmissionParam.getId());
    }

    @Override
    public void edit(ScAdmissionParam scAdmissionParam) {

        // 根据id查询实体
        ScAdmission scAdmission = this.queryScAdmission(scAdmissionParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(scAdmissionParam, scAdmission);

        this.updateById(scAdmission);
    }

    @Override
    public ScAdmission detail(ScAdmissionParam scAdmissionParam) {
        return this.queryScAdmission(scAdmissionParam);
    }

    @Override
    public void export(Integer[] id, ScAdmissionTypeEnum scAdmissionTypeEnum) {
        if (id == null) {
            ScAdmissionParam scoreParam = new ScAdmissionParam();
            scoreParam.setExamType(scAdmissionTypeEnum.getCode());
            List<ScAdmission> list = this.list(scoreParam);
            PoiUtil.exportExcelWithStream("ScAdmissionAndSkill.xls", ScAdmission.class, list);
        } else {
            List<Integer> list = Arrays.asList(id);
            List<ScAdmission> scoreList = this.listByIds(list);
            PoiUtil.exportExcelWithStream("ScAdmissionAndSkill.xls", ScAdmission.class, scoreList);
        }
    }

    @Override
    public void importExcel(MultipartFile file, ScAdmissionTypeEnum scAdmissionTypeEnum) {
        List<ScAdmission> list = PoiUtil.importExcel(file, 0, 1, ScAdmission.class);
        if (!list.isEmpty()) {
            list.forEach(e -> {
                e.setExamType(scAdmissionTypeEnum.getCode());
                e.setCreateTime(new Date());
                this.save(e);
            });
        }
    }


    /**
     * 获取师承综合笔试准考证信息管理
     *
     * @author ShiTou
     * @since 2021/01/12 23:31
     */
    private ScAdmission queryScAdmission(ScAdmissionParam scAdmissionParam) {
        ScAdmission scAdmission = this.getById(scAdmissionParam.getId());
        if (ObjectUtil.isEmpty(scAdmission)) {
            throw new ServiceException(ScAdmissionExceptionEnum.NOT_EXISTED);
        }
        return scAdmission;
    }
}