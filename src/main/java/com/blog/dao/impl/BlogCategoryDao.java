package com.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.blog.dao.intf.IBlogCategoryDao;
import com.blog.domain.BlogCategory;

@Repository
public class BlogCategoryDao extends BaseDao implements IBlogCategoryDao {

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return sessionTemplate.delete("com.blog.mapper.BlogCategoryMapper.deleteByPrimaryKey", id);
	}

	@Override
	public int insert(BlogCategory record) {
		return sessionTemplate.insert("com.blog.mapper.BlogCategoryMapper.insert", record);
	}

	@Override
	public BlogCategory selectByPrimaryKey(Integer id) {
		return sessionTemplate.selectOne("com.blog.mapper.BlogCategoryMapper.selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKey(BlogCategory record) {
		return sessionTemplate.update("com.blog.mapper.BlogCategoryMapper.updateByPrimaryKey", record);
	}


}
