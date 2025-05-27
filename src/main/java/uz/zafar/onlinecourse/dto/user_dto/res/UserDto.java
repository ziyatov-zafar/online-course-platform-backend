package uz.zafar.onlinecourse.dto.user_dto.res;

import jakarta.persistence.Column;
import lombok.*;
import uz.zafar.onlinecourse.db.domain.Role;
import uz.zafar.onlinecourse.db.domain.User;
import uz.zafar.onlinecourse.dto.date.DateDto;
import uz.zafar.onlinecourse.dto.date.DateDto1;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long userId;
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private List<String> role;
    private Date created;
    private Date updated;
}
