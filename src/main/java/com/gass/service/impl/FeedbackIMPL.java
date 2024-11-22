package com.gass.service.impl;

import com.gass.dto.Feedback;
import com.gass.entity.FeedbackEntity;
import com.gass.repository.FeedbackRepository;
import com.gass.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FeedbackIMPL implements FeedbackService {

    private final FeedbackRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Feedback> getAll() {
        return repository.findAll()
                .stream()
                .map(entity -> mapper.map(entity, Feedback.class))
                .collect(Collectors.toList());
    }

    @Override
    public void addFeedback(Feedback feedback) {
        FeedbackEntity entity = mapper.map(feedback, FeedbackEntity.class);
        repository.save(entity);
    }

    @Override
    public void updateFeedback(Feedback feedback) {
        FeedbackEntity entity = mapper.map(feedback, FeedbackEntity.class);
        repository.save(entity);
    }

    @Override
    public void deleteFeedback(int id) {
        Optional<FeedbackEntity> entityOptional = repository.findById(id);
        if (entityOptional.isPresent()) {
            repository.delete(entityOptional.get());
        } else {
            throw new RuntimeException("Feedback not found with id: " + id);
        }
    }

    @Override
    public Feedback searchFeedback(int id) {
        Optional<FeedbackEntity> entityOptional = repository.findById(id);
        if (entityOptional.isPresent()) {
            return mapper.map(entityOptional.get(), Feedback.class);
        } else {
            throw new RuntimeException("Feedback not found with id: " + id);
        }
    }
}
