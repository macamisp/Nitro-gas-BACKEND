package com.gass.repository;

import com.gass.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface NewsRepository extends JpaRepository<NewsEntity, Integer> {
}
