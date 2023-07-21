package com.example.haedal_hackaton.controller;

import com.example.haedal_hackaton.dto.MissionResponseDto;
import com.example.haedal_hackaton.dto.ParticipantResponseDto;
import com.example.haedal_hackaton.entity.Mission;
import com.example.haedal_hackaton.entity.Participant;
import com.example.haedal_hackaton.service.MissionService;
import com.example.haedal_hackaton.service.ParticipantService;
import com.example.haedal_hackaton.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MissionController {
    @Autowired
    private MissionService missionService;
    @Autowired
    private ParticipantService participantService;

    @GetMapping("/api/mission/{missionId}")
    public MissionResponseDto findById(@PathVariable Long missionId) {

        return missionService.findById(missionId);
    }
    //모든 미션리스트 반환할거임
    @GetMapping("/api/mission")
    public List<Mission> findAll(){
        return missionService.findAll();
    }

}
