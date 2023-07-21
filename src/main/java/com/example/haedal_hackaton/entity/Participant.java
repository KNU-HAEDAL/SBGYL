package com.example.haedal_hackaton.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Participant {
    @Id
    private Long uid;

    @Id
    private Long m_id;

    private boolean post;

}
