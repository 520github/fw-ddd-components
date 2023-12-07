package org.sunso.ddd.components.core;

/**
 * @author sunso520
 * @Title:StatusCodeInterface
 * @Description: <br>
 * @Created on 2023/12/6 11:23
 */
public interface ResultStatusEnumInterface {

    String getCode();

    String getMessage();

    boolean isAlarm();
}
