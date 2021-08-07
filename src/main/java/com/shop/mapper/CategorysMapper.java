package com.shop.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shop.entity.CategorysEntity;

public class CategorysMapper implements RowMapper<CategorysEntity>{

	@Override
	public CategorysEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		CategorysEntity entity = new CategorysEntity();
		entity.setId(rs.getInt("id"));
		entity.setName(rs.getString("name"));
		entity.setDescription(rs.getString("description"));
		return entity;
	}

}
