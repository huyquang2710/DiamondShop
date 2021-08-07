package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shop.entity.CategorysEntity;
import com.shop.mapper.CategorysMapper;

@Repository
public class CategorysDAO{
	@Autowired
	private JdbcTemplate jdbcTemplatee;
	
	public List<CategorysEntity> findAllCategorys() {
		List<CategorysEntity> listCategorys = new ArrayList<>();
		String sql = "SELECT * FROM categorys";
		listCategorys = jdbcTemplatee.query(sql, new CategorysMapper());
		return listCategorys;
	}

}
