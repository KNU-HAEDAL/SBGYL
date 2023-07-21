package com.example.haedal_hackaton.dto;

import com.example.haedal_hackaton.entity.Post;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Getter
public class PostResponseDto {
    private Long pidx;
    private String pname;
    private String pcontent;
    private Date pdate;
    private String fileuuid;
    private Long mid;
    private Long uid;

    public PostResponseDto(Post entity) {
        this.pidx = entity.getPidx();
        this.pname = entity.getPname();
        this.pcontent = entity.getPcontent();
        this.pdate = entity.getPdate();
        this.fileuuid = entity.getFileuuid();
        this.mid = entity.getMid();
        this.uid = entity.getUid();
    }
}
