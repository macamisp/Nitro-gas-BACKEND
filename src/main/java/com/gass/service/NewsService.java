package com.gass.service;

import com.gass.dto.News;
import com.gass.dto.Shop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {
    void addNews(News news);
    void updateNews(News news);
    void deleteNews(int id);
    List<News> getAll();
    News searchNews(int id);


}
