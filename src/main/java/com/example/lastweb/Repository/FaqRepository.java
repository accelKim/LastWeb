package com.example.lastweb.Repository;

import com.example.lastweb.entity.Faq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqRepository extends JpaRepository <Faq, Integer> {

}
