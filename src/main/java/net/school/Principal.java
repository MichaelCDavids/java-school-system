package net.school;

class Principal extends Person {

    School school;

    public Principal(String first, String last, String emailAddress, School school) {
        super(first, last, emailAddress);
        this.school = school;
    }

    public int subjectsTaughtForDay() {
        return school.getSubjectsTaught();
    }

    public int lessonsCancelledForDay() {
        return school.getLessonsCancelled();
    }
}
