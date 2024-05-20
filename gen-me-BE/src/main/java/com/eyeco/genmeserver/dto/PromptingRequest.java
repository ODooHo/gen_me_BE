package com.eyeco.genmeserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
 *  프론트 프롬프팅 요청 편의를 위한 DTO 클래스
 */
@Data
@AllArgsConstructor
public class PromptingRequest {
    private String nickname;
    private String question;
}
