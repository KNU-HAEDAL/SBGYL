package com.example.haedal_hackaton.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Participant {
    @Id
    @JoinColumn(name="uid", referencedColumnName = "uid")
    private Long uid;

    @Id
    @JoinColumn(name = "m_id", referencedColumnName = "m_id")
    private Long m_id;

    @Column
    private boolean post;

    public Participant(Long uid, Long m_id, boolean post) {
        this.uid = uid;
        this.m_id = m_id;
        this.post = post;
    }
}
