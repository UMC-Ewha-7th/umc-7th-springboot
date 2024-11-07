package claire.spring.repository.StoreRepository;

import claire.spring.domain.Store;
import com.querydsl.core.BooleanBuilder;

import java.util.List;

public interface StoreRepository {
    private List<Store> DynamicQueryWithBooleanBuilder(String name, Float score) {

        BooleanBuilder predicate = new BooleanBuilder();

        if (name != null) {
            predicate.and(Store.name.eq(name));
        }

        if (score != null) {
            predicate.and(Store.rating.goe(4.0f));
        }

        return queryFactory
                .selectFrom(Store)
                .where(predicate)
                .fetch();

    }
}
