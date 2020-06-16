package com.articlerest.articlerest.io.database;

import com.articlerest.articlerest.api.model.request.ArticleRest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataCenter {

    private static List<ArticleRest> data;

    static {
        data = new ArrayList<>();
    }

    public List<ArticleRest> getData() {
        return data;
    }

}
