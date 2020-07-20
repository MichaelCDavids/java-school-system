package net.school;

import java.util.ArrayList;

public class Teacher extends Person {
    private int numberOfLessonsTaught;
    private boolean isTeaching;
    private ArrayList<Subject> qualifiedSubjects = new ArrayList<>();

    public Teacher(String first, String last, String emailAddress) {
        super(first, last, emailAddress);
    }

    public void addQualifiedSubject(Subject subject) {
        qualifiedSubjects.add(subject);
    }

    public ArrayList<Subject> getQualifiedSubjects() {
        return qualifiedSubjects;
    }

    public boolean isTeaching() {
        return isTeaching;
    }

    public void setTeaching(boolean teaching) {
        isTeaching = teaching;
    }

    public void incrementNumberOfLessonsTaught() {
        this.numberOfLessonsTaught++;
    }

    public int getNumberOfLessonsTaught() {
        return numberOfLessonsTaught;
    }

    public boolean isQualifiedFor(Subject subject){
        return getQualifiedSubjects().contains(subject);
    }

    public void lessonTaught(int amountOfTokens, boolean isTeaching){
        setTeaching(isTeaching);
        earnTokens(amountOfTokens);
        incrementNumberOfLessonsTaught();
    }
}
