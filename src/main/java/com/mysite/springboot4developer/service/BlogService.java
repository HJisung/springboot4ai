package com.mysite.springboot4developer.service;


import com.mysite.springboot4developer.domain.Article;
import com.mysite.springboot4developer.dto.AddArticleRequest;
import com.mysite.springboot4developer.dto.UpdateArticleRequest;
import com.mysite.springboot4developer.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    public Article findById(long id){
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found" + id));
    }
    public void delete(long id){
        blogRepository.deleteById(id);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not fount: " + id));
        article.update(request.getTitle(),request.getContent(),request.getImageUrl());
        return article;
    }
}
