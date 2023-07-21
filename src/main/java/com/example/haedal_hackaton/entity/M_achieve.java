package com.example.haedal_hackaton.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@NoArgsConstructor
@Entity
public class M_achieve {
    @Id
    private Long m_achieve;
    @NotNull
    private Date date;
    @JoinColumn(name="uid", referencedColumnName = "uid")
    private Long uid;

    @JoinColumn(name="m_id", referencedColumnName = "m_id")
    private Long m_id;

}
