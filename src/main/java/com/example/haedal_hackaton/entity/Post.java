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
    private Long pidx;

    @Column(length = 50, nullable = false)
    private String pname;
    @Column(length = 1000, columnDefinition = "TEXT", nullable = false)
    private String pcontent;
    @Column
    private Date pdate;
    @Column
    private String fileuuid;

    //미션 id
    @Column
    @JoinColumn(name="m_id", referencedColumnName = "m_id")
    private Long mid;
    //유저 id
    @Column
    @JoinColumn(name="uid", referencedColumnName = "uid")
    private Long uid;

    public Post(String p_name, String p_content, Date p_date,String file_uuid, Long m_id, Long uid) {
        this.pname = p_name;
        this.pcontent = p_content;
        this.pdate = p_date;
        this.fileuuid=file_uuid;
        this.mid = m_id;
        this.uid = uid;
    }

    public void update(){

    }

}
