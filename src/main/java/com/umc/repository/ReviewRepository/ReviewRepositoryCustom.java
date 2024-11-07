package com.umc.repository.ReviewRepository;


import com.umc.domain.Review;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReviewRepositoryCustom {
    Page<Review> dynamicQueryWithBooleanBuilder(String storeName, Pageable pageable);
}

