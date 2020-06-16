package com.articlerest.articlerest.api.model.response;

public class ArticleResponse {

    private String articleId;
    private String title;
    private String description;

    public ArticleResponse() {}

    public ArticleResponse(String articleId, String title, String description) {
        this.articleId = articleId;
        this.title = title;
        this.description = description;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ArticleRest{" +
                ", articleId='" + articleId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
