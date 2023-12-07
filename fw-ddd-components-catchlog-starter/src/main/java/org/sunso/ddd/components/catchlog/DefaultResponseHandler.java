package org.sunso.ddd.components.catchlog;

import org.sunso.ddd.components.core.ResultStatusEnumInterface;
import org.sunso.ddd.components.dto.Response;

/**
 * @author sunso520
 * @Title:DefaultResponseHandler
 * @Description: <br>
 * @Created on 2023/12/6 16:19
 */
public class DefaultResponseHandler implements ResponseHandler {
    @Override
    public Object handle(Class returnType, ResultStatusEnumInterface resultStatusEnumInterface) {
        if (isResponseClass(returnType)) {
            return handleResponse(returnType, resultStatusEnumInterface);
        }
        return null;
    }

    private static Object handleResponse(Class returnType, ResultStatusEnumInterface resultStatusEnumInterface) {
        return Response.fail(resultStatusEnumInterface);
    }

    private static boolean isResponseClass(Class returnType) {
        return returnType == Response.class || returnType.getGenericSuperclass() == Response.class;
    }
}
