package com.eyeco.genmeserver.dto;

import lombok.*;

import java.util.List;

/**
 *  신형 프롬프트를 활용할 수 있는 DTO 클래스
 */
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatCompletionDto {

    // 사용할 모델
    private String model;

    private List<ChatRequestDto> messages;

    @Builder
    public ChatCompletionDto(List<ChatRequestDto> messages) {
        this.model = "gpt-3.5-turbo";
        this.messages = messages;
    }

}