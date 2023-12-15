package com.example.lastweb.Repository;

import com.example.lastweb.entity.AdminMission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMissionRepository extends JpaRepository<AdminMission, Integer> {

}