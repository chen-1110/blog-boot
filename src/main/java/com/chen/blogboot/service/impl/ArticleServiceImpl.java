package com.chen.blogboot.service.impl;

import com.chen.blogboot.entity.Article;
import com.chen.blogboot.entity.Category;
import com.chen.blogboot.entity.OtherArticle;
import com.chen.blogboot.dto.*;
import com.chen.blogboot.mapper.ArticleMapper;
import com.chen.blogboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<ArticlesDto> getArticles(String num) {
        int number = Integer.parseInt(num);
        int head=(number-1)*10;
        int tail=number*10;
        int count=articleMapper.getArticleCount();
        if (head>count){
            return null;
        }else if (count<tail){
            tail=count;
        }
        return articleMapper.getArticles(head,tail);
    }

    @Override
    public RealArchiveDto getArchives(String num) {
        int number = Integer.parseInt(num);
        int head=(number-1)*10;
        int tail=number*10;
        int count=articleMapper.getArticleCount();
        if (head>count){
            return null;
        }else if (count<tail){
            tail=count;
        }
        ArrayList<ArchiveDto> list = (ArrayList<ArchiveDto>) articleMapper.getArchives(head, tail);
        RealArchiveDto realArchiveDto =new RealArchiveDto();
        realArchiveDto.setCount(count);
        realArchiveDto.setRecordList(list);
        return realArchiveDto;
    }

    @Override
    public RealCategoryDto getCategories() {
        List<Object> categories = articleMapper.getCategories();
        RealCategoryDto realCategoryDto = new RealCategoryDto();
        realCategoryDto.setRecordList(categories);
        realCategoryDto.setCount(articleMapper.getArticleCount());
        return realCategoryDto;
    }

    @Override
    public ArticleDto getArticle(String id) {
        Article article = articleMapper.getArticle(id);
        ArticleDto articleDto = new ArticleDto();
        articleDto.setId(article.getId());
        articleDto.setArticleTitle(article.getArticleTitle());
        articleDto.setCreateDate(article.getCreateDate());
        articleDto.setUpdateDate(article.getUpdateDate());
        articleDto.setCategoryId(article.getCategoryId());
        articleDto.setCategoryName(article.getCategoryName());
        articleDto.setViewsCount(article.getViewCount());
        articleDto.setArticleContent(article.getArticleContent());
        articleDto.setArticleCover(article.getArticleCover());
        articleDto.setLikeCount(article.getLikeCount());
        OtherArticle lastArticle=null;
        OtherArticle nextArticle=null;
        if(article.getLastArticleId().equals("0")){
            lastArticle=new OtherArticle("0","0","0");
        }else {
            lastArticle = articleMapper.getOtherArticle(article.getLastArticleId());
        }
        if(article.getNextArticleId().equals("0")){
            nextArticle=new OtherArticle("0","0","0");
        }else {
            nextArticle = articleMapper.getOtherArticle(article.getNextArticleId());
        }
        articleDto.setLastArticle(lastArticle);
        articleDto.setNextArticle(nextArticle);
        return articleDto;
    }

    @Override
    public List<NewArticleDto> getNewArticle() {
        return articleMapper.getNewArticles();
    }

    @Override
    public CategoryDto getCategory(String id, String current) {
        int categoryCount = articleMapper.getCategoryCount(id);
        int head=Integer.parseInt(current)*10;
        int tail=(Integer.parseInt(current)+1)*10;
        if (categoryCount<head){
            return null;
        }else if (categoryCount<tail){
            tail=categoryCount;
        }
        List<Category> category = articleMapper.getCategory(id,head,tail);
        CategoryDto categoryDto = new CategoryDto();
        if (!category.isEmpty()){
            categoryDto.setName(category.get(0).getCategoryName());
        }
        categoryDto.setArticlePreviewDTOList(category);
        return categoryDto;
    }

    @Override
    public void addArticleLike(String articleId) {
        articleMapper.addArticleLike(articleId);
    }


}
