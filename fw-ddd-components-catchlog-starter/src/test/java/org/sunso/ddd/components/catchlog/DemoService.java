package org.sunso.ddd.components.catchlog;

import org.springframework.stereotype.Service;
import org.sunso.ddd.components.dto.Response;
import org.sunso.ddd.components.exception.BizException;

/**
 * @author sunso520
 * @Title:DemoService
 * @Description: <br>
 * @Created on 2023/12/6 17:45
 */
@Service
@CatchLog
public class DemoService {

    public Response queryEmpty() {
        return Response.ok();
    }

    public Response queryWithException() {
        throw new BizException("error");
    }
}
