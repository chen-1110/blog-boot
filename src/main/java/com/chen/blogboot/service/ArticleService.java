package com.chen.blogboot.service;

import com.chen.blogboot.entity.Article;
import com.chen.blogboot.vo.ArchiveVo;
import com.chen.blogboot.vo.CategoryVo;
import com.chen.blogboot.vo.RealArchiveVo;
import com.chen.blogboot.vo.RealCategoryVo;

import java.util.List;

public interface ArticleService {
    /**
     * 获取所需要的articles
     * @param num 一次取10条数据，从(num-1)*10开始取
     * @return
     */
    public List<Article> getArticles(String num);

    /**
     * 获取所需要的时间链相关信息
     * @param num 一次取10条数据，从(num-1)*10开始取
     * @return
     */
    public RealArchiveVo getArchives(String num);

    /**
     * 获取分类相关信息
     * @return
     */
    public RealCategoryVo getCategory();
}
