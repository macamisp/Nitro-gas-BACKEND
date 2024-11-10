package com.gass.service;

import com.gass.dto.Gass;

import java.util.List;

public interface GassService {
  List<Gass> getAll();
  void addGass(Gass gass);
  void updateGass(Gass gass);
  void deleteGass(int id);
  Gass searchGass(int id);
}
