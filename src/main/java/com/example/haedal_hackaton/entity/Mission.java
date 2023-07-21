package com.example.haedal_hackaton.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;
@Getter
@NoArgsConstructor
@Entity
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;

    @NotNull
    @Column(length = 50, nullable = false)
    private String mname;

    @NotNull
    @Column(length = 1000, nullable = false)
    private String mcontent;

    @NotNull
    @Column
    private Date startDate;

    @Column
    private Date endDate;

    public Mission(String m_name, String m_content, Date startDate, Date endDate) {
        this.mname = m_name;
        this.mcontent = m_content;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Mission(Long m_id, String m_name, String m_content, Date startDate, Date endDate) {
        this.mid = m_id;
        this.mname = m_name;
        this.mcontent = m_content;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
