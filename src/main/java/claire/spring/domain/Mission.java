package claire.spring.domain;

import claire.spring.domain.common.BaseEntity;
import claire.spring.domain.mapping.UserMission;
import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 200)
    private String content;

    private Integer point;

    private LocalDate deadline;

    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<UserMission> userMissionList = new ArrayList<>();
}
