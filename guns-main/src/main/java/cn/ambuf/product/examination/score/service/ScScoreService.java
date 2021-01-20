package cn.ambuf.product.examination.score.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.ambuf.product.examination.admission.entity.ScAdmissionTypeEnum;
import cn.ambuf.product.examination.score.entity.ScScore;
import cn.ambuf.product.examination.score.model.param.ScScoreParam;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 综合笔试成绩管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/12 23:45
 */
public interface ScScoreService extends IService<ScScore> {

    /**
     * 分页查询综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    PageResult<ScScore> page(ScScoreParam scScoreParam);

    /**
     * 查询所有综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    List<ScScore> list(ScScoreParam scScoreParam);

    /**
     * 添加综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    void add(ScScoreParam scScoreParam);

    /**
     * 删除综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    void delete(ScScoreParam scScoreParam);

    /**
     * 编辑综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    void edit(ScScoreParam scScoreParam);

    /**
     * 查看详情综合笔试成绩管理
     *
     * @author ShiTou
     * @date 2021/01/12 23:45
     */
    ScScore detail(ScScoreParam scScoreParam);

    void importExcel(MultipartFile file, ScAdmissionTypeEnum scAdmissionTypeEnum);

    void export(Long[] id,ScAdmissionTypeEnum scAdmissionTypeEnum);
}