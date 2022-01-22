package com.hanghae.myblog.domain;

import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@NoArgsConstructor
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

    public Long getId(){
        return this.id;
    }

    public String getUsername(){
        return username;
    }

    public String getTitle(){
        return title;
    }

    public String getContent() {
        return content;
    }


    public Blog(String username, String title, String content){
//        this.id = id;
        this.username = username;
        this.title = title;
        this.content = content;
    }

    public void update(Blog blog){
        this.title = blog.title;
        this.username = blog.username;
        this.content = blog.content;
    }



}
