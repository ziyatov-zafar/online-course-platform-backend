package uz.zafar.onlinecourse.dto.homework_submission_dto.req;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import uz.zafar.onlinecourse.db.domain.HomeworkSubmission;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddHomeworkSubmissionDto {
    @JsonProperty("student-id")
    private Long studentId;
    @JsonProperty("homework-id")
    private UUID homeworkId;
    @JsonIgnore
    private MultipartFile file;
    @JsonProperty("type-id")
    private Short typeId;
}
