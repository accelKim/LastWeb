package com.example.lastweb.Repository;

import com.example.lastweb.entity.AdminPunding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminPundingRepository extends JpaRepository<AdminPunding, Integer> {

}