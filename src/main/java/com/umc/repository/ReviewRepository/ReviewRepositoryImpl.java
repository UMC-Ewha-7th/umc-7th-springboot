package com.umc.repository.ReviewRepository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.JPQLQueryFactory;
import com.umc.domain.QReview;
import com.umc.domain.QStore;
import com.umc.domain.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepositoryCustom {
    private final JPQLQueryFactory jpqlQueryFactory;
    private final QReview review = QReview.review;
    private final QStore store = QStore.store;

    @Override
    public Page<Review> dynamicQueryWithBooleanBuilder(String storeName, Pageable pageable) {
        BooleanBuilder predicate = new BooleanBuilder();

        if (storeName != null) {
            predicate.and(review.store.name.eq(storeName));
        }

        // 리뷰와 스토어 조인을 통해 페이징 쿼리 작성
        List<Review> reviews = jpqlQueryFactory
                .selectFrom(review)
                .join(review.store, store)  // 리뷰와 스토어를 조인
                .where(predicate)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        // 전체 데이터 수 조회
        long total = jpqlQueryFactory
                .selectFrom(review)
                .join(review.store, store)
                .where(predicate)
                .fetchCount();

        return new PageImpl<>(reviews, pageable, total);
    }
}