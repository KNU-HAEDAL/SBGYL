package com.example.haedal_hackaton.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class User {
    @Id
    private Long uid;
    @NotNull
    private String u_name;

}
