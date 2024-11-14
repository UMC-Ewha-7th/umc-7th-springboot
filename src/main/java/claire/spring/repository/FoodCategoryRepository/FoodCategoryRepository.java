package claire.spring.repository.FoodCategoryRepository;

import claire.spring.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<Category, Long> {
}
