package com.eyeco.genmeserver.setup.controller;

import com.eyeco.genmeserver.dto.ResponseDto;
import com.eyeco.genmeserver.setup.dto.SetUpQuestionDto;
import com.eyeco.genmeserver.setup.service.SetUpQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  초기 세팅(로그인(?) 혹은 초기 질문 세팅 및 저장.
 */
@RestController
@RequestMapping("/setUp")
@RequiredArgsConstructor
public class SetUpController {
    private final SetUpQuestionService setUpQuestionService;

    @PostMapping()
    public ResponseDto<Void> inputData(SetUpQuestionDto setUpQuestionDto){
        setUpQuestionService.setUp(setUpQuestionDto);
        return ResponseDto.success();
    }


}
