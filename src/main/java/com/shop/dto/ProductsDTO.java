package com.shop.dto;


import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDTO {
	private int idproduct;
	private int idcategory;
	private String sizes;
	private String name;
	private double price;
	private int sale;
	private String title;
	private int highlight;
	private String newproduct;
	private String details;
	private int idcolor;
	private String namecolor;
	private String codecolor;
	private String img;
	private Timestamp createdat;
	private Timestamp updatedat;
}
