package com.umc.repository.MemberRepository;

import com.umc.domain.Member;
import com.umc.repository.MemberMissionRepository.MemberMissionRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
}
