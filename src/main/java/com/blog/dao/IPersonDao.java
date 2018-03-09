package com.blog.dao;

import com.blog.domain.Person;

public interface IPersonDao {
    int insert(Person record);

    int insertSelective(Person record);
}