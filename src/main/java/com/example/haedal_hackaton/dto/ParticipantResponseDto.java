package com.example.haedal_hackaton.dto;

import com.example.haedal_hackaton.entity.Participant;
import lombok.Getter;

@Getter
public class ParticipantResponseDto {
    private Long mid;
    private Long uid;
    private boolean post;

    public ParticipantResponseDto(Participant entity) {
        this.mid = entity.getMid();
        this.uid = entity.getUid();
        this.post = entity.isPost();
    }

}
