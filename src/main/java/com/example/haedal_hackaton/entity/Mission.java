package com.example.haedal_hackaton.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Getter
@NoArgsConstructor
@Entity
public class Mission {
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

    public Mission(String m_name, String m_content, Date startDate, Date endDate) {
        this.m_name = m_name;
        this.m_content = m_content;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
