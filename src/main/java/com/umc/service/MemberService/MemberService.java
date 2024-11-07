package com.umc.service.MemberService;

import com.umc.web.dto.MemberMyPageDto;

public interface MemberService {
    public MemberMyPageDto getMemberMyPage(Long memberId);
}
