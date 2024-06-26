package com.eyeco.genmeserver.prompt.controller;

import com.eyeco.genmeserver.prompt.dto.gpt.CompletionDto;
import com.eyeco.genmeserver.prompt.dto.PromptingRequest;
import com.eyeco.genmeserver.prompt.dto.PromptingResponse;
import com.eyeco.genmeserver.prompt.service.ChatGPTService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 *  Chatty API 연동 및 프론트 측 요청 값 파싱과 응답 값 파싱을 담당하는 파트
 */

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/chatGpt")
public class ChatGPTController {

    private final ChatGPTService chatGPTService;

    public ChatGPTController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }


    /**
     * [API] Legacy ChatGPT 프롬프트 명령을 수행합니다. : gpt-3.5-turbo-instruct, babbage-002, davinci-002
     *
     * @param completionDto {}
     * @return ResponseEntity<Map < String, Object>>
     */
    @PostMapping("/legacyPrompt")
    public ResponseEntity<Map<String, Object>> selectLegacyPrompt(@RequestBody CompletionDto completionDto) {
        log.debug("param :: " + completionDto.toString());
        Map<String, Object> result = chatGPTService.legacyPrompt(completionDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * [API] 최신 ChatGPT 프롬프트 명령어를 수행합니다. : gpt-4, gpt-4 turbo, gpt-3.5-turbo
     *
     * @param request
     * @return 
     */
    @PostMapping("/prompt")
    public ResponseEntity<PromptingResponse> selectPrompt(@RequestBody PromptingRequest request) {
//        log.debug("param :: " + chatCompletionDto.toString());
        PromptingResponse result = chatGPTService.prompt(request);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}