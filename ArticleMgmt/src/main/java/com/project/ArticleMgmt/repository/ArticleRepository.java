package com.project.ArticleMgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ArticleMgmt.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
  List<Article> findByPublished(boolean published);
  List<Article> findByTitleContaining(String title);
}