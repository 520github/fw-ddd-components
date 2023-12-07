package org.sunso.ddd.components.core.enums;

import org.sunso.ddd.components.core.ResultStatusEnumInterface;

/**
 * @author sunso520
 * @Title:DefaultResultStatusEnum
 * @Description: <br>
 * @Created on 2023/12/6 11:30
 */
public enum DefaultResultStatusEnum implements ResultStatusEnumInterface {
    success("success", "成功", false),
    systemUnknownError("system.unknown.error", "系统未知错误"),
    systemInnerError("system.inner.error", "系统内部错误"),
    systemNetworkError("system.network.error", "系统网络错误"),
    systemNotAllowNull("system.not.allow.null", "不允许为null"),
    systemNotAllowEmpty("system.not.allow.empty", "不允许为空"),
    systemNotAllowTrue("system.not.allow.true", "不允许为True"),
    systemNotAllowFalse("system.not.allow.false", "不允许为False"),

    ;

    private String code;
    private String message;
    private boolean isAlarm = true;

    DefaultResultStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    DefaultResultStatusEnum(String code, String message, boolean isAlarm) {
        this.code = code;
        this.message = message;
        this.isAlarm = isAlarm;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isAlarm() {
        return isAlarm;
    }
}
