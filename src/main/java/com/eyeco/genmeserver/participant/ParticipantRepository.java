package com.eyeco.genmeserver.participant;

import com.eyeco.genmeserver.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}
