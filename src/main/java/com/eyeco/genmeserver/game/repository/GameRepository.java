package com.eyeco.genmeserver.game.repository;

import com.eyeco.genmeserver.game.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
