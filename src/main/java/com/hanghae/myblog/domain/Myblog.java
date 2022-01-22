package com.hanghae.myblog.domain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Getter
@Entity
@NoArgsConstructor
public class Myblog extends Timestamped{
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령어
    @Id // id값 기본키로 사용
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;


    public Myblog(MyblogRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.content = requestDto.getContent();
    }

    public Myblog(String username, String title, String content){
        this.username = username;
        this.title = title;
        this.content = content;
    }

    public void update(MyblogRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.content = requestDto.getContent();
    }



}
