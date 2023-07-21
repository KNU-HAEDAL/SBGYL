package com.example.haedal_hackaton.repository;

import com.example.haedal_hackaton.entity.Mission;
import com.example.haedal_hackaton.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MissionRepository extends JpaRepository<Mission,Long> {
}
