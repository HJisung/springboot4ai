package com.mysite.springboot4developer.repository;

import com.mysite.springboot4developer.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
