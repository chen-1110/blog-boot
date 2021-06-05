package com.chen.blogboot.service.impl;

import com.chen.blogboot.entity.Article;
import com.chen.blogboot.mapper.ArticleMapper;
import com.chen.blogboot.service.ArticleService;
import com.chen.blogboot.vo.ArchiveVo;
import com.chen.blogboot.vo.CategoryVo;
import com.chen.blogboot.vo.RealArchiveVo;
import com.chen.blogboot.vo.RealCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> getArticles(String num) {
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
    public RealArchiveVo getArchives(String num) {
        int number = Integer.parseInt(num);
        int head=(number-1)*10;
        int tail=number*10;
        int count=articleMapper.getArticleCount();
        if (head>count){
            return null;
        }else if (count<tail){
            tail=count;
        }
        ArrayList<ArchiveVo> list = (ArrayList<ArchiveVo>) articleMapper.getArchives(head, tail);
        RealArchiveVo realArchiveVo=new RealArchiveVo();
        realArchiveVo.setCount(count);
        realArchiveVo.setRecordList(list);
        return realArchiveVo;
    }

    @Override
    public RealCategoryVo getCategory() {
        List<Object> categories = articleMapper.getCategories();
        RealCategoryVo realCategoryVo = new RealCategoryVo();
        realCategoryVo.setRecordList(categories);
        realCategoryVo.setCount(articleMapper.getArticleCount());
        return realCategoryVo;
    }
}
