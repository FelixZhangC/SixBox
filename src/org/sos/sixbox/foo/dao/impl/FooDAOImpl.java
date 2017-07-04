package org.sos.sixbox.foo.dao.impl;

import org.hibernate.SessionFactory;
import org.sos.sixbox.entity.FooEntity;
import org.sos.sixbox.foo.dao.FooDAO;
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
public class FooDAOImpl extends DAOSupport implements FooDAO {

    @Autowired
    public FooDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    /**
     * 创建foo
     *
     * @param fooEntity foo实体
     */
    @Override
    public void create(FooEntity fooEntity) {
        fooEntity.setCreateTime(Utils.getCurrentTimestamp());
        getSession().save(fooEntity);
    }

    /**
     * 根据id获取foo实体
     *
     * @param id foo id
     * @return foo实体
     */
    @Override
    public FooEntity getById(int id) {
        return (FooEntity) getSession()
                .createQuery("from FooEntity where id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }
}
