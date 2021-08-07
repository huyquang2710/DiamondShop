package com.shop.service.web;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.entity.SlidesEntity;

@Service
public interface ISlidesService {
		List<SlidesEntity> findAllSlides();
}
