package com.furnish.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.furnish.domain.Item;
import com.furnish.service.itemService;

@RestController

public class ItemController {
	
	@Autowired
	private itemService itemService;
	
	@RequestMapping(value="/item/add",method=RequestMethod.POST)
	public Item addItemPost(@RequestBody Item item) {
		return itemService.save(item);
	}
	

}
