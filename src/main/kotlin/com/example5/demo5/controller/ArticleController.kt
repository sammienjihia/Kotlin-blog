package com.example5.demo5.controller

import com.example5.demo5.model.Article
import com.example5.demo5.repository.ArticleRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class ArticleController(private val articleRepository: ArticleRepository){

    @GetMapping("/articles")
    fun getAllArticles(): List<Article> = articleRepository.findAll()

    @PostMapping("/articles")
    fun createNewArticle(@Valid @RequestBody article: Article): Article =
            articleRepository.save(article)

    @GetMapping("/article/{id}")
    fun getArticleById(@PathVariable(value = "id") articleId: Long): ResponseEntity<Article>{
        return articleRepository.findById(articleId).map {
            article -> ResponseEntity.ok(article)
        }.orElse(ResponseEntity.notFound().build())
    }
}