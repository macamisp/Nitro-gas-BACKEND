package com.gass.service;

import com.gass.dto.Feedback;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FeedbackService {
    List<Feedback> getAll();
    void addFeedback(Feedback feedback);
    void updateFeedback(Feedback feedback);
    void deleteFeedback(int id);
    Feedback searchFeedback(int id);

}
