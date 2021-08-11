package com.shop.service.impl.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.CartDAO;
import com.shop.dto.CartDTO;
import com.shop.service.web.ICartService;

@Service
public class CartServiceImpl implements ICartService{
	@Autowired
	private CartDAO cartDAO;

	@Override
	public HashMap<Integer, CartDTO> addCart(int id, HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.addCart(id, cart);
	}

	@Override
	public HashMap<Integer, CartDTO> editCart(int id, int quanty, HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.editCart(id, quanty, cart);
	}

	@Override
	public HashMap<Integer, CartDTO> deleteCart(int id, HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.deleteCart(id, cart);
	}

	@Override
	public int totalQuanty(HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.totalQuanty(cart);
	}

	@Override
	public double totalPrice(HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.totalPrice(cart);
	}

}
