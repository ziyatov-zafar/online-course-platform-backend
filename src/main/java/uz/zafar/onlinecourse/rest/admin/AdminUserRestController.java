package uz.zafar.onlinecourse.rest.admin;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.zafar.onlinecourse.db.domain.Grade;
import uz.zafar.onlinecourse.db.domain.Teacher;
import uz.zafar.onlinecourse.dto.user_dto.req.SignUpForm;
import uz.zafar.onlinecourse.service.UserService;

@RestController
@RequestMapping("api/admin/user")
@RequiredArgsConstructor
@Tag(name = "Admin User Controller", description = "Admin paneli uchun foydalanuvchilar bilan ishlash API'lari")
public class AdminUserRestController {
    private final UserService userService;

    @GetMapping("users")
    public ResponseEntity<?> list(@RequestParam("page") int page, @RequestParam("size") int size) {
        return ResponseEntity.ok(userService.findAll(page, size));
    }

    @GetMapping("get-all-teachers")
    public ResponseEntity<?> teachers(@RequestParam("page") int page, @RequestParam("size") int size) throws Exception {
        return ResponseEntity.ok(userService.findAllTeachers(page, size));
    }

    @GetMapping("get-all-students")
    public ResponseEntity<?> students(@RequestParam("page") int page, @RequestParam("size") int size) throws Exception {
        return ResponseEntity.ok(userService.findAllStudents(page, size));
    }

    @GetMapping("get-user-by-id/{userId}")
    public ResponseEntity<?> findByUserId(@PathVariable("userId") Long userId) throws Exception {
        return ResponseEntity.ok(userService.findUserById(userId));
    }

    @GetMapping("get-teacher-by-id/{teacherId}")
    public ResponseEntity<?> findByTeacherId(@PathVariable("teacherId") Long teacherId) throws Exception {
        return ResponseEntity.ok(userService.findByTeacherId(teacherId));
    }

    @GetMapping("get-student-by-id/{studentId}")
    public ResponseEntity<?> findByStudentId(@PathVariable("studentId") Long studentId) throws Exception {
        return ResponseEntity.ok(userService.findByStudentId(studentId));
    }

    @PostMapping("add-teacher")
    public ResponseEntity<?> addTeacher(@RequestBody SignUpForm form) {
        return ResponseEntity.ok(userService.addTeacher(form));
    }
}