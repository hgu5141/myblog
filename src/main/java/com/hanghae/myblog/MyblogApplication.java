package com.hanghae.myblog;

import com.hanghae.myblog.domain.Myblog;
import com.hanghae.myblog.domain.MyblogRepository;
import com.hanghae.myblog.domain.MyblogRequestDto;
import com.hanghae.myblog.service.MyblogService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(MyblogRepository myblogRepository, MyblogService myblogService) {
        return (args) -> {
        };
    }
}
