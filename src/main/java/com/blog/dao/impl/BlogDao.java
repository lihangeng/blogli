package com.blog.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.blog.dao.intf.IBlogDao;
import com.blog.domain.Blog;

@Repository
public class BlogDao extends BaseDao implements IBlogDao {

	@Override
	public int deleteByPrimaryKey(Long id) {
		return sessionTemplate.delete("com.blog.mapper.BlogMapper.deleteByPrimaryKey", id);
	}

	@Override
	public int insert(Blog record) {
		return sessionTemplate.insert("com.blog.mapper.BlogMapper.insert", record);
	}

	@Override
	public Blog selectByPrimaryKey(Long id) {
		return sessionTemplate.selectOne("com.blog.mapper.BlogMapper.selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKey(Blog record) {
		return sessionTemplate.update("com.blog.mapper.BlogMapper.insert", record);
	}

	@Override
	public List<Blog> selectAll() {
		return sessionTemplate.selectList("com.blog.mapper.BlogMapper.selectAll");
	}

}
