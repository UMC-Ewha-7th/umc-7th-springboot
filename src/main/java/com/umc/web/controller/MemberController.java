package com.umc.web.controller;

import com.umc.service.MemberService.MemberService;
import com.umc.web.dto.MemberMyPageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/mypage/{memberId}")
    public MemberMyPageDto getMemberMyPage(@PathVariable Long memberId) {
        return memberService.getMemberMyPage(memberId);
    }
}