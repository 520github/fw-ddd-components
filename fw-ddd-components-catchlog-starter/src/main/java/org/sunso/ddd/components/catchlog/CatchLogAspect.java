package org.sunso.ddd.components.catchlog;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.sunso.ddd.components.core.ResultStatusEnumInterface;
import org.sunso.ddd.components.core.enums.DefaultResultStatusEnum;
import org.sunso.ddd.components.dto.Response;
import org.sunso.ddd.components.exception.BaseException;

/**
 * @author sunso520
 * @Title:CatchLogAspect
 * @Description: <br>
 * @Created on 2023/12/6 17:20
 */

@Aspect
@Slf4j
@Order(1)
public class CatchLogAspect {
    @Pointcut("@within(CatchLog) && execution(public * *(..))")
    public void pointcut() {
    }

    @Around(value = "pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        if (log.isDebugEnabled()) {
            log.info("method[{}] start catchLog", joinPoint.getSignature().toShortString());
        }
        Object response = null;
        try {
            response = joinPoint.proceed();
        } catch (Throwable e) {
            response = handleException(joinPoint, e);
        }
        return response;
    }

    private Object handleException(ProceedingJoinPoint joinPoint, Throwable e) throws Throwable {
        MethodSignature ms = (MethodSignature) joinPoint.getSignature();
        Class<?> returnType = ms.getReturnType();

        if (!isResponseClass(returnType)) {
            throw e;
        }

        log.error(String.format("execute method[%s] exception and do catchLog", joinPoint.getSignature().toShortString()), e);

        ResultStatusEnumInterface resultStatusEnumInterface = null;
        if (e instanceof BaseException) {
            resultStatusEnumInterface = ((BaseException)e).getResultStatusEnumInterface();
        }
        if (resultStatusEnumInterface == null) {
            resultStatusEnumInterface = DefaultResultStatusEnum.systemUnknownError;
        }
        return ResponseHandlerFactory.get().handle(returnType, resultStatusEnumInterface);
     }

    private static boolean isResponseClass(Class returnType) {
        return returnType == Response.class || returnType.getGenericSuperclass() == Response.class;
    }
}
