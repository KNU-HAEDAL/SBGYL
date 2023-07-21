package com.example.haedal_hackaton.repository;

import com.example.haedal_hackaton.entity.Mission;
import com.example.haedal_hackaton.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission,Long> {
}
