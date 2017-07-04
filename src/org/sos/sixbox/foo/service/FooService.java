package org.sos.sixbox.foo.service;

import org.sos.sixbox.entity.FooEntity;

/**
 * Created by Lodour on 17/6/21 07:33.
 * <p>
 * foo服务 - 接口
 * 定义在Action中针对foo所需使用的服务接口
 */
public interface FooService {
    /**
     * 创建foo
     *
     * @param bar bar
     */
    void create(String bar);

    /**
     * 根据Id获取foo实体
     *
     * @param id foo id
     * @return foo实体
     */
    FooEntity getById(int id);
}
