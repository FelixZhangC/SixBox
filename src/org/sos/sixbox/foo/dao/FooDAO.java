package org.sos.sixbox.foo.dao;

import org.sos.sixbox.entity.FooEntity;

/**
 * Created by Lodour on 17/6/21 07:20.
 * <p>
 * foo数据访问对象 - 接口
 * 封装对于foo表的操作
 */
public interface FooDAO {
    /**
     * 创建foo
     *
     * @param fooEntity foo实体
     */
    void create(FooEntity fooEntity);

    /**
     * 根据id获取foo实体
     *
     * @param id foo id
     * @return foo实体
     */
    FooEntity getById(int id);
}
