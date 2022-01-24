package com.hanghae.myblog.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class MyblogRequestDto {
    private final String title;
    private final String username;
    private final String contents;
}


