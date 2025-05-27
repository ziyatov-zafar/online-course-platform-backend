package uz.zafar.onlinecourse.dto.lesson_dto.res;

import uz.zafar.onlinecourse.db.domain.Lesson;
import uz.zafar.onlinecourse.dto.date.DateDto;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LessonDto {
    private UUID pkey;
    private String title;
    private String description;
    private DateDto created;
    private DateDto updated;
    private UUID groupId;
    private List<LessonFileAndTypeDto> files;
}
