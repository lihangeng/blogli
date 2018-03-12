package com.blog.Mapper;

import com.blog.domain.Article;

public interface ArticleMapper {
    int insert(Article record);

    int insertSelective(Article record);
}