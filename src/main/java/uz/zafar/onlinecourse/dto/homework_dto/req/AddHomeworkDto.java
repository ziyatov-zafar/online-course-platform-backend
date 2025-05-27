package uz.zafar.onlinecourse.dto.homework_dto.req;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import uz.zafar.onlinecourse.dto.date.DateDto;
import uz.zafar.onlinecourse.dto.homework_dto.res.HomeworkFileDto;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddHomeworkDto {
    private EditHomeworkDto homework;
    private MultipartFile file;
    private Short typeId;
    private UUID lessonId;
}
