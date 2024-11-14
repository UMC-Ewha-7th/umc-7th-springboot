package claire.spring.converter;

import claire.spring.domain.Category;
import claire.spring.domain.mapping.UserPrefer;

import java.util.List;
import java.util.stream.Collectors;

public class UserPreferConverter {
    public static List<UserPrefer> toUserPreferList(List<Category> foodCategoryList) {
        return foodCategoryList.stream()
                .map(foodCategory ->
                        UserPrefer.builder()
                                .category(foodCategory)
                                .build()
                ).collect(Collectors.toList());
    }
}
