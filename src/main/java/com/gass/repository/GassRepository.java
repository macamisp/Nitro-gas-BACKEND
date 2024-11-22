package com.gass.repository;

import com.gass.dto.Gass;
import com.gass.entity.GassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GassRepository extends JpaRepository<GassEntity, Integer> {
}


