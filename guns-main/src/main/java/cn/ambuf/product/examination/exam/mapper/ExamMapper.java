package cn.ambuf.product.examination.exam.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.ambuf.product.examination.exam.entity.Exam;

/**
 * 考试管理 Mapper 接口
 *
 * @author ShiTou
 * @date 2021/01/13 01:35
 */
public interface ExamMapper extends BaseMapper<Exam> {

    int deleteExamByIds(Long[] id);

    int updateExamStatusByIds(Long[] id);
}