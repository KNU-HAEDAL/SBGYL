package com.example.haedal_hackaton.repository;

import com.example.haedal_hackaton.dto.PostResponseDto;
import com.example.haedal_hackaton.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findAllByMid(Long mid);
}
