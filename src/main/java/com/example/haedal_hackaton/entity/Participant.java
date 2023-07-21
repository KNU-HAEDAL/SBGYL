package com.example.haedal_hackaton.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Participant {
    @Id
    @JoinColumn(name="uid", referencedColumnName = "uid")
    private Long uid;

    @Id
    @JoinColumn(name = "m_id", referencedColumnName = "m_id")
    private Long m_id;

    private boolean post;

}
