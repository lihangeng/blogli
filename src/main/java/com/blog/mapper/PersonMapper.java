package com.blog.mapper;

import com.blog.domain.Person;

public interface PersonMapper {
    int insert(Person record);

    int insertSelective(Person record);
}