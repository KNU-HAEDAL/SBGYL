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
    private Long mid;

    private String mname;
    private String mcontent;
    private Date startDate;
    private Date endDate;

    public MissionResponseDto(Mission entity) {
        this.mid = entity.getMid();
        this.mname = entity.getMname();
        this.mcontent = entity.getMcontent();
        this.startDate = entity.getStartDate();
        this.endDate = entity.getEndDate();
    }
}
