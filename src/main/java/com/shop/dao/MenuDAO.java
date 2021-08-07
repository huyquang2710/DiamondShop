package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shop.entity.MenuEntity;
import com.shop.mapper.MenuMapper;

@Repository
public class MenuDAO extends BaseDAO{
	public List<MenuEntity> findAllMenu() {
		List<MenuEntity> menuList = new ArrayList<>();
		String sql = "SELECT * FROM menu";
		menuList = jdbcTemplatee.query(sql, new MenuMapper());
		return menuList;
	}

}
