package com.gass.repository;

import com.gass.entity.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Integer> {
}
