package claire.spring.web.controller;

import claire.spring.ApiPayload.ApiResponse;
import claire.spring.web.dto.UserRequest;
import claire.spring.web.dto.UserResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserRestController {
    private final UserCommandService UserCommandService;

    @PostMapping("/")
    public ApiResponse<UserResponse.JoinResultDto> join(@RequestBody @Valid UserRequest.JoinDto request){
        return null;
    }
}
