package com.shopproject.shop.repo;

import com.shopproject.shop.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository <Item, Long> {
}
