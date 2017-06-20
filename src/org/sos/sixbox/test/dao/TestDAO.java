package org.sos.sixbox.test.dao;

import org.sos.sixbox.entity.TestEntity;

/**
 * Created by Lodour on 17/6/21 07:20.
 * <p>
 * Test数据访问对象 - 接口
 * 封装对于test表的操作
 */
public interface TestDAO {
    /**
     * 创建测试
     *
     * @param testEntity 测试实体
     */
    void create(TestEntity testEntity);

    /**
     * 根据id获取测试实体
     *
     * @param id 测试id
     * @return 测试实体
     */
    TestEntity getById(int id);
}
