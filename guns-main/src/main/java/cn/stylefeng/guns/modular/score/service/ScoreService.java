package cn.stylefeng.guns.modular.score.service;

import cn.stylefeng.guns.core.pojo.page.PageResult;
import cn.stylefeng.guns.modular.score.entity.Score;
import cn.stylefeng.guns.modular.score.model.param.ScoreParam;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 考试成绩 服务类
 *
 * @author shiTou
 * @date 2021/01/11 17:27
 */
public interface ScoreService extends IService<Score> {

    /**
     * 分页查询考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    PageResult<Score> page(ScoreParam scoreParam);

    /**
     * 查询所有考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    List<Score> list(ScoreParam scoreParam);

    /**
     * 添加考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    void add(ScoreParam scoreParam);

    /**
     * 删除考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    void delete(Long[] id);

    /**
     * 编辑考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    void edit(ScoreParam scoreParam);

    /**
     * 查看详情考试成绩
     *
     * @author shiTou
     * @date 2021/01/11 17:27
     */
    Score detail(ScoreParam scoreParam);

    void export(Integer[] id);

    void importExcel(MultipartFile file);
}