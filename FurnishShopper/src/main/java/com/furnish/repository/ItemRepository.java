package com.furnish.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.furnish.domain.Item;

public interface ItemRepository extends CrudRepository<Item,Long>{

	List<Item> findByTitleContaining(String keyword);

}
