package com.chen.blogboot.mapper;

import com.chen.blogboot.entity.Article;
import com.chen.blogboot.vo.ArchiveVo;
import com.chen.blogboot.vo.CategoryVo;
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
    public List<Article> getArticles(int head,int tail);

    /**
     * 获取article表head到tail的事件链相关数据
     * @param head
     * @param tail
     * @return
     */
    public List<ArchiveVo> getArchives(int head, int tail);

    /**
     * 获取article表分类数据
     * @return
     */
    public List<Object> getCategories();

}
