package org.sunso.ddd.components.domain;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunso520
 * @Title:DomainAutoConfiguration
 * @Description: <br>
 * @Created on 2023/12/6 10:18
 */
@Configuration
public class DomainAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean(ApplicationContextHelper.class)
    public ApplicationContextHelper applicationContextHelper() {
        return new ApplicationContextHelper();
    }
}
