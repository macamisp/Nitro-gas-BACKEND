package com.gass.repository;

import com.gass.entity.GassEntity;
import com.gass.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@Repository
@EnableJpaRepositories
public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {
}







