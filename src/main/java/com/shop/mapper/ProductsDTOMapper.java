package com.shop.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shop.dto.ProductsDTO;

public class ProductsDTOMapper implements RowMapper<ProductsDTO>{

	@Override
	public ProductsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDTO dto = new ProductsDTO();
		
		dto.setIdproduct(rs.getInt("idproduct"));
		dto.setIdcategory(rs.getInt("idcategory"));
		dto.setSizes(rs.getString("sizes"));
		dto.setName(rs.getString("name"));
		dto.setPrice(rs.getDouble("price"));
		dto.setSale(rs.getInt("sale"));
		dto.setTitle(rs.getString("title"));
		dto.setNewproduct(rs.getString("newproduct"));
		dto.setDetails(rs.getString("details"));
		dto.setIdcolor(rs.getInt("idcolor"));
		dto.setNamecolor(rs.getString("namecolor"));
		dto.setCodecolor(rs.getString("codecolor"));
		dto.setImg(rs.getString("img"));
		dto.setCreatedat(rs.getTimestamp("createdat"));
		dto.setUpdatedat(rs.getTimestamp("updatedat"));
		
		return dto;
	}

}
