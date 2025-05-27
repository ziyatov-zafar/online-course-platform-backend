package uz.zafar.onlinecourse.rest;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import uz.zafar.onlinecourse.service.AuthService;

@RestController
@Hidden
@RequestMapping("files")
public class AuthShowFileController {
    private final AuthService authService;

    public AuthShowFileController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("homeworks/{fileName}")
    public ResponseEntity<?> showFile(@PathVariable String fileName) {
        return authService.showFile("homeworks", fileName);
    }

    @GetMapping("lessons/{fileName}")
    public ResponseEntity<?> showLessonFiles(@PathVariable String fileName) {
        return authService.showFile("lessons", fileName);
    }

    @GetMapping("homework-submission/{fileName}")
    public ResponseEntity<?> showSubmitLessonFiles(@PathVariable String fileName) {
        return authService.showFile("homework-submission", fileName);
    }

}
