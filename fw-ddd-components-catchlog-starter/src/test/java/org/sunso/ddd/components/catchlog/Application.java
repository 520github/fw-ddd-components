package org.sunso.ddd.components.catchlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sunso.ddd.components.dto.Response;

/**
 * @author sunso520
 * @Title:Test
 * @Description: <br>
 * @Created on 2023/12/6 17:17
 */
@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("run success");
        DemoService demoService = ApplicationContextHelper.getBean(DemoService.class);
        Response response = demoService.queryWithException();
        log.info("response[{}]", response);
    }
}
