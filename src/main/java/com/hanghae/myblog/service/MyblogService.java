package com.hanghae.myblog.service;

import com.hanghae.myblog.domain.Myblog;
import com.hanghae.myblog.domain.MyblogRepository;
import com.hanghae.myblog.domain.MyblogRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service    //서비스임을 명시
public class MyblogService {

    //final: 서비에게 꼭 필요한 것임을 명시
    private final MyblogRepository myblogRepository;


    @Transactional
    public Long update(Long id, MyblogRequestDto requestDto){
        Myblog myblog1 = myblogRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );

        myblog1.update(requestDto);
        return myblog1.getId();
    }

}
