package com.example.lastweb.Repository;

import com.example.lastweb.entity.AdminUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends JpaRepository <AdminUsers, Integer> {

}
