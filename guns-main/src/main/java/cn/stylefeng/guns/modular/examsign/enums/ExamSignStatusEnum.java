package cn.stylefeng.guns.modular.examsign.enums;

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
    DRAFT("DRAFT", "草稿"),

    /**
     * 报名
     */
    SIGN("SIGN", "报名");

    private final String code;

    private final String message;

    ExamSignStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
