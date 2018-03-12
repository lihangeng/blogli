package com.blog.dao.impl;

import com.blog.dao.intf.IBlogDao;
import com.blog.domain.Blog;

public class BlogDao extends BaseDao implements IBlogDao {

	@Override
	public int deleteByPrimaryKey(Long id) {
		return sessionTemplate.delete("com.blog.Mapper.BlogMapper.deleteByPrimaryKey", id);
	}

	@Override
	public int insert(Blog record) {
		return 0;
	}

	@Override
	public Blog selectByPrimaryKey(Long id) {
		return null;
	}

	@Override
	public int updateByPrimaryKey(Blog record) {
		return 0;
	}

}
