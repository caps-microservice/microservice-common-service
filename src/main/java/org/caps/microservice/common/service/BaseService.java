package org.caps.microservice.common.service;

import com.github.pagehelper.PageInfo;

public interface BaseService<T> {
    int insert(T t, String createBy);

    int delete(T t);

    int update(T t, String updateBy);

    int count(T t);

    T selectOne(T t);

    PageInfo<T> page(int pageNum, int pageSize, T t);
}
