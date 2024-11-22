package com.gass.service.impl;

import com.gass.dto.Shop;
import com.gass.entity.ShopEntity;
import com.gass.repository.ShopRepository;
import com.gass.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShopIMPL implements ShopService {
    private final ShopRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Shop> getAll() {
        List<Shop> shopList = new ArrayList<>();
        repository.findAll().forEach(shopEntity ->
                shopList.add(mapper.map(shopEntity, Shop.class))
        );
        return shopList;
    }

    @Override
    public void addShop(Shop shop) {
        ShopEntity entity = mapper.map(shop, ShopEntity.class);
        repository.save(entity);
    }

    @Override
    public void updateShop(Shop shop) {
        if (repository.existsById(shop.getId())) {
            ShopEntity entity = mapper.map(shop, ShopEntity.class);
            repository.save(entity);
        } else {
            throw new IllegalArgumentException("Shop with ID " + shop.getId() + " does not exist.");
        }
    }

    @Override
    public void deleteShop(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Shop with ID " + id + " does not exist.");
        }
    }

    @Override
    public Shop searchShop(int id) {
        Optional<ShopEntity> optionalEntity = repository.findById(id);
        return optionalEntity.map(entity -> mapper.map(entity, Shop.class))
                .orElseThrow(() -> new IllegalArgumentException("Shop with ID " + id + " not found."));
    }
}
