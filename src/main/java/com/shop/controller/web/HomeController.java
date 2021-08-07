package com.shop.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.service.web.ICategorysService;
import com.shop.service.web.ISlidesService;

@Controller
public class HomeController {
	
	@Autowired
	ICategorysService categorysService;
	@Autowired
	ISlidesService slidesService;

	@RequestMapping(value = {"/", "/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("web/home");
		mav.addObject("slides", slidesService.findAllSlides());
		mav.addObject("categorys", categorysService.findAllCategorys());
		return mav;
	}
}