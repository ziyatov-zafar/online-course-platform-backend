package uz.zafar.onlinecourse.dto.statistic_dto.res;

import lombok.*;


public interface StatisticDto {
    public long getUserCount();

    public long getCourseCount();

    public long getTeacherCount();

    public long getStudentCount();
}
