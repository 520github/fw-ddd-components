package org.sunso.ddd.components.exception;

import org.sunso.ddd.components.core.ResultStatusEnumInterface;

/**
 * @author sunso520
 * @Title:SysException
 * @Description: <br>
 * @Created on 2023/12/6 11:48
 */
public class SysException extends BaseException {
    public SysException(String message) {
        super(message);
    }

    public SysException(ResultStatusEnumInterface resultStatusEnumInterface, String message) {
        super(resultStatusEnumInterface, message);
    }

    public SysException(String message, Throwable e) {
        super(message, e);
    }

    public SysException(ResultStatusEnumInterface resultStatusEnumInterface, String message, Throwable e) {
        super(resultStatusEnumInterface, message, e);
    }
}
