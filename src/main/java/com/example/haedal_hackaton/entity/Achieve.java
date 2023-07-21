package com.example.haedal_hackaton.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
public class Achieve {
    @Id
    private Long achieve;
    @NotNull
    private Date date;
    @JoinColumn(name="uid", referencedColumnName = "uid")
    private Long uid;

}
