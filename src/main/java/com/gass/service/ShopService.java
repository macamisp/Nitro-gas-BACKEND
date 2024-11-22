package com.gass.service;

import com.gass.dto.Shop;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ShopService {
    List<Shop> getAll();
    void addShop(Shop shop);
    void updateShop(Shop shop);
    void deleteShop(int id);
    Shop searchShop(int id);
}
