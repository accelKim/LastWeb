package com.example.lastweb.controller;

import com.example.lastweb.Dto.ChangePasswordRequestDto;
import com.example.lastweb.Dto.MemberRequestDto;
import com.example.lastweb.Dto.MemberResponseDto;
import com.example.lastweb.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member") // /member를 /api/member로 변경
public class MemberController {

  private final MemberService memberService;

  @GetMapping("/me")
  public ResponseEntity<MemberResponseDto> getMyMemberInfo() {
    MemberResponseDto myInfoBySecurity = memberService.getMyInfoBySecurity();
    System.out.println(myInfoBySecurity.getNickname());
    return ResponseEntity.ok(myInfoBySecurity);
  }

  @PostMapping("/nickname")
  public ResponseEntity<MemberResponseDto> setMemberNickname(@RequestBody MemberRequestDto request) {
    return ResponseEntity.ok(memberService.changeMemberNickname(request.getEmail(), request.getNickname()));
  }

  @PostMapping("/password")
  public ResponseEntity<MemberResponseDto> setMemberPassword(@RequestBody ChangePasswordRequestDto request) {
    return ResponseEntity.ok(memberService.changeMemberPassword(request.getEmail(), request.getExPassword(), request.getNewPassword()));
  }
}
