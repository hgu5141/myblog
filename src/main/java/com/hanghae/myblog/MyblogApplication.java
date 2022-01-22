package com.hanghae.myblog;

import com.hanghae.myblog.domain.Myblog;
import com.hanghae.myblog.domain.MyblogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MyblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(MyblogRepository repository) {
        return (args) -> {

            repository.save(new Myblog("황건욱", "스피링", "너무어렵다"));

            List<Myblog> myblogList = repository.findAll();
            for(int i = 0; i < myblogList.size(); i++){
                Myblog myblog = myblogList.get(i);
                System.out.println(myblog.getId());
                System.out.println(myblog.getUsername());
                System.out.println(myblog.getTitle());
                System.out.println(myblog.getContent());
            }

            Myblog myblog = repository.findById(2L).orElseThrow(
                    () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
            );

        };
    }
}
