package com.example.haedal_hackaton.controller;

import com.example.haedal_hackaton.dto.MissionResponseDto;
import com.example.haedal_hackaton.dto.ParticipantResponseDto;
import com.example.haedal_hackaton.entity.Mission;
import com.example.haedal_hackaton.entity.Participant;
import com.example.haedal_hackaton.service.MissionService;
import com.example.haedal_hackaton.service.ParticipantService;
import com.example.haedal_hackaton.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MissionController {
    private MissionService missionService;
    private ParticipantService participantService;

    @GetMapping("/api/mission/{mission-id}")
    public MissionResponseDto findById(@PathVariable Long id) {

        return missionService.findById(id);
    }

    @GetMapping("/api/mission/{uid}/my-mission")
    public List<Mission> findByUserId(@PathVariable Long uid) {
        //ParticipantResponseDto participantResponseDto;
        List<Participant> participant = participantService.findByUid(uid);
        return missionService.findById(participantResponseDto.getM_id());
    }
}
