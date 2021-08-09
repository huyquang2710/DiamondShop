package com.shop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
	@RequestMapping("/san-pham/{id}")
	public ModelAndView category(@PathVariable String id) {
		ModelAndView mav = new ModelAndView("web/products/category");
		mav.addObject("categoryId", id);
		return mav;
	}
}
