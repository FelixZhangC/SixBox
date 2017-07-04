package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sos.sixbox.entity.FooEntity;
import org.sos.sixbox.foo.dao.FooDAO;
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
public class TestFooDAO {
    @Autowired
    private FooDAO fooDAO;

    @Test
    public void createTest() {
        FooEntity fooEntity = new FooEntity();
        fooEntity.setBar("BAR " + Utils.getCurrentTimestamp());
        fooDAO.create(fooEntity);
    }

    @Test
    public void getByIdTest() {
        FooEntity fooEntity = fooDAO.getById(1);
        String message = String.format("%d: %s", fooEntity.getId(), fooEntity.getBar());
        System.out.println(message);
    }
}
