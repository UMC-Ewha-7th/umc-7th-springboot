package claire.spring.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStoreLikes is a Querydsl query type for StoreLikes
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStoreLikes extends EntityPathBase<StoreLikes> {

    private static final long serialVersionUID = -381166130L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStoreLikes storeLikes = new QStoreLikes("storeLikes");

    public final claire.spring.domain.common.QBaseEntity _super = new claire.spring.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final claire.spring.domain.QStore store;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final claire.spring.domain.QUser user;

    public QStoreLikes(String variable) {
        this(StoreLikes.class, forVariable(variable), INITS);
    }

    public QStoreLikes(Path<? extends StoreLikes> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStoreLikes(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStoreLikes(PathMetadata metadata, PathInits inits) {
        this(StoreLikes.class, metadata, inits);
    }

    public QStoreLikes(Class<? extends StoreLikes> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.store = inits.isInitialized("store") ? new claire.spring.domain.QStore(forProperty("store"), inits.get("store")) : null;
        this.user = inits.isInitialized("user") ? new claire.spring.domain.QUser(forProperty("user")) : null;
    }

}

