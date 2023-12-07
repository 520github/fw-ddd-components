package org.sunso.ddd.components.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunso520
 * @Title:ApplicationTest
 * @Description: <br>
 * @Created on 2023/12/6 10:25
 */
@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        DemoDomain domain = DomainFactory.create(DemoDomain.class);
        log.info("demo num [{}]", domain.getDemoNum());
        Assert.assertEquals(100, domain.getDemoNum());
    }

}
