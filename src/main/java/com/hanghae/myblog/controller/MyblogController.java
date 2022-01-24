package com.hanghae.myblog.controller;

import com.hanghae.myblog.domain.Myblog;
import com.hanghae.myblog.domain.MyblogRepository;
import com.hanghae.myblog.domain.MyblogRequestDto;
import com.hanghae.myblog.service.MyblogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MyblogController {

    private final MyblogRepository myblogRepository;
    private final MyblogService myblogService;
    //requestDto는 생성 요청을 의미
    //정보를 가져오는 부분


    //저장하는 것은 Dto가 아니라 Myblog이니, Dto의 정보를 myblog에 담아야한다.
    @PostMapping("/api/blogs")
    public Myblog createMyblog(@RequestBody MyblogRequestDto requestDto) {
        Myblog myblog = new Myblog(requestDto);
        //jap를 이용하여 db에 저장하고, 그 결과를 반환
        return myblogRepository.save(myblog);
    }


    @GetMapping("/api/blogs")
    public List<Myblog> getBlogs(){
        return myblogRepository.findAllByOrderByModifiedAtDesc();
    }
    

    @PutMapping("/api/blogs/{id}")
    public Long updateMyblog(@PathVariable Long id, @RequestBody MyblogRequestDto requestDto){
        return myblogService.update(id, requestDto);

    }

    @DeleteMapping("api/blogs/{id}")
    public Long deleteMyblog(@PathVariable Long id){
        myblogRepository.deleteById(id);
        return id;
    }
}
