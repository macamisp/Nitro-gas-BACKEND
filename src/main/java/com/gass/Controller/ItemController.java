package com.gass.Controller;

import com.gass.dto.Item;
import com.gass.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin
public class ItemController {
    @Autowired
    final ItemService Service;


    @GetMapping("/get-item")
    public List<Item> getItem() {
        return Service.getAll();
    }

    @PostMapping("/add-/item")
    public void addItem(@RequestBody Item item) {
        Service.addItem(item);
    }


    @GetMapping("/search/{id}")
    public Item getIById(@PathVariable Integer id) {
        return Service.searchItem(id);
    }

    @PutMapping("/update-/item")
    public void updateItem(@RequestBody Item item) {
        Service.updateItem(item);
    }

    @DeleteMapping("/delete-/{id}")
    public void deleteItem(@PathVariable Integer id) {
        Service.deleteItem(id);
    }


}
