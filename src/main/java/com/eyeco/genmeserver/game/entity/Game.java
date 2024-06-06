package com.eyeco.genmeserver.game.entity;

import com.eyeco.genmeserver.game.dto.GameDto;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gameId;

    private String managerNickname;

    private int memberCount;


    public static Game of(Integer gameId, String managerNickname, int memberCount){
        return new Game(gameId,managerNickname,memberCount);
    }

    public static Game of(String managerNickname, int memberCount){
        return Game.of(null,managerNickname,memberCount);
    }

}
