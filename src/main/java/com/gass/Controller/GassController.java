package com.gass.Controller;

import com.gass.dto.Gass;
import com.gass.service.GassService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor



public class GassController {


    @Autowired
  final GassService Service;



    @GetMapping ("/get-gass")
    public Gass getGass() {
  return null;
    }


    @PostMapping("/add-gass")
    public void addgass( @RequestBody Gass gass) {
        Service.addGass(gass);
    }

}
