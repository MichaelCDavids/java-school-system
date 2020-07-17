package net.school;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class LessonTest {

    @Test
    public void constructLesson() {
        School theSchool = new School();
        Teacher oneTeacher = new Teacher("Father", "Abraham", "fabraham@gmail.com");
        oneTeacher.addQualifiedSubject(Subject.ENGLISH);
        Lesson firstLesson = new Lesson(oneTeacher, LocalDateTime.now(), Subject.ENGLISH, theSchool);

        assertTrue(firstLesson instanceof Lesson);
    }

    @Test
    public void acceptLearnerFalse() {
        School theSchool = new School();
        Teacher oneTeacher = new Teacher("Father", "Abraham", "fabraham@gmail.com");
        oneTeacher.addQualifiedSubject(Subject.ENGLISH);
        Lesson firstLesson = new Lesson(oneTeacher, LocalDateTime.now(), Subject.ENGLISH, theSchool);

        Learner oneLearner = new Learner("Doctor", "Green", "greendoc@gmail.com");
        assertFalse(firstLesson.acceptLearner(oneLearner));
    }

    @Test
    public void acceptLearnerTrue() {
        School theSchool = new School();
        Teacher oneTeacher = new Teacher("Father", "Abraham", "fabraham@gmail.com");
        oneTeacher.addQualifiedSubject(Subject.ENGLISH);
        Lesson firstLesson = new Lesson(oneTeacher, LocalDateTime.now(), Subject.ENGLISH, theSchool);

        Learner oneLearner = new Learner("Doctor", "Green", "greendoc@gmail.com");
        oneLearner.register(Subject.ENGLISH);
        oneLearner.register(Subject.AFRIKAANS);
        oneLearner.register(Subject.PHYSICS);
        assertTrue(firstLesson.acceptLearner(oneLearner));
    }

    @Test
    public void startCancelled() {
        School theSchool = new School();
        Teacher oneTeacher = new Teacher("Father", "Abraham", "fabraham@gmail.com");
        oneTeacher.addQualifiedSubject(Subject.ENGLISH);
        Lesson firstLesson = new Lesson(oneTeacher, LocalDateTime.now(), Subject.ENGLISH, theSchool);

        Learner oneLearner = new Learner("Doctor", "Green", "greendoc@gmail.com");
        oneLearner.register(Subject.ENGLISH);
        oneLearner.register(Subject.AFRIKAANS);
        oneLearner.register(Subject.PHYSICS);
        assertTrue(firstLesson.acceptLearner(oneLearner));
        assertFalse(firstLesson.start());
    }

    @Test
    public void startTrue() {
        School theSchool = new School();
        Teacher oneTeacher = new Teacher("Father", "Abraham", "fabraham@gmail.com");
        oneTeacher.addQualifiedSubject(Subject.ENGLISH);
        Lesson firstLesson = new Lesson(oneTeacher, LocalDateTime.now(), Subject.ENGLISH, theSchool);

        Learner oneLearner = new Learner("Apple", "Cider", "cider@gmail.com");
        oneLearner.register(Subject.ENGLISH);
        oneLearner.register(Subject.AFRIKAANS);
        oneLearner.register(Subject.PHYSICS);
        Learner twoLearner = new Learner("Brown", "Bear", "brownbear@gmail.com");
        twoLearner.register(Subject.ENGLISH);
        twoLearner.register(Subject.AFRIKAANS);
        twoLearner.register(Subject.PHYSICS);
        Learner threeLearner = new Learner("Drake", "One", "drakes@gmail.com");
        threeLearner.register(Subject.ENGLISH);
        threeLearner.register(Subject.AFRIKAANS);
        threeLearner.register(Subject.PHYSICS);
        Learner fourLearner = new Learner("Truly", "Sincerly", "truly@gmail.com");
        fourLearner.register(Subject.ENGLISH);
        fourLearner.register(Subject.AFRIKAANS);
        fourLearner.register(Subject.PHYSICS);
        Learner fiveLearner = new Learner("Super", "Nova", "Supernova@gmail.com");
        fiveLearner.register(Subject.ENGLISH);
        fiveLearner.register(Subject.AFRIKAANS);
        fiveLearner.register(Subject.PHYSICS);


        assertTrue(firstLesson.acceptLearner(oneLearner));
        assertTrue(firstLesson.acceptLearner(twoLearner));
        assertTrue(firstLesson.acceptLearner(threeLearner));
        assertTrue(firstLesson.acceptLearner(fourLearner));
        assertTrue(firstLesson.acceptLearner(fiveLearner));
        assertTrue(firstLesson.start());

    }

    @Test
    public void end() {
        School theSchool = new School();
        Teacher oneTeacher = new Teacher("Father", "Abraham", "fabraham@gmail.com");
        oneTeacher.addQualifiedSubject(Subject.ENGLISH);
        Lesson firstLesson = new Lesson(oneTeacher, LocalDateTime.now(), Subject.ENGLISH, theSchool);

        Learner oneLearner = new Learner("Apple", "Cider", "cider@gmail.com");
        oneLearner.register(Subject.ENGLISH);
        oneLearner.register(Subject.AFRIKAANS);
        oneLearner.register(Subject.PHYSICS);
        Learner twoLearner = new Learner("Brown", "Bear", "brownbear@gmail.com");
        twoLearner.register(Subject.ENGLISH);
        twoLearner.register(Subject.AFRIKAANS);
        twoLearner.register(Subject.PHYSICS);
        Learner threeLearner = new Learner("Drake", "One", "drakes@gmail.com");
        threeLearner.register(Subject.ENGLISH);
        threeLearner.register(Subject.AFRIKAANS);
        threeLearner.register(Subject.PHYSICS);
        Learner fourLearner = new Learner("Truly", "Sincerly", "truly@gmail.com");
        fourLearner.register(Subject.ENGLISH);
        fourLearner.register(Subject.AFRIKAANS);
        fourLearner.register(Subject.PHYSICS);
        Learner fiveLearner = new Learner("Super", "Nova", "Supernova@gmail.com");
        fiveLearner.register(Subject.ENGLISH);
        fiveLearner.register(Subject.AFRIKAANS);
        fiveLearner.register(Subject.PHYSICS);

        assertEquals(0.00, oneLearner.getTokens());
        assertTrue(firstLesson.acceptLearner(oneLearner));
        assertTrue(firstLesson.acceptLearner(twoLearner));
        assertTrue(firstLesson.acceptLearner(threeLearner));
        assertTrue(firstLesson.acceptLearner(fourLearner));
        assertTrue(firstLesson.acceptLearner(fiveLearner));
        assertTrue(firstLesson.start());
        assertTrue(oneLearner.isAttending());

        //end lesson
        firstLesson.end();
        assertEquals(3.00, oneLearner.getTokens());

    }
}
