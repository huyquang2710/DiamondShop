package com.shop.service.impl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.ProductsDAO;
import com.shop.dto.ProductsDTO;
import com.shop.service.web.IProductsService;

@Service
public class ProductsServiceImpl implements IProductsService{
	@Autowired
	private ProductsDAO productsDAO;
	@Override
	public List<ProductsDTO> findAllProducts() {
		// TODO Auto-generated method stub
		return productsDAO.findAllProducts();
	}

}
