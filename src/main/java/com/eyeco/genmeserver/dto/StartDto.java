package com.eyeco.genmeserver.dto;

import com.eyeco.genmeserver.entity.Game;
import com.eyeco.genmeserver.entity.Participant;
import com.eyeco.genmeserver.entity.User;
import lombok.Getter;

/**
 *  ? 게임 시작을 위한 DTO 클래스로 보임. 아마 SetUp으로 병합할듯
 */
@Getter
public class StartDto {
    String name;
    String nickname;
    int maxCount;
    String invitationCode;

    public static Game toGame(StartDto startDto){
        return Game.builder()
                .nickname(startDto.getNickname())
                .memberCount(startDto.getMaxCount()).build();
    }

    public static Participant toParticipant(StartDto startDto){
        return Participant.builder()
                .nickname(startDto.getNickname()).build();
    }

    public static User toUser(StartDto startDto){
        return User.builder()
                .nickname(startDto.getNickname())
                .name(startDto.getName()).build();
    }
}
