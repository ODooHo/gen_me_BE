package com.eyeco.genmeserver.user.service;

import com.eyeco.genmeserver.common.exception.ErrorCode;
import com.eyeco.genmeserver.common.exception.GenMeApplicationException;
import com.eyeco.genmeserver.user.dto.UserDto;
import com.eyeco.genmeserver.user.entity.User;
import com.eyeco.genmeserver.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserService {
    private final UserRepository userRepository;
    public void login(UserDto dto){
        if(userRepository.existsById(dto.getNickname())){
            throw new GenMeApplicationException(ErrorCode.NICKNAME_ALREADY_EXIST);
        }
        User user = User.of(dto.getNickname(), dto.getName(), dto.getIsParticipant());
        userRepository.save(user);
    }
}
