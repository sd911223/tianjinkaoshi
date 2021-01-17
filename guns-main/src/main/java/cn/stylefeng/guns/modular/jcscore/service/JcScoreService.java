package cn.stylefeng.guns.modular.jcscore.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.jcscore.entity.JcScore;
import cn.stylefeng.guns.modular.jcscore.model.param.JcScoreParam;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 基础考试成绩 服务类
 *
 * @author shiTou
 * @date 2021/01/12 22:59
 */
public interface JcScoreService extends IService<JcScore> {

    /**
     * 分页查询基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    PageResult<JcScore> page(JcScoreParam jcScoreParam);

    /**
     * 查询所有基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    List<JcScore> list(JcScoreParam jcScoreParam);

    /**
     * 添加基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    void add(JcScoreParam jcScoreParam);

    /**
     * 删除基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    void delete(JcScoreParam jcScoreParam);

    /**
     * 编辑基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    void edit(JcScoreParam jcScoreParam);

    /**
     * 查看详情基础考试成绩
     *
     * @author shiTou
     * @date 2021/01/12 22:59
     */
    JcScore detail(JcScoreParam jcScoreParam);

    void export(Long[] id);

    void importExcel(MultipartFile file);
}