package com.umc.domain;

import com.umc.domain.common.BaseEntity;
import com.umc.domain.mapping.MemberMission;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Mission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;
    private Integer reward;
    private LocalDate deadline;
    private String missionSpec;
    @OneToMany(mappedBy = "mission", cascade = {CascadeType.ALL})
    private List<MemberMission> memberMissionList = new ArrayList();
}
