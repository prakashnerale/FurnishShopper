package com.furnish.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnish.domain.Item;
import com.furnish.repository.ItemRepository;
import com.furnish.service.itemService;

@Service
public class itemServiceImpl implements  itemService {
   
	@Autowired
	private ItemRepository itemRepository;
	
	
	
	@Override
	public List<Item> findAll() 
	{
		List<Item> itemList = (List<Item>) itemRepository.findAll();

		List<Item> activeItemList = new ArrayList<>();

		for (Item item : itemList)
		{
			if(item.isActive())
			{
				activeItemList.add(item);
			}
		}

		return activeItemList;
	}



	@Override
	public Item findById(Long id) 
	{

		return itemRepository.findById(id).orElse(null);
	}



	@Override
	public Item save(Item item) 
	{

		return itemRepository.save(item);
	}



	@Override
	public List<Item> blurrySearch(String keyword) 
	{
		List<Item> ItemList = itemRepository.findByTitleContaining(keyword);

		List<Item> activeItemList = new ArrayList<>();

		for (Item Item : ItemList) 
		{
			if(Item.isActive())
			{
				activeItemList.add(Item);
			}
		}

		return activeItemList;
	}



	@Override
	public void deleteById(Long id) {
		itemRepository.deleteById(id);

	}
}
