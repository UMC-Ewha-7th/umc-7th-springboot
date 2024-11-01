package claire.spring.domain;

import claire.spring.domain.common.BaseEntity;
import jakarta.persistence.*;
import org.w3c.dom.Text;

public class MISSION extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 200)
    private Text content;

    private Integer point;


    private Integer store_id;
}
