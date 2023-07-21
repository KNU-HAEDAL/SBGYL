package com.example.haedal_hackaton.dto;

import com.example.haedal_hackaton.entity.Post;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Getter
public class PostResponseDto {
    private Long p_idx;
    private String p_name;
    private String p_content;
    private Date p_date;
    private String file_uuid;
    private Long m_id;
    private Long uid;

    public PostResponseDto(Post entity) {
        this.p_idx = entity.getP_idx();
        this.p_name = entity.getP_name();
        this.p_content = entity.getP_content();
        this.p_date = entity.getP_date();
        this.file_uuid = entity.getFile_uuid();
        this.m_id = entity.getMid();
        this.uid = entity.getUid();
    }
}
