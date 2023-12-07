package org.sunso.ddd.components.exception;

import org.sunso.ddd.components.core.ResultStatusEnumInterface;

/**
 * @author sunso520
 * @Title:BizException
 * @Description: <br>
 * @Created on 2023/12/6 11:47
 */
public class BizException extends BaseException {
    public BizException(String message) {
        super(message);
    }

    public BizException(ResultStatusEnumInterface resultStatusEnumInterface, String message) {
        super(resultStatusEnumInterface, message);
    }

    public BizException(String message, Throwable e) {
        super(message, e);
    }

    public BizException(ResultStatusEnumInterface resultStatusEnumInterface, String message, Throwable e) {
        super(resultStatusEnumInterface, message, e);
    }
}
