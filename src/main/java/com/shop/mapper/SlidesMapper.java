package com.shop.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shop.entity.SlidesEntity;

public class SlidesMapper implements RowMapper<SlidesEntity>{

	@Override
	public SlidesEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		SlidesEntity entity = new SlidesEntity();
		entity.setId(rs.getInt("id"));
		entity.setImg(rs.getString("img"));
		entity.setCaption(rs.getString("caption"));
		entity.setContent(rs.getString("content"));
		return entity;
	}
	
}
