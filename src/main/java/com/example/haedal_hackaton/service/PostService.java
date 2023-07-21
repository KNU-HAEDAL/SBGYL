package com.example.haedal_hackaton.service;

import com.example.haedal_hackaton.dto.PostResponseDto;
import com.example.haedal_hackaton.dto.PostSaveRequestDto;
import com.example.haedal_hackaton.entity.Post;
import com.example.haedal_hackaton.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;
    @Transactional
    public Long save(PostSaveRequestDto requestDto){
        return postRepository.save(requestDto.toEntity()).getP_idx();
    }

    @Transactional
    public PostResponseDto findById (Long id){
        Post entity = postRepository.findById(id)
                .orElseThrow(()-> new
                        IllegalArgumentException("해당 게시글이 없습니다. id="+id));
        return new PostResponseDto(entity);
    }

    public List<Post> findByMissionId(Long missionId) {
        return postRepository.findAllByMid(missionId);
    }
}
