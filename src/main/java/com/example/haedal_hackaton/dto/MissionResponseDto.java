package com.example.haedal_hackaton.dto;

import com.example.haedal_hackaton.entity.Mission;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.Date;
@Getter
public class MissionResponseDto {
    private Long m_id;

    private String m_name;
    private String m_content;
    private Date startDate;
    private Date endDate;

    public MissionResponseDto(Mission entity) {
        this.m_id = entity.getM_id();
        this.m_name = entity.getM_name();
        this.m_content = entity.getM_content();
        this.startDate = entity.getStartDate();
        this.endDate = entity.getEndDate();
    }
}
