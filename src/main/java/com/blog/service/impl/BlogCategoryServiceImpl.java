package com.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.intf.IBlogCategoryDao;
import com.blog.domain.BlogCategory;
import com.blog.service.intf.IBlogCategoryService;

@Service
public class BlogCategoryServiceImpl implements IBlogCategoryService {

	@Autowired
	private IBlogCategoryDao blogCategoryDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return blogCategoryDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(BlogCategory record) {
		return blogCategoryDao.insert(record);
	}

	@Override
	public BlogCategory selectByPrimaryKey(Integer id) {
		return blogCategoryDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(BlogCategory record) {
		return blogCategoryDao.updateByPrimaryKey(record);
	}

}
