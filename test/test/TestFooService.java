package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sos.sixbox.entity.FooEntity;
import org.sos.sixbox.foo.service.FooService;
import org.sos.sixbox.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Lodour on 17/6/21 07:35.
 * 测试TestDAO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class TestFooService {
    @Autowired
    private FooService fooService;

    @Test
    public void createTest() {
        String bar = "BAR " + Utils.getCurrentTimestamp();
        fooService.create(bar);
    }

    @Test
    public void getByIdTest() {
        FooEntity fooEntity = fooService.getById(1);
        String message = String.format("%d: %s", fooEntity.getId(), fooEntity.getBar());
        System.out.println(message);
    }
}
