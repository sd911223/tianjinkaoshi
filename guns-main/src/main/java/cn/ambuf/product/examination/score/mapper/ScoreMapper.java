package cn.ambuf.product.examination.score.mapper;

import cn.ambuf.product.examination.score.entity.Score;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 考试成绩 Mapper 接口
 *
 * @author shiTou
 * @date 2021/01/11 17:27
 */
public interface ScoreMapper extends BaseMapper<Score> {

    int deleteScoreByIds(Long[] id);
}