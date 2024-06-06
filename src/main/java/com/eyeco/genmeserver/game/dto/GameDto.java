package com.eyeco.genmeserver.game.dto;


import com.eyeco.genmeserver.game.entity.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GameDto {
    private Integer gameId;

    private String managerNickname;

    private int memberCount;

    public static GameDto of(Integer gameId, String managerNickname, int memberCount) {
        return new GameDto(gameId, managerNickname, memberCount);
    }

    public static GameDto from(Game entity) {
        return GameDto.of(
                entity.getGameId(),
                entity.getManagerNickname(),
                entity.getMemberCount()
        );
    }
}
