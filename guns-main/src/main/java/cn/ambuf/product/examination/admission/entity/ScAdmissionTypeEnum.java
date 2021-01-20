package cn.ambuf.product.examination.admission.entity;

import lombok.Getter;

/**
 * 师承综合笔试准考证信息/技能准考证信息 管理相关枚举
 *
 * @author ShiTou
 * @date 2021/01/12 23:31
 */
@Getter
public enum ScAdmissionTypeEnum {

    /**
     * 技能准考证信息管理
     */
    SKILL_ADMISSION("SKILL_ADMISSION", "技能准考证信息管理"),

    /**
     * 综合笔试准考证信息管理
     */
    WRITTEN_ADMISSION("WRITTEN_ADMISSION", "综合笔试准考证信息管理");

    private final String code;

    private final String message;

    ScAdmissionTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
