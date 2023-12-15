package com.example.lastweb.service;

import com.example.lastweb.Repository.FaqRepository;
import com.example.lastweb.entity.Faq;
import com.example.lastweb.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FaqService {
  @Autowired
  private FaqRepository faqRepository;

  public Faq createFaq(@RequestBody Faq faq) {
    return faqRepository.save(faq);
  }

  public List<Faq> listAllFaqs() {
    return faqRepository.findAll();
  }
  public ResponseEntity<Faq> getFaqById(@PathVariable Integer faq_id) {
    Faq faq = faqRepository.findById(faq_id)
        .orElseThrow(() -> new ResourceNotFoundException("Faq not exist with id : " + faq_id));

    return ResponseEntity.ok(faq);
  }

  public ResponseEntity<Faq> updateFaq(@PathVariable Integer faq_id, @RequestBody Faq faqsDetails) {
    Faq faq = faqRepository.findById(faq_id)
        .orElseThrow(() -> new ResourceNotFoundException("Faq not exist with id : " + faq_id));

    faq.setContent(faqsDetails.getContent());
    faq.setTitle(faqsDetails.getTitle());

    Faq updateFaq = faqRepository.save(faq);
    return ResponseEntity.ok(updateFaq);
  }

  public ResponseEntity<Map<String , Boolean>> deleteFaq(@PathVariable Integer faq_id) {
    Faq faq = faqRepository.findById(faq_id)
        .orElseThrow(() -> new ResourceNotFoundException("Faq not exist with id : " + faq_id));

    faqRepository.delete(faq);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
  }


}
