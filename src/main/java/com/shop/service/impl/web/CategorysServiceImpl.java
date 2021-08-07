package com.shop.service.impl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.CategorysDAO;
import com.shop.entity.CategorysEntity;
import com.shop.service.web.ICategorysService;

@Service
public class CategorysServiceImpl implements ICategorysService{
	
	@Autowired
	private CategorysDAO categorysDAO;

	@Override
	public List<CategorysEntity> findAllCategorys() {
		// TODO Auto-generated method stub
		return categorysDAO.findAllCategorys();
	}

}
