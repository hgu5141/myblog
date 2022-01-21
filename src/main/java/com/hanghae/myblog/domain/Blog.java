package com.hanghae.myblog.domain;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Blog {
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령어
    @Id // id값 기본키로 사용
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    public Blog(String username, String title, String content){
        this.username = username;
        this.title = title;
        this.content = content;
    }


}
