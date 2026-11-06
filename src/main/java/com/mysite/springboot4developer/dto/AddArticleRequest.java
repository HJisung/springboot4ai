package com.mysite.springboot4developer.dto;


import com.mysite.springboot4developer.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;
    private String imageUrl;


    public AddArticleRequest(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Article toEntity(){
        return Article.builder().title(title).content(content).imageUrl(imageUrl).build();

    }
}
