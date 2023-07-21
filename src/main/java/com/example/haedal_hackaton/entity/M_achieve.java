package com.example.haedal_hackaton.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class M_achieve {
    @Id
    private Long m_achieve;
    private Date date;
    private Long uid;
    private Long m_id;

}
