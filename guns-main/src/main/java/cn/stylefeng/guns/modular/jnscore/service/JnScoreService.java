package cn.stylefeng.guns.modular.jnscore.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.jnscore.entity.JnScore;
import cn.stylefeng.guns.modular.jnscore.model.param.JnScoreParam;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 专业技能成绩管理 服务类
 *
 * @author ShiTou
 * @date 2021/01/17 18:10
 */
public interface JnScoreService extends IService<JnScore> {

    /**
     * 分页查询专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    PageResult<JnScore> page(JnScoreParam jnScoreParam);

    /**
     * 查询所有专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    List<JnScore> list(JnScoreParam jnScoreParam);

    /**
     * 添加专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    void add(JnScoreParam jnScoreParam);

    /**
     * 删除专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    void delete(JnScoreParam jnScoreParam);

    /**
     * 编辑专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    void edit(JnScoreParam jnScoreParam);

    /**
     * 查看详情专业技能成绩管理
     *
     * @author ShiTou
     * @date 2021/01/17 18:10
     */
    JnScore detail(JnScoreParam jnScoreParam);

    void export(Long[] id);

    void importExcel(MultipartFile file);
}