package com.eyeco.genmeserver.game.controller;

import com.eyeco.genmeserver.dto.SetUpQuestionDto;
import com.eyeco.genmeserver.dto.ResponseDto;
import com.eyeco.genmeserver.setup.service.SetUpQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  TODO: 게임 생성(혹은 링크로 참여) 하는 파트 구현
 */

@RestController
@RequiredArgsConstructor
public class GameController {
    private final SetUpQuestionService setUpQuestionService;

    private String message;

    @PostMapping()
    public ResponseDto<Void> inputData(SetUpQuestionDto setUpQuestionDto){
        setUpQuestionService.setUp(setUpQuestionDto);
        return ResponseDto.success();
    }

}
