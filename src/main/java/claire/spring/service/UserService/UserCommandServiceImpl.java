package claire.spring.service.UserService;

import claire.spring.domain.User;
import claire.spring.repository.UserRepository.UserRepository;
import claire.spring.web.dto.UserRequest;

public class UserCommandServiceImpl implements UserCommandService {
    private UserRepository userRepository;

    @Override
    public User joinUser(UserRequest.JoinDto request){
        return null;
    }
}
