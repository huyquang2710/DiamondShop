package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginatesDTO {
	private int currentPage;
	private int limit;
	private int start;
	private int end;
	private int totalPage;
}
