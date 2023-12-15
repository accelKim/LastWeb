package com.example.lastweb.Repository;

import com.example.lastweb.entity.Qna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QnaRepository extends JpaRepository <Qna, Integer> {

}
