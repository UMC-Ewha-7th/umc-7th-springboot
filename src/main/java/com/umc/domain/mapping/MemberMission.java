package com.umc.domain.mapping;

import com.umc.domain.Member;
import com.umc.domain.Mission;
import com.umc.domain.common.BaseEntity;
import com.umc.domain.enums.MissionStatus;
import jakarta.persistence.*;

@Entity
public class MemberMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'CHALLENGING'")
    private MissionStatus status;
}