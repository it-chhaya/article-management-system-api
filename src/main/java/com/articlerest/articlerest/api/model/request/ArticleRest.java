package com.articlerest.articlerest.api.model.request;

public class ArticleRest {
    private int id;
    private String articleId;
    private String title;
    private String description;

    public ArticleRest(int id, String articleId, String title, String description) {
        this.id = id;
        this.articleId = articleId;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", articleId='" + articleId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
