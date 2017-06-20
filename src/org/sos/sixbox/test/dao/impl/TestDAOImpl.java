package org.sos.sixbox.test.dao.impl;

import org.hibernate.SessionFactory;
import org.sos.sixbox.entity.TestEntity;
import org.sos.sixbox.test.dao.TestDAO;
import org.sos.sixbox.utils.Utils;
import org.sos.sixbox.utils.dao.DAOSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Lodour on 17/6/21 07:25.
 * <p>
 * TestDAO的一种实现
 */
@Repository
@Transactional
public class TestDAOImpl extends DAOSupport implements TestDAO {

    @Autowired
    public TestDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    /**
     * 创建测试
     *
     * @param testEntity 测试实体
     */
    @Override
    public void create(TestEntity testEntity) {
        testEntity.setCreateTime(Utils.getCurrentTimestamp());
        getSession().save(testEntity);
    }

    /**
     * 根据id获取测试实体
     *
     * @param id 测试id
     * @return 测试实体
     */
    @Override
    public TestEntity getById(int id) {
        return (TestEntity) getSession()
                .createQuery("from TestEntity where id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }
}
