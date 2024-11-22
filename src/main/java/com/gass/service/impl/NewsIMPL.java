package com.gass.service.impl;
import com.gass.dto.News;
import com.gass.entity.NewsEntity;
import com.gass.repository.NewsRepository;
import com.gass.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsIMPL implements NewsService {
    private final NewsRepository repository;
    private final ModelMapper mapper;



    @Override
    public void addNews(News news) {
        repository.save(mapper.map(news, NewsEntity.class));
    }

    @Override
    public void updateNews(News news) {
        repository.save(mapper.map(news, NewsEntity.class));
    }

    @Override
    public void deleteNews(int id) {
        repository.delete(repository.findById(id).get());
    }



    @Override
    public List<News> getAll() {
        List<News> newsList = new ArrayList<>();
        repository.findAll().forEach( news-> newsList.add(mapper.map(news, News.class)));
        System.out.println(newsList);
        return newsList;
    }

    @Override
    public News searchNews(int id) {
        return mapper.map(repository.findById(id).get(), News.class);

    }
}
