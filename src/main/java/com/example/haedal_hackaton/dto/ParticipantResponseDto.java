package com.example.haedal_hackaton.dto;

import com.example.haedal_hackaton.entity.Participant;
import lombok.Getter;

@Getter
public class ParticipantResponseDto {
    private Long m_id;
    private Long uid;
    private boolean post;

    public ParticipantResponseDto(Participant entity) {
        this.m_id = entity.getM_id();
        this.uid = entity.getUid();
        this.post = entity.isPost();
    }

}
