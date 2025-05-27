package uz.zafar.onlinecourse.dto.user_dto.res;

import lombok.Builder;
import lombok.Data;
import uz.zafar.onlinecourse.dto.LoginResponseDto;
import uz.zafar.onlinecourse.dto.UserResponseDto;
import uz.zafar.onlinecourse.dto.form.LoginForm;

@Data
@Builder
public class RegisterInfoDto {
    private LoginResponseDto response;
    private UserResponseDto user;
}
