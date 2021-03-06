package com.mmd.pms.common.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 所有数据库持久化操作超类
 */
@Repository
public interface BaseDao<T> {

    /**
     * 查询列表
     * @param entity
     * @return
     */
    List<T> queryList(T entity);

    /**
     * 根据ID查询数据
     * @param id 实体类的ID
     * @return
     */
    T queryById(String id);


    /**
     * 执行插入操作
     * @param entity
     * @return
     */
    Integer insert(T entity);

    /**
     * 执行更新操作
     * @param entity
     * @return
     */
    Integer update(T entity);

    /**
     * 执行删除操作
     * @param entity
     * @return
     */
    Integer delete(T entity);
}
