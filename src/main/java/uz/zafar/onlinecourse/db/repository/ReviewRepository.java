package uz.zafar.onlinecourse.db.repository;

//import com.example.onlinecoursemain.db.domain.Course;
//import com.example.onlinecoursemain.dto.date.DateDto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import uz.zafar.onlinecourse.db.domain.Course;
import uz.zafar.onlinecourse.db.domain.Review;
import uz.zafar.onlinecourse.db.domain.Student;
import uz.zafar.onlinecourse.dto.date.DateDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
    @Query(nativeQuery = true, value = """
            select s.*
            from reviews r
            inner join students s
                        on s.id=r.student_id
            where r.lesson_id=:lessonId
            """)

    List<Student>getStudentReviewLesson(@Param("lessonId") UUID lessonId);

    Review findByStudentIdAndLessonId(Long studentId, UUID lessonId);
}
