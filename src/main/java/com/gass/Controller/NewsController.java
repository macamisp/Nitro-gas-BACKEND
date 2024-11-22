package com.gass.Controller;

import com.gass.dto.News;
import com.gass.dto.Shop;
import com.gass.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin
public class NewsController {
    @Autowired
    final NewsService Service;

    @GetMapping("/get-news")
    public List<News> getNews() {
        return Service.getAll();
    }

    @PostMapping("/add-news")
    public ResponseEntity<Map<String, String>> addNews(@RequestBody News news) {
        try {
            System.out.println("Received news: " + news);
            Service.addNews(news);
            Map<String, String> response = new HashMap<>();
            response.put("message", "News added successfully");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }



    @GetMapping("/search/news{id}")
    public News getIById(@PathVariable Integer id) {
        return Service.searchNews(id);
    }

    @PutMapping("/update-/news")
    public void updateNews(@RequestBody News news) {
        Service.updateNews(news);
    }

    @DeleteMapping("/news/{id}")
    public ResponseEntity<Map<String, String>> deleteNews(@PathVariable Integer id) {
        try {
            Service.deleteNews(id);
            Map<String, String> response = new HashMap<>();
            response.put("message", "News deleted successfully");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }
}
