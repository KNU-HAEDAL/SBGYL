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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long m_id;

    @Column(length = 50, nullable = false)
    private String m_name;
    @Column(length = 1000, nullable = false)
    private String m_content;
    @Column
    private Date startDate;
    @Column
    private Date endDate;

    public MissionResponseDto(Mission entity) {
        this.m_id = entity.m_id;
        this.m_name = m_name;
        this.m_content = m_content;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
