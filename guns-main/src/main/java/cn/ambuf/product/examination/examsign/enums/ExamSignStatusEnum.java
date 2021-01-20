package cn.ambuf.product.examination.examsign.enums;

import lombok.Getter;

/**
 * 报名人员管理相关枚举
 *
 * @author ShiTou
 * @date 2021/01/14 22:39
 */
@Getter
public enum ExamSignStatusEnum {

    /**
     * 草稿
     */
    DRAFT(0, "草稿"),

    /**
     * 报名
     */
    SIGN(1, "正式");

    private final Integer code;

    private final String message;

    ExamSignStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
