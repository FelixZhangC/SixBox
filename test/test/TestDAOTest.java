package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sos.sixbox.entity.TestEntity;
import org.sos.sixbox.test.dao.TestDAO;
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
public class TestDAOTest {
    @Autowired
    private TestDAO testDAO;

    @Test
    public void createTest() {
        TestEntity testEntity = new TestEntity();
        testEntity.setTitle("测试标题");
        testEntity.setContent("测试内容 - " + Utils.getCurrentTimestamp());
        testDAO.create(testEntity);
    }

    @Test
    public void getByIdTest() {
        TestEntity testEntity = testDAO.getById(1);
        String message = String.format("%d: %s", testEntity.getId(), testEntity.getContent());
        System.out.println(message);
    }
}
