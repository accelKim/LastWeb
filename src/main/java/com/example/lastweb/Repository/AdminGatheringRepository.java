package com.example.lastweb.Repository;

import com.example.lastweb.entity.AdminGathering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminGatheringRepository extends JpaRepository<AdminGathering, Integer> {

}