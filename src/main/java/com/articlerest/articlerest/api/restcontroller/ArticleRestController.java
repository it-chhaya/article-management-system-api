package com.articlerest.articlerest.api.restcontroller;

import com.articlerest.articlerest.api.constant.EndpointConstants;
import com.articlerest.articlerest.api.model.request.ArticleRest;
import com.articlerest.articlerest.api.model.response.ArticleResponse;
import com.articlerest.articlerest.io.database.DataCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(EndpointConstants.API_VERSION)
public class ArticleRestController {

    private DataCenter data;

    @Autowired
    public void setData(DataCenter data) {
        this.data = data;
    }

    @GetMapping("/articles/{articleId}")
    public ResponseEntity<ArticleResponse> findArticleByArticleId(
            @PathVariable String articleId) {
        ArticleResponse response = new ArticleResponse();
        for (ArticleRest article : data.getData()) {
            if (article.getArticleId().equals(articleId)) {
                response.setArticleId(article.getArticleId());
                response.setTitle(article.getTitle());
                response.setDescription(article.getDescription());
                return ResponseEntity.ok(response);
            }
        }

        return new ResponseEntity<>(new ArticleResponse(), HttpStatus.BAD_REQUEST);

    }

    @PostMapping("/articles")
    public ResponseEntity<ArticleRest> saveArticle(
            @RequestBody ArticleRest article
            ) {
        data.getData().add(article);
        return ResponseEntity.ok(article);
    }

}
