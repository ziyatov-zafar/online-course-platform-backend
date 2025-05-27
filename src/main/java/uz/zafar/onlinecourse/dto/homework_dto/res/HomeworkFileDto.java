package uz.zafar.onlinecourse.dto.homework_dto.res;

import lombok.*;
import uz.zafar.onlinecourse.db.domain.Type;
import uz.zafar.onlinecourse.dto.type_dto.TypeDto;

import java.util.UUID;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HomeworkFileDto {
    private UUID homeworkFileId;
    private String fileUrl;
    private String fileName;
    private Short typeId;
    private UUID homeworkId;
}
