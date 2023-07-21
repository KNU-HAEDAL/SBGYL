package com.example.haedal_hackaton.repository;

import com.example.haedal_hackaton.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    List<Participant> findByUid(Long uid);
}
