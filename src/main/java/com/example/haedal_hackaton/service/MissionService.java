package com.example.haedal_hackaton.service;

import com.example.haedal_hackaton.dto.MissionResponseDto;
import com.example.haedal_hackaton.entity.Mission;
import com.example.haedal_hackaton.repository.MissionRepository;
import com.example.haedal_hackaton.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MissionService {
    private final MissionRepository missionRepository;

    @Transactional
    public MissionResponseDto findById (Long id){

        Mission entity = missionRepository.findById(id)
                .orElseThrow(()-> new
                        IllegalArgumentException("해당 미션이 없습니다. id="+id));
        return new MissionResponseDto(entity);
    }

}
