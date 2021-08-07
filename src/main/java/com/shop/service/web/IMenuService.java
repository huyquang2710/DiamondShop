package com.shop.service.web;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.entity.MenuEntity;

@Service
public interface IMenuService {
	List<MenuEntity> findAllMenu();
}
