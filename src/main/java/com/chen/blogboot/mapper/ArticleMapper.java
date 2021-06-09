package com.chen.blogboot.mapper;

import com.chen.blogboot.entity.Article;
import com.chen.blogboot.entity.Category;
import com.chen.blogboot.entity.OtherArticle;
import com.chen.blogboot.dto.ArticlesDto;
import com.chen.blogboot.dto.ArchiveDto;
import com.chen.blogboot.dto.NewArticleDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface ArticleMapper {
    /**
     * 获取article表数据条数
     * @return
     */
    public int getArticleCount();
    /**
     * 获取article表head到tail的数据
     * @param head
     * @param tail
     * @return
     */
    public List<ArticlesDto> getArticles(int head, int tail);

    /**
     * 获取article表head到tail的事件链相关数据
     * @param head
     * @param tail
     * @return
     */
    public List<ArchiveDto> getArchives(int head, int tail);

    /**
     * 获取article表分类数据
     * @return
     */
    public List<Object> getCategories();

    /**
     * 获取一篇article的所有信息
     * @param id
     * @return
     */
    public Article getArticle(String id);

    /**
     * 获取其他article的缩略信息
     * @param id
     * @return
     */
    public OtherArticle getOtherArticle(String id);

    /**
     * 获取最新的五篇article
     * @return
     */
    public List<NewArticleDto> getNewArticles();

    /**
     * 获取某一个分类的十篇文章信息
     * @return
     */
    public List<Category> getCategory(String id,int head,int tail);

    /**
     * 获取某一个分类拥有的文章数量
     * @param id
     * @return
     */
    public int getCategoryCount(String id);

}
