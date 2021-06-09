package com.chen.blogboot.service;

import com.chen.blogboot.dto.*;

import java.util.List;

public interface ArticleService {
    /**
     * 获取所需要的articles
     * @param num 一次取10条数据，从(num-1)*10开始取
     * @return
     */
    public List<ArticlesDto> getArticles(String num);

    /**
     * 获取所需要的时间链相关信息
     * @param num 一次取10条数据，从(num-1)*10开始取
     * @return
     */
    public RealArchiveDto getArchives(String num);

    /**
     * 获取分类相关信息
     * @return
     */
    public RealCategoryDto getCategories();

    /**
     * 获取一篇article的所有信息
     * @return
     */
    public ArticleDto getArticle(String id);

    /**
     * 获取最新的五篇article
     * @return
     */
    public List<NewArticleDto> getNewArticle();

    /**
     * 获取一个分类的十篇文章内容
     * @return
     */
    public CategoryDto getCategory(String id, String current);

}
