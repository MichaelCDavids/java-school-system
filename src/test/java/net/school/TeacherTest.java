package net.school;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    public void TeacherTest() {
        Person teacher = new Teacher("Talgah", "Isaacs", "talgahi@gmail.com");
        assertTrue(teacher instanceof Person);
        assertTrue(teacher instanceof Teacher);
    }

    @Test
    public void TeacherAddQualifiedSubjectMethod() {
        Person teacher = new Teacher("Talgah", "Isaacs", "talgahi@gmail.com");
        Teacher theTeacher = (Teacher) teacher;
        theTeacher.addQualifiedSubject(Subject.MATHEMATICS);
        theTeacher.addQualifiedSubject(Subject.ENGLISH);
        ArrayList<Subject> list = new ArrayList<Subject>();
        list.add(Subject.MATHEMATICS);
        list.add(Subject.ENGLISH);
        assertEquals(list, theTeacher.getQualifiedSubjects());
    }

    @Test
    public void TeacherGetQualifiedSubjects() {
        Person teacher = new Teacher("Talgah", "Isaacs", "talgahi@gmail.com");
        Teacher theTeacher = (Teacher) teacher;
        theTeacher.addQualifiedSubject(Subject.MATHEMATICS);
        ArrayList<Subject> list = new ArrayList<Subject>();
        list.add(Subject.MATHEMATICS);
        assertEquals(list, theTeacher.getQualifiedSubjects());
    }

    @Test
    public void teacherIncrementNumberOfLessonsTaught() {
        Teacher muj = new Teacher("Muj", "Dave", "muj@gmail.com");
        muj.incrementNumberOfLessonsTaught();
        muj.incrementNumberOfLessonsTaught();
        muj.incrementNumberOfLessonsTaught();
        muj.incrementNumberOfLessonsTaught();
        assertEquals(4, muj.getNumberOfLessonsTaught());
    }

    @Test
    public void teacherGetNumberOfLessonsTaught() {
        Teacher muj = new Teacher("Muj", "Dave", "muj@gmail.com");
        muj.incrementNumberOfLessonsTaught();
        assertEquals(1, muj.getNumberOfLessonsTaught());
    }

    @Test
    public void teacherGetNumberOfLessonsTaughtZero() {
        Teacher muj = new Teacher("Muj", "Dave", "muj@gmail.com");
        assertEquals(0, muj.getNumberOfLessonsTaught());
    }

    @Test
    public void teacherIsTeaching() {
        School school = new School();
        Person teacher = new Teacher("Talgah", "Isaacs", "talgahi@gmail.com");
        Teacher theTeacher = (Teacher) teacher;

        theTeacher.addQualifiedSubject(Subject.GEOGRAPHY);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);


        Person waahid = new Learner("Waahid", "Gabriels", "waahidg@gmail.com");
        Person maheer = new Learner("Maheer", "Dutoit", "waahidg@gmail.com");
        Person muhaymin = new Learner("Muhaymin", "Maggot", "waahidg@gmail.com");
        Person mueez = new Learner("Mueez", "Davids", "waahidg@gmail.com");
        Person ameer = new Learner("Ameer", "Alfos", "waahidg@gmail.com");

        Learner learnerOne = (Learner) waahid;
        Learner learnerTwo = (Learner) maheer;
        Learner learnerThree = (Learner) muhaymin;
        Learner learnerFour = (Learner) mueez;
        Learner learnerFive = (Learner) ameer;

        learnerOne.register(Subject.BIOLOGY);
        learnerOne.register(Subject.AFRIKAANS);
        learnerOne.register(Subject.GEOGRAPHY);

        learnerTwo.register(Subject.BIOLOGY);
        learnerTwo.register(Subject.AFRIKAANS);
        learnerTwo.register(Subject.GEOGRAPHY);

        learnerThree.register(Subject.BIOLOGY);
        learnerThree.register(Subject.AFRIKAANS);
        learnerThree.register(Subject.GEOGRAPHY);

        learnerFour.register(Subject.BIOLOGY);
        learnerFour.register(Subject.AFRIKAANS);
        learnerFour.register(Subject.GEOGRAPHY);

        learnerFive.register(Subject.BIOLOGY);
        learnerFive.register(Subject.AFRIKAANS);
        learnerFive.register(Subject.GEOGRAPHY);

        Lesson geographyClass = new Lesson(theTeacher, time, Subject.GEOGRAPHY, school);

        geographyClass.acceptLearner(learnerOne);
        geographyClass.acceptLearner(learnerTwo);
        geographyClass.acceptLearner(learnerThree);
        geographyClass.acceptLearner(learnerFour);
        geographyClass.acceptLearner(learnerFive);


        geographyClass.start();
        assertTrue(theTeacher.isTeaching());
        geographyClass.end();
        assertFalse(theTeacher.isTeaching());
    }

    @Test
    public void teacherSetAttending() {
        Teacher muj = new Teacher("Muj", "Dave", "muj@gmail.com");
        muj.setTeaching(true);
        assertTrue(muj.isTeaching());
        muj.setTeaching(false);
        assertFalse(muj.isTeaching());
    }
}
