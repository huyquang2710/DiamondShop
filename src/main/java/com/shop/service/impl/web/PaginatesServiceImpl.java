package com.shop.service.impl.web;

import org.springframework.stereotype.Service;

import com.shop.dto.PaginatesDTO;
import com.shop.service.web.IPaginatesService;

@Service
public class PaginatesServiceImpl implements IPaginatesService{

	@Override
	public PaginatesDTO getPaginates(int totalData, int limit, int currentPage) {
		PaginatesDTO dto = new PaginatesDTO();
		dto.setLimit(limit);
		dto.setTotalPage(setInfoTotalPage(totalData, limit)); 
//		dto.setTotalData(totalData);
		dto.setCurrentPage(checkCurrentPage(currentPage,dto.getTotalPage()));
		
		int start = findStart(dto.getCurrentPage(), limit);
		dto.setStart(start);
		int end = findEnd(dto.getStart(), limit, totalData);
		dto.setEnd(end);
		return dto;
	}
	private int findEnd(int start, int limit, int totalData ) {
		return  start + limit > totalData ? totalData : (start + limit) - 1;
	}
	
	private int findStart(int currentPage, int limit) {
		return ((currentPage - 1) * limit) + 1;
	}
	
	private int setInfoTotalPage(int totalData, int limit) {
		int totalPage = 0;
		totalPage = totalData / limit;
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
		return totalPage;
	}
	public int checkCurrentPage(int currentPage, int totalPage) {
		if (currentPage < 1) {
			return 1;
		}
		if (currentPage > totalPage) {
			return totalPage;
		}
		return currentPage;
	}
	
	

}
