package com.shop.service.web;

import org.springframework.stereotype.Service;

import com.shop.dto.PaginatesDTO;

@Service
public interface IPaginatesService {
	PaginatesDTO getPaginates(int totalData, int limit, int currentPage);
}
