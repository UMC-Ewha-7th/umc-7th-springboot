package claire.spring.web.dto;

import lombok.Getter;

import java.util.List;

public class UserRequest {
    @Getter
    public static class JoinDto{
        String name;
        String nickname;
        String gender;
        String email;
        String address;
        String phoneNum;
        List<Long> preferCategory;
    }
}
