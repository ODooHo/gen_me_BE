package com.eyeco.genmeserver.dto;

import lombok.*;

/**
 *  신형 프롬프트를 활용할 수 있는 DTO 클래스
 */
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRequestDto {

    private String role;

    private String content;

    @Builder
    public ChatRequestDto(String content) {
        this.role = "user";
        this.content = content;
    }
}