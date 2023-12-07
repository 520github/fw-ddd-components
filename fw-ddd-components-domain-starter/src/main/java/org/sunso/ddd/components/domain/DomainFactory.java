package org.sunso.ddd.components.domain;

/**
 * @author sunso520
 * @Title:DomainFactory
 * @Description: <br>
 * @Created on 2023/12/6 10:17
 */
public class DomainFactory {
    public static <T> T create(Class<T> entityClz){
        return ApplicationContextHelper.getBean(entityClz);
    }
}
