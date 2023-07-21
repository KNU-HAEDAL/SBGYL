package com.example.haedal_hackaton.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Entity
public class Mission {
    @Id
    @GeneratedValue()
    private Long m_id;

    @Column(length = 50, nullable = false)
    private String m_name;

    @Column(length = 1000, nullable = false)
    private String m_content;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

}
