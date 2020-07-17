package net.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    @Test
    public void getLessonsCancelledSchool() {
        School school = new School();
        assertEquals(0, school.getLessonsCancelled());
    }

    @Test
    public void updateLessonsCancelledSchool() {
        School school = new School();
        school.updateLessonsCancelled();
        school.updateLessonsCancelled();
        school.updateLessonsCancelled();
        assertEquals(3, school.getLessonsCancelled());
    }

//    @Test
//    public void addSubjectsTaughtSchool() {
//        School.addSubjectsTaught(Subject.GEOGRAPHY);
//        School.addSubjectsTaught(Subject.BIOLOGY);
//        School.addSubjectsTaught(Subject.PHYSICS);
//        assertEquals(3,School.getSubjectsTaught());
//    }

}
