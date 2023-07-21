package com.example.haedal_hackaton.controller;

import com.example.haedal_hackaton.dto.PostSaveRequestDto;
import com.example.haedal_hackaton.entity.Post;
import com.example.haedal_hackaton.repository.PostRepository;
import com.example.haedal_hackaton.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    //우리는 사용자한테 데이터를 넘기는데,
    // 이 데이터에 결국 Id가 들어있게 된다.
    // 이 데이터를 활용해서 프론트가 link에 id를 포함하게 만들 수 있고
    // 이를 통해서 조회나 다양한 방식이 가능해진다.
    @PostMapping("/api/mission/{mission-id}/post") // post + url for create
    public Long save(@PathVariable Long m_id,@RequestBody PostSaveRequestDto dto){
        //1. 데이터를 DTO로 받기  (DTO의 필드연결은 프론트가)

        //2. DTO to Entity (DTO의 함수)

        //3. Entity to DB (repository의 CRUD함수)

//        이 과정을 그~대로~ Service에 옮겨놓고, Service함수를 리턴해주면 됨!
        return postService.save(dto);
    }

    @GetMapping("/api/mission/{mission_id}/post")
    public List<Post> allPost(){
        return postService.findAllPost();
    }
}
