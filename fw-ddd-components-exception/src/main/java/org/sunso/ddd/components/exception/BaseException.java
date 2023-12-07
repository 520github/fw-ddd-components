package org.sunso.ddd.components.exception;

import org.sunso.ddd.components.core.ResultStatusEnumInterface;

/**
 * @author sunso520
 * @Title:BaseException
 * @Description: <br>
 * @Created on 2023/12/6 11:42
 */
public abstract class BaseException extends RuntimeException {

    private ResultStatusEnumInterface resultStatusEnumInterface;

    public BaseException(String message) {
        super(message);
    }

    public BaseException(ResultStatusEnumInterface resultStatusEnumInterface, String message) {
        super(message);
        this.resultStatusEnumInterface = resultStatusEnumInterface;
    }

    public BaseException(String message, Throwable e) {
        super(message, e);
    }

    public BaseException(ResultStatusEnumInterface resultStatusEnumInterface, String message, Throwable e) {
        super(message, e);
        this.resultStatusEnumInterface = resultStatusEnumInterface;
    }

    public ResultStatusEnumInterface getResultStatusEnumInterface() {
        return resultStatusEnumInterface;
    }
}
