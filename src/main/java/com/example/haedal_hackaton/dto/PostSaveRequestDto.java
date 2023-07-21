package com.example.haedal_hackaton.dto;

import com.example.haedal_hackaton.entity.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter //getter함수 구현 대신해주는 어노테이션
@NoArgsConstructor //생성자 구현 대신 해주는 어노테이션
public class PostSaveRequestDto {
    private String pname;
    private String pcontent;
    private String fileuuid;
    private Date pdate;
    private Long mid;
    private Long uid;

    public PostSaveRequestDto(String p_name, String p_content, String file_uuid, Date p_date, Long m_id, Long uid) {
        this.pname = p_name;
        this.pcontent = p_content;
        this.fileuuid = file_uuid;
        this.pdate = p_date;
        this.mid = m_id;
        this.uid = uid;
    }
    //m_id 없는 용도
    public PostSaveRequestDto(String p_name, String p_content,  Date p_date,String file_uuid, Long uid) {
        this.pname = p_name;
        this.pcontent = p_content;
        this.fileuuid = file_uuid;
        this.pdate = p_date;
//        this.m_id = m_id;
        this.uid = uid;
    }

    public Post toEntity(){
        return new Post(pname,pcontent,pdate,fileuuid,mid,uid);

    }
}
