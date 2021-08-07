package com.shop.service.web;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.entity.CategorysEntity;

@Service
public interface ICategorysService {
	List<CategorysEntity> findAllCategorys();
}
