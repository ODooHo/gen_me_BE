package com.eyeco.genmeserver.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.catalina.User;

@Getter
@AllArgsConstructor
public class UserDto {
    private String nickname;

    private String name;

    private int isParticipant;


    public static UserDto of(String nickname, String name, int isParticipant){
        return new UserDto(nickname,name,isParticipant);
    }
}
