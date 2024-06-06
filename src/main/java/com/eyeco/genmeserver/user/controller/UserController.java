package com.eyeco.genmeserver.user.controller;

import com.eyeco.genmeserver.dto.ResponseDto;
import com.eyeco.genmeserver.dto.StartDto;
import com.eyeco.genmeserver.game.service.GameService;
import com.eyeco.genmeserver.login.service.LoginService;
import com.eyeco.genmeserver.user.dto.UserDto;
import com.eyeco.genmeserver.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/start")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    private String message;

    @PostMapping()
    public ResponseDto<Void> login(@RequestBody UserDto userDto){
        userService.login(userDto);
        return ResponseDto.success();
    }



}
