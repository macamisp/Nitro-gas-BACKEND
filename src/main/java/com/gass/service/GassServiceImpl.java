package com.gass.service;

import com.fasterxml.jackson.databind.Module;
import com.gass.dto.Gass;
import com.gass.entity.GassEntity;
import com.gass.repository.GassRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor


public class GassServiceImpl implements GassService {

    private final GassRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Gass> getAll() {
        return List.of();
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
