package com.chen.blogboot;

import com.chen.blogboot.mapper.AboutMapper;
import com.chen.blogboot.mapper.ArticleMapper;
import com.chen.blogboot.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogBootApplicationTests {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private AboutMapper aboutMapper;
    @Test
    public void test1(){
        System.out.println(articleMapper.getNewArticles());
        String timeMillis = System.currentTimeMillis() + "";
        String randomNum = timeMillis.substring(timeMillis.length() - 6);
        System.out.println(randomNum);
    }

    @Test
    void contextLoads() {
    }

}
