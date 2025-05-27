package uz.zafar.onlinecourse.dto.fileTypeDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
public class AddFileTypeRequestDto {
    @JsonProperty("type")
    private String fileType;
}
