package com.example.haedal_hackaton.service;

import com.example.haedal_hackaton.dto.ParticipantResponseDto;
import com.example.haedal_hackaton.entity.Participant;
import com.example.haedal_hackaton.repository.ParticipantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ParticipantService {
    private final ParticipantRepository participantRepository;

    @Transactional
    public List<Participant> findByUid(Long uid){
        List<Participant> entity = participantRepository.findByUid(uid);
        return entity;
    }
}
