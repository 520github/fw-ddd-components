package org.sunso.ddd.components.catchlog;

import org.sunso.ddd.components.core.ResultStatusEnumInterface;

/**
 * @author sunso520
 * @Title:ResponseHandler
 * @Description: <br>
 * @Created on 2023/12/6 16:17
 */
public interface ResponseHandler {
    Object handle(Class returnType, ResultStatusEnumInterface resultStatusEnumInterface);
}
