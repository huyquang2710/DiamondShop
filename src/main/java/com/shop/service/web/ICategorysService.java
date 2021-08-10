package com.shop.service.web;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.dto.ProductsDTO;
import com.shop.entity.CategorysEntity;

@Service
public interface ICategorysService {
	List<CategorysEntity> findAllCategorys();
	List<ProductsDTO> findProdcutsById(int id);
	List<ProductsDTO> findProductsPaginate(int id, int start, int totalPage);
	
}
