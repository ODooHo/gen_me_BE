package com.eyeco.genmeserver.participant.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int participantId;

    private String nickname;

    private int gameId;

    private int score;

    private int isReady;

    private int image;

}
