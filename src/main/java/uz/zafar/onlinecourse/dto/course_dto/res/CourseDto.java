package uz.zafar.onlinecourse.dto.course_dto.res;

import uz.zafar.onlinecourse.dto.date.DateDto;
import lombok.*;
import uz.zafar.onlinecourse.dto.group_dto.res.GroupDto;

import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDto {
    private UUID pkey;
    private String name;
    private String description;
    private String telegramChannel;
    private Boolean hasTelegramChannel;
    private DateDto createdAt;
    private DateDto updatedAt;
}
