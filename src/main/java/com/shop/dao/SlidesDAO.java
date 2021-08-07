package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shop.entity.SlidesEntity;
import com.shop.mapper.SlidesMapper;

@Repository
public class SlidesDAO extends BaseDAO{
	
	public List<SlidesEntity> findAllSlides() {
		List<SlidesEntity> listSlides = new ArrayList<>();
		String sql = "SELECT * FROM slides";
		listSlides = jdbcTemplatee.query(sql, new SlidesMapper());
		return listSlides;
	}
}
