package com.example.haedal_hackaton.controller;

import com.example.haedal_hackaton.dto.PostSaveRequestDto;
import com.example.haedal_hackaton.entity.Post;
import com.example.haedal_hackaton.repository.PostRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PostControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private PostRepository postRepository;

    @After
    public void tearDown() throws Exception{
        postRepository.deleteAll();
    }
    @Test
    public void Posts_등록된다() throws Exception{
        //given
        String p_name="name";
        String p_content="content";
        Date p_date =new Date();
        String file_uuid = "ss";
        Long u_id =0L;

        PostSaveRequestDto requestDto = new PostSaveRequestDto(p_name,p_content,p_date,file_uuid,u_id);
        String url = "http://localhost:"+port+"/api/mission/1/post";

        //when
        ResponseEntity<Long> responseEntity = restTemplate
                .postForEntity(url,requestDto,Long.class);

        //then
        assertThat(responseEntity.getStatusCode())
                .isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody())
                .isGreaterThan(0L);
        List<Post> all = postRepository.findAll();
        assertThat(all.get(0).getP_name()).isEqualTo(p_name);
        assertThat(all.get(0).getP_content()).isEqualTo(p_content);
    }

}
