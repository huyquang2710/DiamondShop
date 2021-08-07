package com.shop.service.impl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.SlidesDAO;
import com.shop.entity.SlidesEntity;
import com.shop.service.web.ISlidesService;

@Service
public class SlidesServiceImpl implements ISlidesService{
	
	@Autowired
	private SlidesDAO slidesDAO;

	@Override
	public List<SlidesEntity> findAllSlides() {
		
		return slidesDAO.findAllSlides();
	}

}
