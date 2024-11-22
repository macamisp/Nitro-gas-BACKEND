package com.gass.Controller;

import com.gass.dto.Item;
import com.gass.dto.Shop;
import com.gass.service.ItemService;
import com.gass.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin
public class ShopController {
    @Autowired
    final ShopService Service;


    @GetMapping("/get-shop")
    public List<Shop> getShop() {
        return Service.getAll();
    }

    @PostMapping("/add-/shop")
    public void addShop(@RequestBody Shop shop) {
        Service.addShop(shop);
    }


    @GetMapping("/search/shop{id}")
    public Shop getIById(@PathVariable Integer id) {
        return Service.searchShop(id);
    }

    @PutMapping("/update-/shop")
    public void updateShop(@RequestBody Shop shop) {
        Service.updateShop(shop);
    }

    @DeleteMapping("/delete-/shop{id}")
    public void deleteShop(@PathVariable Integer id) {
        Service.deleteShop(id);
    }
}
