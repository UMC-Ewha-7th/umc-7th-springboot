package com.umc.repository.MemberRepository;

import com.umc.domain.Member;
import com.umc.web.dto.MemberMyPageDto;

import java.util.List;

public interface MemberRepositoryCustom {
    MemberMyPageDto findMemberMyPageById(Long memberId);
}