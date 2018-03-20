package com.blog.dao.intf;

import com.blog.domain.BlogCategory;

public interface IBlogCategoryDao {

	int deleteByPrimaryKey(Integer id);

	int insert(BlogCategory record);

	BlogCategory selectByPrimaryKey(Integer id);

	int updateByPrimaryKey(BlogCategory record);

}
