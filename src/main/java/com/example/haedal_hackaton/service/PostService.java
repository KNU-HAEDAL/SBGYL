package com.example.haedal_hackaton.service;

import com.example.haedal_hackaton.dto.PostSaveRequestDto;
import com.example.haedal_hackaton.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;
    @Transactional
    public Long save(PostSaveRequestDto requestDto){
        return postRepository.save(requestDto.toEntity()).getP_idx();
    }

}
