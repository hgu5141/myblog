package com.hanghae.myblog;

import com.hanghae.myblog.domain.Blog;
import com.hanghae.myblog.domain.BlogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MyblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(BlogRepository repository) {
        return (args) -> {

            repository.save(new Blog("황건욱", "스피링", "너무어렵다"));

            List<Blog> blogList = repository.findAll();
            for(int i = 0; i < blogList.size(); i++){
                Blog blog = blogList.get(i);
                System.out.println(blog.getId());
                System.out.println(blog.getUsername());
                System.out.println(blog.getTitle());
                System.out.println(blog.getContent());
            }

            Blog blog = repository.findById(2L).orElseThrow(
                    () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
            );

        };
    }
}
