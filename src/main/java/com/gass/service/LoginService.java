package com.gass.service;

import com.gass.dto.LoginDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoginService {
    List<LoginDTO> getAll();
    void addlogin(LoginDTO loginDTO);
}
