package com.eyeco.genmeserver.setup.repository;

import com.eyeco.genmeserver.setup.entity.SetUpQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SetUpQuestionRepository extends JpaRepository<SetUpQuestion, Integer> {
    boolean existsByGameId(int gameId);

}
