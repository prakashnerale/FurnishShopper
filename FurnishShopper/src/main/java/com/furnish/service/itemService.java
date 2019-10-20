package com.furnish.service;

import java.util.List;

import com.furnish.domain.Item;

public interface itemService {
	
	      List<Item> findAll();
	
	      Item findById(Long id);
	      
	      Item save(Item item);
	      
	      List<Item> blurrySearch(String tittle);
	      
	      void deleteById(Long id);
	
	
}
