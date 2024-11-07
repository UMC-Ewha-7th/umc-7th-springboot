package com.umc.repository.StoreRepository;

import com.umc.domain.Store;

import java.util.List;

public interface StoreRepositoryCustom {

    List<Store> dynamicQueryWithBooleanBuilder(String name, Float score);
}
