package uz.zafar.onlinecourse.dto.lesson_dto.req;

import uz.zafar.onlinecourse.db.domain.Group;
import uz.zafar.onlinecourse.dto.lesson_dto.res.LessonFileDto;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddLessonDto {
    private String title;
    private String description;
    private UUID groupId;
    private List<LessonFileDto> files;
}
