package com.gass.service;


import com.gass.dto.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    List<Item> getAll();
    void addItem(Item item);
    void updateItem(Item item);
    void deleteItem(int id);
    Item searchItem(int id);
}
