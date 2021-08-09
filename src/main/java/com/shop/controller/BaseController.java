package com.shop.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.shop.service.web.ICategorysService;
import com.shop.service.web.IMenuService;
import com.shop.service.web.IPaginatesService;
import com.shop.service.web.IProductsService;
import com.shop.service.web.ISlidesService;

@Controller
public class BaseController {
	@Autowired
	protected ICategorysService categorysService;
	@Autowired
	protected ISlidesService slidesService;
	@Autowired
	protected IMenuService menuService;
	@Autowired
	protected IProductsService productsService;
	@Autowired
	protected IPaginatesService paginatesService;
	
	
	public ModelAndView modelAndView = new ModelAndView();
	
	@PostConstruct
	public ModelAndView	init() {
		modelAndView.addObject("menu", menuService.findAllMenu());
		return modelAndView;
	}
}
