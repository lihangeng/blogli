package com.blog.dao;

import com.blog.domain.Article;

public interface IArticleDao {
    int insert(Article record);

    int insertSelective(Article record);
}