package com.shop.service.web;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.shop.dto.CartDTO;

@Service
public interface ICartService {
	HashMap<Integer, CartDTO> addCart(int id, HashMap<Integer , CartDTO> cart);
	HashMap<Integer, CartDTO> editCart(int id,int quanty, HashMap<Integer , CartDTO> cart);
	HashMap<Integer, CartDTO> deleteCart(int id, HashMap<Integer , CartDTO> cart);
	int totalQuanty(HashMap<Integer, CartDTO> cart);
	double totalPrice(HashMap<Integer, CartDTO> cart);
}
