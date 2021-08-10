package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shop.constant.SystemConstant;
import com.shop.dto.ProductsDTO;
import com.shop.mapper.ProductsDTOMapper;

@Repository
public class ProductsDAO extends BaseDAO {
	private StringBuffer sqlString() {
		StringBuffer varname1 = new StringBuffer();
		varname1.append("SELECT");
		varname1.append(" p.id as idproduct ");
		varname1.append(", p.idcategory ");
		varname1.append(", p.sizes ");
		varname1.append(", p.name ");
		varname1.append(", p.price ");
		varname1.append(", p.sale ");
		varname1.append(", p.title ");
		varname1.append(", p.highlight ");
		varname1.append(", p.newproduct ");
		varname1.append(", p.details ");
		varname1.append(", c.id as idcolor ");
		varname1.append(", c.name as namecolor ");
		varname1.append(", c.code as codecolor ");
		varname1.append(", c.img ");
		varname1.append(", p.createdat ");
		varname1.append(", p.updatedat ");
		varname1.append("FROM ");
		varname1.append("products AS p ");
		varname1.append("INNER JOIN ");
		varname1.append("colors AS c ");
		varname1.append("ON p.id = c.idproduct ");

		return varname1;
	}

	public String sqlNewProducts(boolean newProduct, boolean highlight) {
		StringBuffer varname1 = sqlString();
		varname1.append("WHERE 1 = 1 ");
		if (highlight) {
			varname1.append("AND p.highlight = true ");
		}
		if (newProduct) {
			varname1.append("AND p.newproduct = true ");
		}
		varname1.append("GROUP BY p.id	, c.idproduct ");
		varname1.append("ORDER BY RAND() ");
		if (highlight) {
			varname1.append("LIMIT 9 ");
		}
		if (newProduct) {
			varname1.append("LIMIT 12 ");
		}
		return varname1.toString();
	}

	public StringBuffer sqlfindAllProductsById(int id) {
		StringBuffer varname1 = sqlString();
		varname1.append("WHERE 1 = 1 ");
		varname1.append("AND idcategory = " + id + " ");

		return varname1;
	}

	public String sqlProductsPaginate(int id, int start, int totalPage) {
		StringBuffer varname1 = sqlfindAllProductsById(id);
		varname1.append("LIMIT " + start + ", " + totalPage);

		return varname1.toString();
	}

	public List<ProductsDTO> findAllProducts() {
		String sql = sqlNewProducts(SystemConstant.NO, SystemConstant.YES);
		List<ProductsDTO> productsList = jdbcTemplatee.query(sql, new ProductsDTOMapper());
		return productsList;

	}

	public List<ProductsDTO> findAllProductsById(int id) {
		String sql = sqlfindProductsById(id).toString();
		List<ProductsDTO> productsList = jdbcTemplatee.query(sql, new ProductsDTOMapper());
		return productsList;

	}

	public List<ProductsDTO> findProductsPaginate(int id, int start, int totalPage) {
		StringBuffer sqlFindById = sqlfindAllProductsById(id);
		List<ProductsDTO> productsListById = jdbcTemplatee.query(sqlFindById.toString(), new ProductsDTOMapper());
		List<ProductsDTO> productsList = new ArrayList<>();
		if(productsListById.size() > 0) {
			String sql = sqlProductsPaginate(id, start, totalPage);
			productsList = jdbcTemplatee.query(sql, new ProductsDTOMapper());
		}
		return productsList;

	}
	public String sqlfindProductsById(int id) {
		StringBuffer varname1 = sqlString();
		varname1.append("WHERE 1 = 1 ");
		varname1.append("AND p.id = " + id + " ");
		varname1.append("LIMIT 1");
		return varname1.toString();
	}
	public List<ProductsDTO> findProductsById(int id) {
		String sql = sqlfindProductsById(id);
		List<ProductsDTO> listAllProduct = jdbcTemplatee.query(sql, new ProductsDTOMapper());
		return listAllProduct;
	}
}
