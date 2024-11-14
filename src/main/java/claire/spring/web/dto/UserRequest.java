package claire.spring.web.dto;

import claire.spring.validation.annotation.ExistCategories;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.util.List;

public class UserRequest {
    @Getter
    public static class JoinDto{
        @NotBlank
        String name;
        @NotNull
        String nickname;
        @NotNull
        String gender;
        @NotNull
        String email;
        @Size(min = 5, max = 12)
        String address;
        @Size(min = 5, max = 20)
        String phoneNum;
        @ExistCategories
        List<Long> preferCategory;
    }
}
