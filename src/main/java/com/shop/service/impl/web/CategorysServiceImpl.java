package com.shop.service.impl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.CategorysDAO;
import com.shop.dao.ProductsDAO;
import com.shop.dto.ProductsDTO;
import com.shop.entity.CategorysEntity;
import com.shop.service.web.ICategorysService;

@Service
public class CategorysServiceImpl implements ICategorysService{
	
	@Autowired
	private CategorysDAO categorysDAO;
	@Autowired
	private ProductsDAO productDAO;
	
	@Override
	public List<CategorysEntity> findAllCategorys() {
		// TODO Auto-generated method stub
		return categorysDAO.findAllCategorys();
	}

	@Override
	public List<ProductsDTO> findProdcutsById(int id) {
		// TODO Auto-generated method stub
		return productDAO.findProductsById(id);
	}

	@Override
	public List<ProductsDTO> findProductsPaginate(int id, int start, int totalPage) {
		return productDAO.findProductsPaginate(id, start, totalPage);
	}


}
