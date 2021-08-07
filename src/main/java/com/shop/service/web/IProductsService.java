package com.shop.service.web;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.dto.ProductsDTO;

@Service
public interface IProductsService {
	List<ProductsDTO> findAllProducts();
}
