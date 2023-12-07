package org.sunso.ddd.components.exception;

import org.sunso.ddd.components.core.ResultStatusEnumInterface;

/**
 * @author sunso520
 * @Title:ExceptionFactory
 * @Description: <br>
 * @Created on 2023/12/6 11:51
 */
public class ExceptionFactory {
    public static BizException bizException(String message) {
        return new BizException(message);
    }

    public static BizException bizException(ResultStatusEnumInterface resultStatusEnumInterface, String message) {
        return new BizException(resultStatusEnumInterface, message);
    }

    public static BizException bizException(String message, Throwable e) {
        return new BizException(message, e);
    }

    public static BizException bizException(ResultStatusEnumInterface resultStatusEnumInterface, String message, Throwable e) {
        return new BizException(resultStatusEnumInterface, message, e);
    }

    public static SysException sysException(String message) {
        return new SysException(message);
    }

    public static SysException sysException(ResultStatusEnumInterface resultStatusEnumInterface, String message) {
        return new SysException(resultStatusEnumInterface, message);
    }

    public static SysException sysException(String message, Throwable e) {
        return new SysException(message, e);
    }

    public static SysException sysException(ResultStatusEnumInterface resultStatusEnumInterface, String message, Throwable e) {
        return new SysException(resultStatusEnumInterface, message, e);
    }
}
