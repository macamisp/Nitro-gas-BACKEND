package com.gass.service.impl;

import com.gass.dto.Gass;
import com.gass.entity.GassEntity;
import com.gass.repository.GassRepository;
import com.gass.service.GassService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor


public class GassIMPL implements GassService {

    private final GassRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Gass> getAll() {
        List<Gass> gassList = new ArrayList<>();
        repository.findAll().forEach(gass -> gassList.add(mapper.map(gass, Gass.class)));
        System.out.println(gassList);
        return gassList;
    }

    @Override
    public void addGass(Gass gass) {

        repository.save(mapper.map(gass, GassEntity.class));
    }

    @Override
    public void updateGass(Gass gass) {

        repository.save(mapper.map(gass, GassEntity.class));
    }

    @Override
    public void deleteGass(int id) {

        repository.delete(repository.findById(id).get());
    }

    @Override
    public Gass searchGass(int id) {

        return mapper.map(repository.findById(id).get(), Gass.class);
    }
}

//SMTP Service
//Email Service
//Repo Clothify
