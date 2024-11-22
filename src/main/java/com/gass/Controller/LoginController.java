package com.gass.Controller;

import com.gass.dto.LoginDTO;
import com.gass.service.LoginService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/employee")
@Data
@Slf4j


public class LoginController {
    @Autowired
    final LoginService service;

    @GetMapping("/get-all")
    public List<LoginDTO> getLogin(){
        return service.getAll();
    }

    @PostMapping("/add-login")
    @ResponseStatus(HttpStatus.CREATED)
    public void addLogin(@RequestBody LoginDTO login){
        log.info("updated-> {}",login);
        service.addlogin(login);
    }



}
