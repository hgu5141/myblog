package com.hanghae.myblog.service;

import com.hanghae.myblog.domain.Blog;
import com.hanghae.myblog.domain.BlogRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service    //서비스임을 명시
public class BlogService {

    //final: 서비에게 꼭 필요한 것임을 명시
    private final BlogRepository blogRepository;


    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Transactional
    public Long update(Long id, Blog blog){
        Blog blog1 = blogRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );

        blog.update(blog);
        return blog1.getId();
    }
}
