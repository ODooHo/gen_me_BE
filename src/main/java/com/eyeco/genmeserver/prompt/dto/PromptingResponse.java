package com.eyeco.genmeserver.prompt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ChatGPT api 응답값 파싱 후 프론트 측에 넘겨주는 DTO 클래스
 */
@Data
@AllArgsConstructor
public class PromptingResponse {
    private String result;
}
