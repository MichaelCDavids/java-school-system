package net.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrincipalTest {

    @Test
    public void subjectsTaughtForDayZero() {
        School school = new School();
        Principal principal = new Principal("A", "B", "C", school);
        assertEquals(0, principal.subjectsTaughtForDay());
    }

    @Test
    public void subjectsTaughtForDay() {
        School school = new School();
        school.addSubjectsTaught(Subject.ENGLISH);
        Principal principal = new Principal("A", "B", "C", school);
        assertEquals(1, principal.subjectsTaughtForDay());
    }

    @Test
    public void lessonsCancelledForDay() {
        School school = new School();
        school.updateLessonsCancelled();
        school.updateLessonsCancelled();
        school.updateLessonsCancelled();
        Principal principal = new Principal("A", "B", "C", school);
        assertEquals(3, principal.lessonsCancelledForDay());
    }
}
