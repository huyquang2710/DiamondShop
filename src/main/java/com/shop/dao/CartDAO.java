package com.shop.dao;

import java.util.HashMap;
import java.util.Map;

import com.shop.dto.CartDTO;
import com.shop.dto.ProductsDTO;

public class CartDAO extends BaseDAO {
	
	ProductsDAO productsDAO = new ProductsDAO();
	
	public  HashMap<Integer, CartDTO> addCart(int id, HashMap<Integer, CartDTO> cart) {
		CartDTO itemCart = new CartDTO();
		ProductsDTO productsDTO = productsDAO.findProductsByIdForCard(id);
		if (productsDTO != null) {
			itemCart.setProduct(productsDTO);
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(productsDTO.getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}
	public  HashMap<Integer, CartDTO> editCart	(int id,int quanty, HashMap<Integer, CartDTO> cart) {
		CartDTO itemCart = new CartDTO();
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			double totalPrice = quanty * itemCart.getProduct().getPrice();
			itemCart.setTotalPrice(totalPrice);
		}
		cart.put(id, itemCart);
		return cart;
	}
	public  HashMap<Integer, CartDTO> deleteCart	(int id, HashMap<Integer, CartDTO> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}
	public int totalQuanty(HashMap<Integer, CartDTO> cart) {
		int totalQuanty = 0;
		for(Map.Entry<Integer, CartDTO> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}
	
	public double totalPrice(HashMap<Integer, CartDTO> cart) {
		double totalPrice = 0;
		for(Map.Entry<Integer, CartDTO> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}
}
