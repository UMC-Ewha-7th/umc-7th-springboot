package com.umc.service.MemberMissionService;

import com.umc.domain.enums.MissionStatus;
import com.umc.domain.mapping.MemberMission;

import java.util.List;
import java.util.Optional;

public interface MemberMissionQueryService {
    Optional<MemberMission> findMemberMissions(Long id);
    List<MemberMission> findMemberMissionsByNameAndMissionStatus(Long memberId, MissionStatus missionStatus);
}
