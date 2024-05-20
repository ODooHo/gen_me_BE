package com.eyeco.genmeserver.setup.service;

import com.eyeco.genmeserver.dto.SetUpQuestionDto;
import com.eyeco.genmeserver.entity.SetUpQuestion;
import com.eyeco.genmeserver.setup.repository.SetUpQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SetUpQuestionService {
    private final SetUpQuestionRepository setUpQuestionRepository;

    /**
     * TODO: 예외 클래스 정의 후 처리 고려. (필터링 처리 혹은 사전(서비스 단)처리 고민) 예외 혹은 에러 처리는 어디서 하는게 좋을까
     */
//    public boolean existsByGameId(SetUpQuestionDto setUpQuestionDto){
//        return setUpQuestionRepository.existsByGameId(setUpQuestionDto.getGameId());
//    }

    public void setUp(SetUpQuestionDto setUpQuestionDto){
        SetUpQuestion entity = setUpQuestionDto.toEntity();
        setUpQuestionRepository.save(entity);
    }
}
