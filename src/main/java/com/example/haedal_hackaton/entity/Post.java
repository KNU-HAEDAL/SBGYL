package com.example.haedal_hackaton.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Getter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long p_idx;

    @Column(length = 50, nullable = false)
    private String p_name;
    @Column(length = 1000, columnDefinition = "TEXT", nullable = false)
    private String p_content;
    @Column
    private Date p_date;
    @Column
    private String file_uuid;
    @Column
    private Long m_id;
    @Column
    private Long uid;

    public Post(String p_name, String p_content, Date p_date,String file_uuid, Long m_id, Long uid) {
        this.p_name = p_name;
        this.p_content = p_content;
        this.p_date = p_date;
        this.file_uuid=file_uuid;
        this.m_id = m_id;
        this.uid = uid;
    }

    public void update(){

    }

}
