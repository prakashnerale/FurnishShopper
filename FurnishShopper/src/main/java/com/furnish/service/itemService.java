package com.furnish.service;

import java.util.List;

import com.furnish.domain.Item;

public interface itemService {
	
	List<Item> findAll();//mapper

	Item findById(Long id);//mapper

	Item save(Item item);//mapper

	List<Item> blurrySearch(String tittle);//mapper

	void deleteById(Long id);//mapper
	
	
}
