package uz.zafar.onlinecourse.rest.teacher;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.zafar.onlinecourse.dto.like_dto.req.AddLikeDto;
import uz.zafar.onlinecourse.service.LikeService;

import java.util.UUID;

@RequestMapping("/api/teacher/like")
@RequiredArgsConstructor
@RestController
@Tag(name = "Teacher Like Controller", description = "Teacher paneli uchun layklar bilan ishlash API'lari")
public class TeacherLikeRestController {
    private final LikeService likeService;
    @GetMapping("get-like-count-by-lesson-id")
    public ResponseEntity<?> getAllLikeCountByLessonId(@RequestParam("lessonId") UUID lessonId) {
        return ResponseEntity.ok(likeService.getLikeCountByLessonId(lessonId));
    }
}
