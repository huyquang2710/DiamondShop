package com.shop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.controller.BaseController;
import com.shop.dto.PaginatesDTO;

@Controller
public class CategoryController extends BaseController{
	private int totalProductsPage = 9;
	@RequestMapping("/san-pham/{id}")
	public ModelAndView category(@PathVariable String id) {
		
		modelAndView.setViewName("web/products/category");
		
		//Phan trang
		int totalData = categorysService.findProdcutsById(Integer.parseInt(id)).size();
		PaginatesDTO paginatesDTO = paginatesService.getPaginates(totalData, totalProductsPage, 1);
		modelAndView.addObject("paginatesDTO", paginatesDTO);
		modelAndView.addObject("idCategory", id);
		modelAndView.addObject("allProductsPaginate", categorysService.findProductsPaginate(Integer.parseInt(id), paginatesDTO.getStart(), totalProductsPage));
		return modelAndView;
	}
	@RequestMapping("/san-pham/{id}/{currentPage}")
	public ModelAndView category(@PathVariable String id,@PathVariable String currentPage) {
		
		
		modelAndView.setViewName("web/products/category");
		
		//Phan trang
		int totalData = categorysService.findProdcutsById(Integer.parseInt(id)).size();
		PaginatesDTO paginatesDTO = paginatesService.getPaginates(totalData, totalProductsPage, Integer.parseInt(currentPage));
		modelAndView.addObject("paginatesDTO", paginatesDTO);
		modelAndView.addObject("idCategory", id);
		modelAndView.addObject("allProductsPaginate", categorysService.findProductsPaginate(Integer.parseInt(id),paginatesDTO.getStart(), paginatesDTO.getEnd()));
		return modelAndView;
	}
}
