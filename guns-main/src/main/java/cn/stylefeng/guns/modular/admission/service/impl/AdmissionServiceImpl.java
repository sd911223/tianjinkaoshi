package cn.stylefeng.guns.modular.admission.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.stylefeng.guns.core.enums.CommonStatusEnum;
import cn.stylefeng.guns.core.exception.ServiceException;
import cn.stylefeng.guns.core.factory.PageFactory;
import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.core.util.PoiUtil;
import cn.stylefeng.guns.modular.admission.entity.Admission;
import cn.stylefeng.guns.modular.admission.enums.AdmissionExceptionEnum;
import cn.stylefeng.guns.modular.admission.mapper.AdmissionMapper;
import cn.stylefeng.guns.modular.admission.model.param.AdmissionParam;
import cn.stylefeng.guns.modular.admission.service.AdmissionService;
import cn.stylefeng.guns.modular.score.entity.Score;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 准考证管理 服务实现类
 *
 * @author shiTou
 * @date 2021/01/12 00:03
 */
@Service
public class AdmissionServiceImpl extends ServiceImpl<AdmissionMapper, Admission> implements AdmissionService {
    @Resource
    AdmissionMapper admissionMapper;

    @Override
    public PageResult<Admission> page(AdmissionParam admissionParam) {

        // 构造条件
        LambdaQueryWrapper<Admission> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Admission::getDelFlag, CommonStatusEnum.ENABLE.getCode());

        // 查询分页结果
        return new PageResult<>(this.page(PageFactory.defaultPage(), queryWrapper));
    }

    @Override
    public List<Admission> list(AdmissionParam admissionParam) {

        // 构造条件
        LambdaQueryWrapper<Admission> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Admission::getDelFlag, CommonStatusEnum.ENABLE.getCode());
        return this.list(queryWrapper);
    }

    @Override
    public void add(AdmissionParam admissionParam) {

        // 将dto转为实体
        Admission admission = new Admission();
        BeanUtil.copyProperties(admissionParam, admission);

        this.save(admission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long[] id) {
        admissionMapper.deleteAdmissionByIds(id);
    }

    @Override
    public void edit(AdmissionParam admissionParam) {

        // 根据id查询实体
        Admission admission = this.queryAdmission(admissionParam);

        // 请求参数转化为实体
        BeanUtil.copyProperties(admissionParam, admission);

        this.updateById(admission);
    }

    @Override
    public Admission detail(AdmissionParam admissionParam) {
        return this.queryAdmission(admissionParam);
    }

    @Override
    public void export(Integer[] id) {
        if (id == null) {
            AdmissionParam admissionParam = new AdmissionParam();
            List<Admission> list = this.list(admissionParam);
            PoiUtil.exportExcelWithStream("Admission.xls", Score.class, list);
        } else {
            List<Integer> list = Arrays.asList(id);
            List<Admission> scoreList = this.listByIds(list);
            PoiUtil.exportExcelWithStream("Admission.xls", Score.class, scoreList);
        }
    }

    @Override
    public void importExcel(MultipartFile file) {
        List<Admission> list = PoiUtil.importExcel(file, 0, 1, Admission.class);
        if (!list.isEmpty()) {
            list.forEach(e -> {
                e.setCreateTime(new Date());
                e.setId(null);
                this.save(e);
            });
        }
    }


    /**
     * 获取准考证管理
     *
     * @author shiTou
     * @since 2021/01/12 00:03
     */
    private Admission queryAdmission(AdmissionParam admissionParam) {
        Admission admission = this.getById(admissionParam.getId());
        if (ObjectUtil.isEmpty(admission)) {
            throw new ServiceException(AdmissionExceptionEnum.NOT_EXISTED);
        }
        return admission;
    }
}