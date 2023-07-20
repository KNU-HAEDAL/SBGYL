package com.example.haedal_hackaton.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;

@Entity
public class Certify {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long user_id;
    @Column
    private Long mission_id;
    @Column
    private String content;

    @Builder
    public Certify(Long user_id, Long mission_id, String content) {
        this.user_id = user_id;
        this.mission_id = mission_id;
        this.content = content;
    }



}
