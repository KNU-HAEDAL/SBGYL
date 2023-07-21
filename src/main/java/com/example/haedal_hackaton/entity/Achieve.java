package com.example.haedal_hackaton.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Achieve {
    @Id
    private Long achieve;
    private Date date;
    private Long uid;

}
