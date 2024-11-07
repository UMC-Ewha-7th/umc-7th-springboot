package com.umc.repository.MemberMissionRepository;

import com.umc.domain.Member;
import com.umc.domain.Mission;
import com.umc.domain.enums.MissionStatus;
import com.umc.domain.mapping.MemberMission;

import java.util.List;

public interface MemberMissionRepositoryCustom {
    List<MemberMission> dynamicQueryWithBooleanBuilder(Long memberId, MissionStatus missionStatus);
}
