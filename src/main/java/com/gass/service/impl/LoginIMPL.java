package com.gass.service.impl;

import com.gass.dto.LoginDTO;
import com.gass.entity.LoginEntity;
import com.gass.repository.LoginRepository;
import com.gass.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginIMPL implements LoginService {
    private final LoginRepository repository;
    private final ModelMapper mapper;

@Autowired
private LoginRepository loginRepository;
//@Autowired
//private PasswordEncoder passwordEncoder;

    @Override
    public List<LoginDTO> getAll() {
        List<LoginDTO> loginArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            loginArrayList.add(mapper.map(entity, LoginDTO.class));
        });
        return loginArrayList;
    }

    @Override
    public void addlogin(LoginDTO loginDTO) {
        repository.save(mapper.map(loginDTO, LoginEntity.class));
    }

    }



