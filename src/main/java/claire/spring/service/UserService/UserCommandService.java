package claire.spring.service.UserService;

import claire.spring.domain.User;
import claire.spring.web.dto.UserRequest;

public interface UserCommandService {
    User joinUser(UserRequest.JoinDto request);
}
