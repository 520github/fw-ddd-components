package org.sunso.ddd.components.catchlog;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.sunso.ddd.components.core.enums.DefaultResultStatusEnum;
import org.sunso.ddd.components.dto.Response;

/**
 * @author sunso520
 * @Title:CatchLogTest
 * @Description: <br>
 * @Created on 2023/12/6 17:47
 */
@RunWith(SpringJUnit4ClassRunner.class) //SpringRunner.class,
@SpringBootTest(classes = { CatchLogAutoConfiguration.class, DemoService.class}) //
public class CatchLogTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void queryEmptyTest() {
        Response response = demoService.queryEmpty();
        print(response);
    }

    @Test
    public void queryWithExceptionTest() {
        Response response = demoService.queryWithException();
        print(response);
        Assert.assertNotNull(response);
        Assert.assertEquals(DefaultResultStatusEnum.systemUnknownError.getCode(), response.getCode());
    }

    private void print(Response response) {
        System.out.println("response: " + response);
    }
}
