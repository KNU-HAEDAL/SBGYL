package com.example.haedal_hackaton.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
@IdClass(Participant.class)
public class Participant {
    @Id
    @JoinColumn(name="uid", referencedColumnName = "uid")
    private Long uid;

    @Id
    @JoinColumn(name = "m_id", referencedColumnName = "m_id")
    private Long mid;

    @Column
    private boolean post;

    public Participant(Long uid, Long m_id, boolean post) {
        this.uid = uid;
        this.mid = m_id;
        this.post = post;
    }
}
