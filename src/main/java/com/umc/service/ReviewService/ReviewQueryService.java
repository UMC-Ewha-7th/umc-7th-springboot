package com.umc.service.ReviewService;

import com.umc.domain.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReviewQueryService {
    public Page<Review> findReviewsByStoreName(String storeName, Integer page, Integer size);
}
