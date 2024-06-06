package com.eyeco.genmeserver.game.controller;

import com.eyeco.genmeserver.game.service.GameService;
import com.eyeco.genmeserver.setup.dto.SetUpQuestionDto;
import com.eyeco.genmeserver.dto.ResponseDto;
import com.eyeco.genmeserver.setup.service.SetUpQuestionService;
import com.eyeco.genmeserver.user.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  TODO: 게임 생성(혹은 링크로 참여) 하는 파트 구현
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/game")
public class GameController {
    private final GameService gameService;

    private String message;

    @PostMapping("/create")
    public String createGame(@RequestBody UserDto userDto){
        gameService.createGame(userDto);

    }

    @PostMapping("/join")
    public GameDto joinGame(@RequestBody UserDto userDto)

}
