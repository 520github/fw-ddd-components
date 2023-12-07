package org.sunso.ddd.components.dto;

import lombok.Data;
import org.sunso.ddd.components.core.ResultStatusEnumInterface;
import org.sunso.ddd.components.core.enums.DefaultResultStatusEnum;

/**
 * @author sunso520
 * @Title:Response
 * @Description: <br>
 * @Created on 2023/12/6 15:14
 */
@Data
public class Response<T>  extends BaseSerializable {

    private String code;
    private String msg;
    private T data;

    public boolean checkSuccess() {
        return DefaultResultStatusEnum.success.equals(getCode());
    }

    public boolean checkFail() {
        return !checkSuccess();
    }

    public static <T> Response<T> ok() {
        return ok(null);
    }

    public static <T> Response<T> ok(T data) {
        return newInstance(data, DefaultResultStatusEnum.success);
    }

    public static <T> Response<T> fail() {
        return fail(DefaultResultStatusEnum.systemInnerError);
    }
    public static <T> Response<T> fail(ResultStatusEnumInterface resultStatusEnumInterface) {
        return fail(null, resultStatusEnumInterface);
    }

    public static <T> Response<T> fail(T data, ResultStatusEnumInterface resultStatusEnumInterface) {
        if (resultStatusEnumInterface == null) {
            resultStatusEnumInterface = DefaultResultStatusEnum.systemUnknownError;
        }
        return newInstance(data, resultStatusEnumInterface);
    }

    private static <T> Response<T> newInstance(T data, ResultStatusEnumInterface resultStatusEnumInterface) {
        return newInstance(data, resultStatusEnumInterface.getCode(), resultStatusEnumInterface.getMessage());
    }

    private static <T> Response<T> newInstance(T data, String code, String msg) {
        Response<T> apiResult = new Response<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

}
