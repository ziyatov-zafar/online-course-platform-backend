package uz.zafar.onlinecourse.dto;

import lombok.Builder;
import uz.zafar.onlinecourse.db.domain.Role;
import uz.zafar.onlinecourse.db.domain.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    @JsonProperty(value = "role-list", required = true)
    private List<RoleDto> roles;
}
