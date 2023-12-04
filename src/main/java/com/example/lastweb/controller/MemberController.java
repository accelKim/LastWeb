package com.example.lastweb.controller;

import com.example.lastweb.dto.ChangePasswordRequestDto;
import com.example.lastweb.dto.MemberRequestDto;
import com.example.lastweb.dto.MemberResponseDto;
import com.example.lastweb.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {
 private MemberService memberService;

  @GetMapping("/me")
  public ResponseEntity<MemberResponseDto> getMyMemberInfo() {
    MemberResponseDto myInfoBySecurity = memberService.getMyInfoBySecurity();
    System.out.println(myInfoBySecurity.getNickname());
    return ResponseEntity.ok((myInfoBySecurity));
    // return ResponseEntity.ok(memberService.getMyInfoBySecurity());
  }

  @PostMapping("/nickname")
  public ResponseEntity<MemberResponseDto> setMemberNickname(@RequestBody MemberRequestDto request) {
    return ResponseEntity.ok(memberService.changeMemberNickname(request.getEmail(), request.getNickname()));
  }

  @PostMapping("/password")
  public ResponseEntity<MemberResponseDto> setMemberPassword(@RequestBody ChangePasswordRequestDto request) {
    return ResponseEntity.ok(memberService.changeMemberPassword(request.getExPassword(), request.getNewPassword(), request.getEmail()));
  }

}
