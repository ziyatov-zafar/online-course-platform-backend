package uz.zafar.onlinecourse.dto.course_dto.res;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import uz.zafar.onlinecourse.dto.date.DateDto;

import java.util.Date;
import java.util.UUID;

public interface CourseDtoResponse {
    UUID getPkey();

    String getName();

    String getDescription();

    String getTelegramChannel();

    Boolean getHasTelegramChannel();

    Date getCreatedAt();

    Date getUpdatedAt();

   /*@JsonIgnore
   String getDeleteName();*/

}
