package com.shop.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shop.entity.MenuEntity;

public class MenuMapper implements RowMapper<MenuEntity>{

	@Override
	public MenuEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		MenuEntity entity = new MenuEntity();
		entity.setId(rs.getInt("id"));
		entity.setName(rs.getString("name"));
		entity.setUrl(rs.getString("url"));
		return entity;
	}

}
