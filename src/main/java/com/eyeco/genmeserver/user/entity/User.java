package com.eyeco.genmeserver.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String nickname;

    private String name;

    private int isParticipant;



    public static User of(String nickname, String name, int isParticipant){
        return new User(nickname,name,isParticipant);
    }

}
