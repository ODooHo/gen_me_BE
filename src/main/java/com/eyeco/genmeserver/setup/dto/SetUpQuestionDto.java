package com.eyeco.genmeserver.setup.dto;

import com.eyeco.genmeserver.setup.entity.SetUpQuestion;
import lombok.Data;

/**
 *  셋업 단계 초기 질문 설정을 위한 DTO 클래스
 */
@Data
public class SetUpQuestionDto {
    private int setUpQuestionId;

    private int gameId;

    private int setUpQuestionNum;

    private String questionContent;

    public SetUpQuestion toEntity(){
        return new SetUpQuestion(
                this.setUpQuestionId,
                this.gameId,
                this.setUpQuestionNum,
                this.questionContent
        );
    }

}
