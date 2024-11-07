package com.umc.repository.MissionRepository;

import com.umc.domain.Mission;

import java.util.List;

public interface MissionRepositoryCustom {
    List<Mission> dynamicQueryWithBooleanBuilder(String regionName);
}
