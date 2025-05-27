package uz.zafar.onlinecourse.service;

import org.springframework.http.ResponseEntity;
import uz.zafar.onlinecourse.db.domain.Grade;
import uz.zafar.onlinecourse.dto.ResponseDto;
import uz.zafar.onlinecourse.dto.grade_dto.res.GradeDto;
import uz.zafar.onlinecourse.dto.lesson_dto.req.AddLessonDto;
import uz.zafar.onlinecourse.dto.lesson_dto.req.AddLessonFileDto;
import uz.zafar.onlinecourse.dto.lesson_dto.res.LessonDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface LessonService {
    ResponseDto<LessonDto> findById(UUID lessonId);

    ResponseDto<LessonDto> addLesson(AddLessonDto lesson, HttpServletRequest request);

    ResponseDto<Page<LessonDto>> findAllByGroupId(UUID groupId, int page, int size);

    ResponseDto<LessonDto> addFileToLesson(AddLessonFileDto addLessonFileDto, HttpServletRequest request);

    ResponseEntity<?> downloadLessonFile(UUID lessonFileId);

    ResponseEntity<?> downloadAllLessonFiles(UUID lessonId);

}
