package com.eyeco.genmeserver.game.service;

import com.eyeco.genmeserver.common.exception.ErrorCode;
import com.eyeco.genmeserver.common.exception.GenMeApplicationException;
import com.eyeco.genmeserver.dto.StartDto;
import com.eyeco.genmeserver.game.entity.Game;
import com.eyeco.genmeserver.participant.entity.Participant;
import com.eyeco.genmeserver.game.repository.GameRepository;
import com.eyeco.genmeserver.participant.ParticipantRepository;
import com.eyeco.genmeserver.user.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;


    public String createGame(UserDto dto){
        if(dto.getIsParticipant() == 1){
            throw new GenMeApplicationException(ErrorCode.INVALID_PERMISSION);
        }
        Game.of(null, dto.getNickname(), )
        gameRepository.save(game);
        return "게임 생성에 성공했습니다.";
    }

    public String joinGame(StartDto startDto){
        Participant participant = StartDto.toParticipant(startDto);
        participantRepository.save(participant);
        return "게임 입장에 성공했습니다.";
    }
}
