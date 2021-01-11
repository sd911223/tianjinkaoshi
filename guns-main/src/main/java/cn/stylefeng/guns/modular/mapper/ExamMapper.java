package cn.stylefeng.guns.modular.mapper;

import cn.stylefeng.guns.modular.entity.Exam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * tj_exam Mapper 接口
 *
 * @author shiTou
 * @date 2021/01/10 19:37
 */
public interface ExamMapper extends BaseMapper<Exam> {

    int deleteExamByIds(Integer[] id);

    int updateExamStatusByIds(Integer[] id);
}