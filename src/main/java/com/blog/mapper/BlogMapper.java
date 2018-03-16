package com.blog.mapper;

import java.util.List;

import com.blog.domain.Blog;

public interface BlogMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Blog record);

	int insertSelective(Blog record);

	Blog selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Blog record);

	int updateByPrimaryKey(Blog record);

	List<Blog> selectAll();
}