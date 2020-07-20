package net.school;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class SchoolDay {
    public static void main(String[] args) {

        // Th School
        School theSchool = new School();

        // Cafeteria
        Cafeteria cafeteria = new Cafeteria();

        // Principal
        Principal principalOne = new Principal("Karriem", "Gabriels", "karriemg@gmail.com", theSchool);


        // School Day One
        LocalDateTime schoolDayOne = LocalDateTime.from(ZonedDateTime.now()).plusDays(1L);
        System.out.println("School Day One");

        // Teachers
        Teacher teacherOne = new Teacher("Adiel", "April", "adiela@gmail.com");
        teacherOne.addQualifiedSubject(Subject.ENGLISH);
        Teacher teacherTwo = new Teacher("Uthmaan", "May", "mayu@gmail.com");
        teacherTwo.addQualifiedSubject(Subject.PHYSICS);
        Teacher teacherThree = new Teacher("Najaar", "Riyadh", "rnajaar@gmail.com");
        teacherThree.addQualifiedSubject(Subject.MATHEMATICS);
        Teacher teacherFour = new Teacher("Nawaal", "Benjamin", "nbenjamin@gmail.com");
        teacherFour.addQualifiedSubject(Subject.GEOGRAPHY);
        Teacher teacherFive = new Teacher("Nazeema", "Gabs", "zeemag@gmail.com");
        teacherFive.addQualifiedSubject(Subject.BIOLOGY);
        Teacher teacherSix = new Teacher("Dawn", "Klokkers", "nklokkersd@gmail.com");
        teacherSix.addQualifiedSubject(Subject.AFRIKAANS);

        // Learners
        Learner learnerOne = new Learner("Lionel", "Messi", "messi@gmail.com");
        Learner learnerTwo = new Learner("Christiano", "Ronaldo", "cr7@gmail.com");
        Learner learnerThree = new Learner("Paul", "Pogba", "pogbap@gmail.com");
        Learner learnerFour = new Learner("Anthony", "Martial", "martiala@gmail.com");
        Learner learnerFive = new Learner("Marcus", "Rashford", "rashford@gmail.com");
        Learner learnerSix = new Learner("Bruno", "Fernandes", "fernandes@gmail.com");

        // Cafeteria Manager
        Manager theCafeteriaManager = new Manager("Daiyaan", "Dude", "daiyaand@gmail.com", cafeteria);

        learnerOne.register(Subject.ENGLISH);
        learnerTwo.register(Subject.ENGLISH);
        learnerThree.register(Subject.ENGLISH);
        learnerFour.register(Subject.ENGLISH);
        learnerFive.register(Subject.ENGLISH);
        learnerSix.register(Subject.ENGLISH);

        learnerOne.register(Subject.AFRIKAANS);
        learnerTwo.register(Subject.AFRIKAANS);
        learnerThree.register(Subject.AFRIKAANS);
        learnerFour.register(Subject.AFRIKAANS);
        learnerFive.register(Subject.AFRIKAANS);
        learnerSix.register(Subject.AFRIKAANS);

        learnerOne.register(Subject.PHYSICS);
        learnerTwo.register(Subject.PHYSICS);
        learnerThree.register(Subject.PHYSICS);
        learnerFour.register(Subject.PHYSICS);
        learnerFive.register(Subject.PHYSICS);
        learnerSix.register(Subject.PHYSICS);

        learnerOne.register(Subject.GEOGRAPHY);
        learnerTwo.register(Subject.GEOGRAPHY);
        learnerThree.register(Subject.GEOGRAPHY);
        learnerFour.register(Subject.GEOGRAPHY);
        learnerFive.register(Subject.GEOGRAPHY);
        learnerSix.register(Subject.GEOGRAPHY);

        learnerOne.register(Subject.BIOLOGY);
        learnerTwo.register(Subject.BIOLOGY);
        learnerThree.register(Subject.BIOLOGY);
        learnerFour.register(Subject.BIOLOGY);
        learnerFive.register(Subject.BIOLOGY);
        learnerSix.register(Subject.BIOLOGY);

        learnerOne.register(Subject.MATHEMATICS);
        learnerTwo.register(Subject.MATHEMATICS);
        learnerThree.register(Subject.MATHEMATICS);
        learnerFour.register(Subject.MATHEMATICS);
        learnerFive.register(Subject.MATHEMATICS);
        learnerSix.register(Subject.MATHEMATICS);


        // Lesson
        Lesson englishLesson = new Lesson(teacherOne, schoolDayOne, Subject.ENGLISH, theSchool);
        Lesson afrikaansLesson = new Lesson(teacherSix, schoolDayOne, Subject.AFRIKAANS, theSchool);
        Lesson mathematicsLesson = new Lesson(teacherThree, schoolDayOne, Subject.MATHEMATICS, theSchool);
        Lesson geographyLesson = new Lesson(teacherFour, schoolDayOne, Subject.GEOGRAPHY, theSchool);
        Lesson biologyLesson = new Lesson(teacherFive, schoolDayOne, Subject.BIOLOGY, theSchool);
        Lesson physicsLesson = new Lesson(teacherOne, schoolDayOne, Subject.PHYSICS, theSchool);


        // accepting learners into lessons
        englishLesson.acceptLearner(learnerOne);
        englishLesson.acceptLearner(learnerTwo);
        englishLesson.acceptLearner(learnerThree);
        englishLesson.acceptLearner(learnerFour);
        englishLesson.acceptLearner(learnerFive);
        englishLesson.acceptLearner(learnerSix);
        englishLesson.start();
        englishLesson.end();

        // Breakfast
        cafeteria.buy(learnerOne, new BreakFast());
        cafeteria.buy(learnerTwo, new BreakFast());
        cafeteria.buy(learnerThree, new BreakFast());
        cafeteria.buy(learnerFour, new BreakFast());
        cafeteria.buy(teacherOne, new BreakFast());
        cafeteria.buy(teacherTwo, new BreakFast());
        cafeteria.buy(teacherThree, new BreakFast());
        cafeteria.buy(teacherFour, new BreakFast());

        englishLesson.acceptLearner(learnerOne);
        englishLesson.acceptLearner(learnerTwo);
        englishLesson.acceptLearner(learnerThree);
        englishLesson.acceptLearner(learnerFour);
        englishLesson.acceptLearner(learnerFive);
        englishLesson.acceptLearner(learnerSix);
        englishLesson.start();
        englishLesson.end();
        englishLesson.acceptLearner(learnerOne);
        englishLesson.acceptLearner(learnerTwo);
        englishLesson.acceptLearner(learnerThree);
        englishLesson.acceptLearner(learnerFour);
        englishLesson.acceptLearner(learnerFive);
        englishLesson.acceptLearner(learnerSix);
        englishLesson.start();
        englishLesson.end();
        englishLesson.acceptLearner(learnerOne);
        englishLesson.acceptLearner(learnerTwo);
        englishLesson.acceptLearner(learnerThree);
        englishLesson.acceptLearner(learnerFour);
        englishLesson.acceptLearner(learnerFive);
        englishLesson.acceptLearner(learnerSix);
        englishLesson.start();
        englishLesson.end();
        englishLesson.acceptLearner(learnerOne);
        englishLesson.acceptLearner(learnerTwo);
        englishLesson.acceptLearner(learnerThree);
        englishLesson.acceptLearner(learnerFour);
        englishLesson.acceptLearner(learnerFive);
        englishLesson.acceptLearner(learnerSix);
        englishLesson.start();
        englishLesson.end();


        afrikaansLesson.acceptLearner(learnerOne);
        afrikaansLesson.acceptLearner(learnerTwo);
        afrikaansLesson.acceptLearner(learnerThree);
        afrikaansLesson.acceptLearner(learnerFour);
        afrikaansLesson.acceptLearner(learnerFive);
        afrikaansLesson.acceptLearner(learnerSix);
        afrikaansLesson.start();
        afrikaansLesson.end();

        mathematicsLesson.acceptLearner(learnerOne);
        mathematicsLesson.acceptLearner(learnerThree);
        mathematicsLesson.acceptLearner(learnerTwo);
        mathematicsLesson.acceptLearner(learnerFour);
        mathematicsLesson.acceptLearner(learnerFive);
        mathematicsLesson.acceptLearner(learnerSix);
        mathematicsLesson.start();
        mathematicsLesson.end();

        physicsLesson.acceptLearner(learnerOne);
        physicsLesson.acceptLearner(learnerThree);
        physicsLesson.acceptLearner(learnerTwo);
        physicsLesson.acceptLearner(learnerFour);
        physicsLesson.acceptLearner(learnerFive);
        physicsLesson.acceptLearner(learnerSix);
        physicsLesson.start();
        physicsLesson.end();

        geographyLesson.acceptLearner(learnerOne);
        geographyLesson.acceptLearner(learnerThree);
        geographyLesson.acceptLearner(learnerTwo);
        geographyLesson.acceptLearner(learnerFour);
        geographyLesson.acceptLearner(learnerFive);
        geographyLesson.acceptLearner(learnerSix);
        geographyLesson.start();
        geographyLesson.end();

        biologyLesson.acceptLearner(learnerOne);
        biologyLesson.acceptLearner(learnerThree);
        biologyLesson.acceptLearner(learnerTwo);
        biologyLesson.acceptLearner(learnerFour);
        biologyLesson.acceptLearner(learnerFive);
        biologyLesson.acceptLearner(learnerSix);
        biologyLesson.start();
        biologyLesson.end();


        cafeteria.buy(learnerTwo,new Lunch());
        cafeteria.buy(learnerFour,new Lunch());
        cafeteria.buy(learnerFive,new Lunch());
        cafeteria.buy(learnerSix,new Lunch());
        cafeteria.buy(teacherOne,new Lunch());
        cafeteria.buy(learnerOne,new Lunch());
        cafeteria.buy(teacherFive,new Lunch());
        cafeteria.buy(teacherSix,new Lunch());


        cafeteria.buy(learnerTwo,new Drink());
        cafeteria.buy(learnerThree,new Drink());
        cafeteria.buy(learnerFour,new Drink());
        cafeteria.buy(teacherTwo,new Drink());
        cafeteria.buy(teacherThree,new Drink());
        cafeteria.buy(teacherFour,new Drink());
        cafeteria.buy(teacherFive,new Drink());


        cafeteria.buy(learnerTwo,new AfternoonSnack());
        cafeteria.buy(teacherFive,new AfternoonSnack());
        cafeteria.buy(teacherOne,new AfternoonSnack());
        cafeteria.buy(teacherTwo,new AfternoonSnack());
        cafeteria.buy(learnerFive,new AfternoonSnack());
        cafeteria.buy(learnerOne,new AfternoonSnack());


        // End of day
        // The Principal
        System.out.println("Lessons cancelled for a day: " + principalOne.lessonsCancelledForDay());
        System.out.println("Subjects taught for a day: " + principalOne.subjectsTaughtForDay());

        // The Manager
        System.out.println("Daily tokens received: " + theCafeteriaManager.totalDailyTokensReceived());
        System.out.println("Number of purchases: " + theCafeteriaManager.viewAllPurchases().size());
        System.out.println(theCafeteriaManager.viewAllPurchases().toArray()[0].toString());

        // The Learner
        System.out.println(learnerOne.getFirstName().concat(" is ").concat(learnerOne.getLessonNotes().get(0).view().toLowerCase()));
        System.out.println(learnerTwo.getLastName().concat(" is ").concat(learnerTwo.getLessonNotes().get(2).view().toLowerCase()));

        // Tokens left Learner
        System.out.println(learnerFour.getFirstName().concat(" has ") + learnerFour.getTokens() + " tokens left.");
        System.out.println(learnerThree.getFirstName().concat(" has ") + learnerThree.getTokens() + " tokens left.");
        System.out.println(teacherOne.getFirstName().concat(" has ") + teacherOne.getTokens() + " tokens left.");
    }
}

