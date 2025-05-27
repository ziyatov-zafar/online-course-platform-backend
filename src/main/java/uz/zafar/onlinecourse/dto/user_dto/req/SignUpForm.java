package uz.zafar.onlinecourse.dto.user_dto.req;

import lombok.*;
import uz.zafar.onlinecourse.db.domain.User;
import uz.zafar.onlinecourse.dto.form.LoginForm;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpForm {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String email;
}
