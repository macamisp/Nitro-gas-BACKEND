package com.gass.Controller;

import com.gass.dto.Gass;
import com.gass.entity.GassEntity;
import com.gass.service.GassService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin

public class GassController {
    @Autowired
  final GassService Service;


    @GetMapping("/get-all")
    public List<Gass> getGass(){
        return  Service.getAll();
    }

    @PostMapping("/add-gass")
    public void addgass( @RequestBody Gass gass) {
        Service.addGass(gass);
    }

    @GetMapping("/search-by-id/{id}")
    public Gass getGassById(@PathVariable Integer id){
        return Service.searchGass(id);
    }



    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteGassById(@PathVariable Integer id){
        Service.deleteGass(id);
    }



    @PutMapping("/update-gass")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateGass(@RequestBody Gass gass){
        Service.updateGass(gass);
    }



}
