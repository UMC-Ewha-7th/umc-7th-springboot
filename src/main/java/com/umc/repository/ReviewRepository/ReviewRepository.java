package com.umc.repository.ReviewRepository;

import com.umc.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long>, ReviewRepositoryCustom {
}
