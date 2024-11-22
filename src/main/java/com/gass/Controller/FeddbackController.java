package com.gass.Controller;

import com.gass.dto.Feedback;
import com.gass.dto.Item;
import com.gass.service.FeedbackService;
import com.gass.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin
public class FeddbackController {
    @Autowired
    final FeedbackService Service;
    @GetMapping("/get-feedback")
    public List<Feedback> getFeedback() {
        return Service.getAll();
    }
    @PostMapping("/add-feedback")
    public void addFeedback(@RequestBody Feedback feedback) {
        Service.addFeedback(feedback);
    }
    @GetMapping("/search-feedback{id}")
    public Feedback getIById(@PathVariable Integer id) {
        return Service.searchFeedback(id);
    }

    @PutMapping("/update-feedback")
    public void updateFeedback(@RequestBody Feedback feedback) {
        Service.updateFeedback(feedback);
    }

    @DeleteMapping("/delete-feedback/{id}")
    public void deleteFeedback(@PathVariable Integer id) {
        Service.deleteFeedback(id);
    }



}
