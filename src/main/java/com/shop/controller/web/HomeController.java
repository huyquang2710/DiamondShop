package com.shop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.controller.BaseController;

@Controller
public class HomeController extends BaseController{

	@RequestMapping(value = {"/", "/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView index() {
		
		modelAndView.addObject("slides", slidesService.findAllSlides());
		modelAndView.addObject("categorys", categorysService.findAllCategorys());
		modelAndView.setViewName("web/home");
;		return modelAndView;
	}
}