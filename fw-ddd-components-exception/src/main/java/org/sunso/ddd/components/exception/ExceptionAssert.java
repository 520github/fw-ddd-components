package org.sunso.ddd.components.exception;

import org.sunso.ddd.components.core.ResultStatusEnumInterface;
import org.sunso.ddd.components.core.enums.DefaultResultStatusEnum;

import java.util.Collection;
import java.util.Map;

/**
 * @author sunso520
 * @Title:ExceptionAssert
 * @Description: <br>
 * @Created on 2023/12/6 11:54
 */
public abstract class ExceptionAssert {

    public static void isTrue(boolean expression) {
        isTrue(expression, "[Assertion failed] Must be true");
    }

    public static void isTrue(boolean expression, String errMessage) {
        isTrue(expression, DefaultResultStatusEnum.systemNotAllowTrue, errMessage);
    }

    public static void isTrue(boolean expression, ResultStatusEnumInterface resultStatusEnumInterface, String errMessage) {
        if (!expression) {
            throw new BizException(resultStatusEnumInterface, errMessage);
        }
    }

    public static void isFalse(boolean expression) {
        isFalse(expression, "[Assertion failed] Must be false");
    }


    public static void isFalse(boolean expression, String errMessage) {
        isFalse(expression, DefaultResultStatusEnum.systemNotAllowFalse, errMessage);
    }

    public static void isFalse(boolean expression, ResultStatusEnumInterface resultStatusEnumInterface, String errMessage) {
        if (expression) {
            throw new BizException(resultStatusEnumInterface, errMessage);
        }
    }

    public static void notNull(Object object) {
        notNull(object, "[Assertion failed] Must not null");
    }

    public static void notNull(Object object, String errMessage) {
        notNull(object, DefaultResultStatusEnum.systemNotAllowNull, errMessage);
    }

    public static void notNull(Object object, ResultStatusEnumInterface resultStatusEnumInterface, String errMessage) {
        if (object == null) {
            throw new BizException(resultStatusEnumInterface, errMessage);
        }
    }

    public static void notEmpty(Collection<?> collection, ResultStatusEnumInterface resultStatusEnumInterface,String errMessage) {
        if (collection == null || collection.isEmpty()) {
            throw new BizException(resultStatusEnumInterface, errMessage);
        }
    }

    public static void notEmpty(Collection<?> collection, String errMessage) {
        notEmpty(collection, DefaultResultStatusEnum.systemNotAllowEmpty, errMessage);
    }

    public static void notEmpty(Collection<?> collection) {
        notEmpty(collection, "[Assertion failed] Collection must not be empty: it must contain at least 1 element");
    }

    public static void notEmpty(Map<?, ?> map, String errMessage) {
        notEmpty(map, DefaultResultStatusEnum.systemNotAllowEmpty, errMessage);
    }

    public static void notEmpty(Map<?, ?> map, ResultStatusEnumInterface resultStatusEnumInterface, String errMessage) {
        if (map == null || map.isEmpty()) {
            throw new BizException(resultStatusEnumInterface, errMessage);
        }
    }

    public static void notEmpty(Map<?, ?> map) {
        notEmpty(map, "[Assertion failed] Map must not be empty: it must contain at least one entry");
    }

}
