package com.shop.service.impl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.MenuDAO;
import com.shop.entity.MenuEntity;
import com.shop.service.web.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService{
	
	@Autowired
	private MenuDAO menuDAO;

	@Override
	public List<MenuEntity> findAllMenu() {
		return menuDAO.findAllMenu();
	}

}
