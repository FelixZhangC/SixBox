package org.sos.sixbox.foo.service.impl;

import org.sos.sixbox.entity.FooEntity;
import org.sos.sixbox.foo.dao.FooDAO;
import org.sos.sixbox.foo.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lodour on 17/7/4 10:39.
 * FooService的一种实现
 */
@Service
public class FooServiceImpl implements FooService {

    private final FooDAO fooDAO;

    @Autowired
    public FooServiceImpl(FooDAO fooDAO) {
        this.fooDAO = fooDAO;
    }

    /**
     * 创建foo
     *
     * @param bar bar
     */
    @Override
    public void create(String bar) {
        FooEntity fooEntity = new FooEntity();
        fooEntity.setBar(bar);
        fooDAO.create(fooEntity);
    }

    /**
     * 根据id获取foo实体
     *
     * @param id foo id
     * @return foo实体
     */
    @Override
    public FooEntity getById(int id) {
        return fooDAO.getById(id);
    }
}
