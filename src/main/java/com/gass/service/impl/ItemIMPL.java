package com.gass.service.impl;
import com.gass.dto.Item;
import com.gass.entity.ItemEntity;
import com.gass.repository.ItemRepository;
import com.gass.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ItemIMPL implements ItemService {
    private final ItemRepository repository;
    private final ModelMapper mapper;




    @Override
    public List<Item> getAll() {
        List<Item> itemList = new ArrayList<>();
        repository.findAll().forEach( item-> itemList.add(mapper.map(item, Item.class)));
        System.out.println(itemList);
        return itemList;
    }

    @Override
    public void addItem(Item item) {
        repository.save(mapper.map(item, ItemEntity.class));

    }

    @Override
    public void updateItem(Item item) {
        repository.save(mapper.map(item, ItemEntity.class));
    }

    @Override
    public void deleteItem(int id) {
        repository.delete(repository.findById(id).get());
    }

    @Override
    public Item searchItem(int id) {
        return mapper.map(repository.findById(id).get(), Item.class);

    }
}
