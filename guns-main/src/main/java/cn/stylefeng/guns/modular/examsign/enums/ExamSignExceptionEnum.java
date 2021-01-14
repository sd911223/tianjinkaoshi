package cn.stylefeng.guns.modular.examsign.enums;

import cn.stylefeng.guns.core.annotion.ExpEnumType;
import cn.stylefeng.guns.core.consts.ExpEnumConstant;
import cn.stylefeng.guns.core.exception.enums.abs.AbstractBaseExceptionEnum;
import cn.stylefeng.guns.core.factory.ExpEnumCodeFactory;
import lombok.Getter;

/**
 * 报名人员管理相关枚举
 *
 * @author ShiTou
 * @date 2021/01/14 22:39
 */
@Getter
@ExpEnumType(module = ExpEnumConstant.GUNS_MAIN_MODULE_EXP_CODE, kind = 0)
public enum ExamSignExceptionEnum implements AbstractBaseExceptionEnum {

    /**
     * 该条记录不存在
     */
    NOT_EXISTED(1, "您查询的该条记录不存在"),

    /**
     * 编码重复
     */
    CODE_REPEAT(2, "编码重复，请检查code参数");

    private final Integer code;

    private final String message;

    ExamSignExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return ExpEnumCodeFactory.getExpEnumCode(this.getClass(), code);
    }

    @Override
    public String getMessage() {
        return message;
    }

}
