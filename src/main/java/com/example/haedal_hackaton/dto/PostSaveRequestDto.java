package com.example.haedal_hackaton.dto;

import com.example.haedal_hackaton.entity.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter //getter함수 구현 대신해주는 어노테이션
@NoArgsConstructor //생성자 구현 대신 해주는 어노테이션
public class PostSaveRequestDto {
    private String p_name;
    private String p_content;
    private String file_uuid;
    private Date p_date;
    private Long m_id;
    private Long uid;

    public PostSaveRequestDto(String p_name, String p_content, String file_uuid, Date p_date, Long m_id, Long uid) {
        this.p_name = p_name;
        this.p_content = p_content;
        this.file_uuid = file_uuid;
        this.p_date = p_date;
        this.m_id = m_id;
        this.uid = uid;
    }
    //m_id 없는 용도
    public PostSaveRequestDto(String p_name, String p_content, String file_uuid, Date p_date, Long uid) {
        this.p_name = p_name;
        this.p_content = p_content;
        this.file_uuid = file_uuid;
        this.p_date = p_date;
//        this.m_id = m_id;
        this.uid = uid;
    }

    public Post toEntity(){
        return new Post(p_name,p_content,p_date,file_uuid,m_id,uid);

    }
}
