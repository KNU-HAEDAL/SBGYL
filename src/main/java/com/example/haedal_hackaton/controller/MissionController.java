package com.example.haedal_hackaton.controller;

import com.example.haedal_hackaton.dto.MissionResponseDto;
import com.example.haedal_hackaton.service.MissionService;
import com.example.haedal_hackaton.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MissionController {
    private MissionService missionService;

    @GetMapping("/api/mission/{mission-id}")
    public MissionResponseDto findById(@PathVariable Long id){
        return missionService.findById(id);
}
