package com.example.haedal_hackaton.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
@NoArgsConstructor
@Entity
public class User {
    @Id
    private Long uid;
    @NotNull
    private String uname;

}