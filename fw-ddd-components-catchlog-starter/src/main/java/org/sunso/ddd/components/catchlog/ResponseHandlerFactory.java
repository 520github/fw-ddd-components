package org.sunso.ddd.components.catchlog;

/**
 * @author sunso520
 * @Title:ResponseHandlerFactory
 * @Description: <br>
 * @Created on 2023/12/6 17:19
 */
public class ResponseHandlerFactory {
    public static ResponseHandler get(){
        if(ApplicationContextHelper.getBean(ResponseHandler.class) != null){
            return ApplicationContextHelper.getBean(ResponseHandler.class);
        }
        return new DefaultResponseHandler();
    }
}
