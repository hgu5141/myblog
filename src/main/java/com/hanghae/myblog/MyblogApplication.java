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

import javax.swing.text.BadLocationException;
import java.util.List;
@EnableJpaAuditing
@SpringBootApplication
public class MyblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(MyblogRepository myblogRepository, MyblogService myblogService) {
        return (args) -> {

//            myblogRepository.save(new Myblog("황건욱", "스피링", "너무어렵다"));
//
//            List<Myblog> myblogList = myblogRepository.findAll();
//            for(int i = 0; i < myblogList.size(); i++){
//                Myblog myblog = myblogList.get(i);
//                System.out.println(myblog.getId());
//                System.out.println(myblog.getUsername());
//                System.out.println(myblog.getTitle());
//                System.out.println(myblog.getContent());
//            }
//
//            MyblogRequestDto requestDto = new MyblogRequestDto("황건욱", "커리큘럼", "스프링");
//            myblogService.update(1L, requestDto);
//            myblogList = myblogRepository.findAll();
//            for(int i = 0; i<myblogList.size(); i++){
//                Myblog myblog = myblogList.get(i);
//                System.out.println(myblog.getId());
//                System.out.println(myblog.getTitle());
//                System.out.println(myblog.getUsername());
//                System.out.println(myblog.getContent());
//            }
//
////            myblogRepository.deleteAll();
//
//            Myblog myblog = myblogRepository.findById(1L).orElseThrow(
//                    () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
//            );

        };
    }
}
