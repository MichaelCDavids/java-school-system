package net.school;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LearnerTest {
    @Test
    public void learnerTest() {
        Person waahid = new Learner("Waahid", "Gabriels", "waahidg@gmail.com");
        assertTrue(waahid instanceof Person);
        assertTrue(waahid instanceof Learner);
    }

    @Test
    public void learnerRegister() {
        Person waahid = new Learner("Waahid", "Gabriels", "waahidg@gmail.com");
        Learner learnerOne = (Learner) waahid;
        learnerOne.register(Subject.BIOLOGY);
        learnerOne.register(Subject.AFRIKAANS);
        learnerOne.register(Subject.GEOGRAPHY);
        ArrayList<Subject> registeredSubjects = new ArrayList<>();
        registeredSubjects.add(Subject.BIOLOGY);
        registeredSubjects.add(Subject.AFRIKAANS);
        registeredSubjects.add(Subject.GEOGRAPHY);
        assertEquals(registeredSubjects, learnerOne.getRegisteredSubjects());
    }

    @Test
    public void learnerAttend() {
        School theSchool = new School();
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

        Lesson geographyClass = new Lesson(theTeacher, time, Subject.GEOGRAPHY, theSchool);

        geographyClass.acceptLearner(learnerOne);
        geographyClass.acceptLearner(learnerTwo);
        geographyClass.acceptLearner(learnerThree);
        geographyClass.acceptLearner(learnerFour);
        geographyClass.acceptLearner(learnerFive);

        geographyClass.start();
        geographyClass.end();


        assertEquals(1, learnerOne.getLessonNotes().size());
    }

    @Test
    public void learnerIsAttending() {
        School theSchool = new School();
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

        Lesson geographyClass = new Lesson(theTeacher, time, Subject.GEOGRAPHY, theSchool);

        geographyClass.acceptLearner(learnerOne);
        geographyClass.acceptLearner(learnerTwo);
        geographyClass.acceptLearner(learnerThree);
        geographyClass.acceptLearner(learnerFour);
        geographyClass.acceptLearner(learnerFive);

        geographyClass.start();

        assertTrue(learnerOne.isAttending());
        geographyClass.end();
        assertFalse(learnerOne.isAttending());

    }

    @Test
    public void learnerGetLessonNotes() {
        Person waahid = new Learner("Waahid", "Gabriels", "waahidg@gmail.com");
        Learner learnerOne = (Learner) waahid;
        assertEquals(0, learnerOne.getLessonNotes().size());
    }

    @Test
    public void learnerSetAttending() {
        Learner rafiki = new Learner("Rafiki", "Something", "asdf@jlk.co");
        rafiki.setAttending(true);
        assertTrue(rafiki.isAttending());
        rafiki.setAttending(false);
        assertFalse(rafiki.isAttending());
    }

    @Test
    public void learnerUpdateLessonNotes() {
        Learner rafiki = new Learner("Rafiki", "Something", "asdf@jlk.co");

        rafiki.updateLessonNotes(new Notes(Subject.ENGLISH));

        assertEquals(1, rafiki.getLessonNotes().size());
    }


    @Test
    public void learnerPurchaseLessonNotes() {
        Learner rafiki = new Learner("Rafiki", "Something", "asdf@jlk.co");
        Learner simba = new Learner("Simba", "Chippie", "simbachippie@tlk.co");

        rafiki.register(Subject.ENGLISH);
        simba.register(Subject.ENGLISH);

        rafiki.earnTokens(10);
        simba.earnTokens(25);

        Notes englishNotes = new Notes(Subject.ENGLISH);
        rafiki.updateLessonNotes(englishNotes);

        simba.purchaseLessonNotes(rafiki, englishNotes);

        assertEquals(13, rafiki.getTokens());
        assertEquals(22, simba.getTokens());


        assertEquals(1, rafiki.getLessonNotes().size());
    }

    @Test
    public void learnerPurchaseLessonNotesOtherSubject() {
        Learner rafiki = new Learner("Rafiki", "Something", "asdf@jlk.co");
        Learner simba = new Learner("Simba", "Chippie", "simbachippie@tlk.co");

        rafiki.register(Subject.ENGLISH);
        simba.register(Subject.AFRIKAANS);

        rafiki.earnTokens(10);
        simba.earnTokens(25);

        Notes englishNotes = new Notes(Subject.ENGLISH);
        rafiki.updateLessonNotes(englishNotes);

        simba.purchaseLessonNotes(rafiki, englishNotes);

        assertEquals(15, rafiki.getTokens());
        assertEquals(20, simba.getTokens());

    }

    @Test
    public void learnerUpdateBoughtNotes() {
        Learner simba = new Learner("Simba", "Chippie", "simbachippie@tlk.co");
        Notes englishNotes = new Notes(Subject.ENGLISH);
        simba.updateBoughtNotes(englishNotes);
        assertEquals(1, simba.getBoughtNotes().size());
    }

    @Test
    public void learnerGetBoughtNotes() {
        Learner simba = new Learner("Simba", "Chippie", "simbachippie@tlk.co");
        Notes englishNotes = new Notes(Subject.ENGLISH);
        Notes geographyNotes = new Notes(Subject.GEOGRAPHY);
        Notes biologyNotes = new Notes(Subject.BIOLOGY);
        simba.updateBoughtNotes(englishNotes);
        simba.updateBoughtNotes(geographyNotes);
        simba.updateBoughtNotes(biologyNotes);
        assertEquals(3, simba.getBoughtNotes().size());
    }
}
