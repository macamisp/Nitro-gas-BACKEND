package com.gass.repository;

import com.gass.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface LoginRepository extends JpaRepository<LoginEntity, Integer> {


}
