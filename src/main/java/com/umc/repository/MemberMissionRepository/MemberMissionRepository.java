package com.umc.repository.MemberMissionRepository;

import com.umc.domain.Mission;
import com.umc.domain.mapping.MemberMission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberMissionRepository extends JpaRepository<MemberMission, Long>, MemberMissionRepositoryCustom {
}
