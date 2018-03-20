package com.blog.service.intf;

import com.blog.domain.BlogCategory;

public interface IBlogCategoryService {
	int deleteByPrimaryKey(Integer id);

	int insert(BlogCategory record);

	BlogCategory selectByPrimaryKey(Integer id);

	int updateByPrimaryKey(BlogCategory record);

}
