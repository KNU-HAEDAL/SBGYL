package com.example.haedal_hackaton.service;

import com.example.haedal_hackaton.dto.MissionResponseDto;
import com.example.haedal_hackaton.entity.Mission;
import com.example.haedal_hackaton.repository.MissionRepository;
import com.example.haedal_hackaton.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MissionService {
    @Autowired
    private final MissionRepository missionRepository;

    @Transactional
    public MissionResponseDto findById (Long missionId){

        Mission entity = missionRepository.findById(missionId)
                .orElseThrow(()-> new
                        IllegalArgumentException("해당 미션이 없습니다. id="+missionId));
        return new MissionResponseDto(entity);
    }
    @Transactional
    public List<Mission> findAll() {
        return missionRepository.findAll();
    }
}
