package com.example.haedal_hackaton.newController;

import com.example.haedal_hackaton.dto.PostResponseDto;
import com.example.haedal_hackaton.entity.Mission;
import com.example.haedal_hackaton.entity.Post;
import com.example.haedal_hackaton.service.MissionService;
import com.example.haedal_hackaton.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class newController {
    @Autowired
    private MissionService missionService;
    @Autowired
    private PostService postService;
    @GetMapping("/{missionId}")
    public String findAll(@PathVariable Long missionId, Model model){
        List<Mission> missionList = missionService.findAll();

        List<Post> postList = postService.findByMissionId(missionId);

        model.addAttribute("missionList", missionList);
        model.addAttribute("postList", postList);

        return "index";
    }
    @GetMapping("/m/{postId}")
    public String findPost(@PathVariable Long postId, Model model) {
        PostResponseDto post = postService.findById(postId);
        model.addAttribute("post", post);

        return "mission";
    }
}
