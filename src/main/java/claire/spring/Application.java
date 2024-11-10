package claire.spring;

import ch.qos.logback.core.net.SyslogOutputStream;
import claire.spring.domain.enums.MissionStatus;
import claire.spring.service.MissionService.MissionQueryService;
import claire.spring.service.ReviewService.ReviewQueryService;
import claire.spring.service.StoreService.StoreQueryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext context) {
		return args -> {
			/*
			// StoreQueryService 실행
			StoreQueryService storeService = context.getBean(StoreQueryService.class);

			// 파라미터 값 설정
			String name = "요아정";
			Float rating = 4.0f;

			// 쿼리 메서드 호출 및 쿼리 문자열과 파라미터 출력
			System.out.println("Executing findStoresByNameAndRating with parameters:");
			System.out.println("Name: " + name);
			System.out.println("Rating: " + rating);

			storeService.findStoresByNameAndScore(name, rating)
					.forEach(System.out::println);

			// MissionQueryService 실행
			MissionQueryService missionService = context.getBean(MissionQueryService.class);
			Long userId = 1L;
			MissionStatus status = MissionStatus.COMPLETE;
			int offset = 0;
			int limit = 10;

			System.out.println("Executing findMissionsByUserIdAndStatus with parameters:");
			System.out.println("UserId: " + userId);
			System.out.println("Status: " + status);

			missionService.getMissionByUserIdAndStatus(userId, status, offset, limit)
					.forEach(System.out::println);

			*/
			// ReviewQueryService 실행
			ReviewQueryService reviewService = context.getBean(ReviewQueryService.class);
			Long userId = 1L;
			Long missionId = 3L;
			Float rating = 4.7f;
			String title = "추천합니당";
			String content = "맛있어요! 정말 최고예요!";
			String imgUrl = "http://example.com/image.jpg";

			reviewService.insertReview(userId, missionId, rating, title, content, imgUrl);
			System.out.println("Review added successfully!");
		};
	}
}
