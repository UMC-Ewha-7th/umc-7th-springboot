package com.umc.domain;

import com.umc.domain.common.BaseEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Region extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String name;
    @OneToMany(mappedBy = "region", cascade = {CascadeType.ALL})
    private List<Store> storeList = new ArrayList();
}
