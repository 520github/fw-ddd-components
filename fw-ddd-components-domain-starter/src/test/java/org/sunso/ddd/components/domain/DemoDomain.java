package org.sunso.ddd.components.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sunso520
 * @Title:DemoDomain
 * @Description: <br>
 * @Created on 2023/12/6 10:26
 */
@Domain
@Data
public class DemoDomain {
    private String name;

    @Autowired
    private DemoService demoService;


    public int getDemoNum() {
        return demoService.getDemoNum();
    }
}
