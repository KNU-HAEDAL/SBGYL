package com.example.haedal_hackaton.controller;

import com.example.haedal_hackaton.dto.MissionResponseDto;
import com.example.haedal_hackaton.dto.ParticipantResponseDto;
import com.example.haedal_hackaton.entity.Mission;
import com.example.haedal_hackaton.entity.Participant;
import com.example.haedal_hackaton.repository.MissionRepository;
import com.example.haedal_hackaton.repository.ParticipantRepository;
import com.example.haedal_hackaton.repository.PostRepository;
import com.example.haedal_hackaton.service.MissionService;
import com.example.haedal_hackaton.service.ParticipantService;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ParticipantControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private ParticipantRepository participantRepository;

    @After
    public void tearDown() throws Exception{
        participantRepository.deleteAll();
    }

    @Test
    void findParticipateMission() {

        //given
        Long uid = Long.valueOf("tempUser");
        Long m_id = Long.valueOf("tempMissionId");
        Boolean post = false;

        Participant entity = new Participant(uid, m_id, post);
        ParticipantResponseDto responseDto = new ParticipantResponseDto(entity);

        Date start = Date.valueOf("2023-07-21");
        Mission missionEnt = new Mission(m_id, "temp", "tempContent", start,null);
        MissionResponseDto missionResponseDto = new MissionResponseDto(missionEnt);
        //when

        //then
    }
}
