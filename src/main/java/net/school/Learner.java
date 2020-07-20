package net.school;

import java.util.ArrayList;

public class Learner extends Person {
    private boolean isAttending;
    private ArrayList<Lesson> lessonsAttended = new ArrayList<>();
    private ArrayList<Notes> lessonNotes = new ArrayList<>();
    private ArrayList<Notes> boughtNotes = new ArrayList<>();
    private ArrayList<Subject> registeredSubjects = new ArrayList<>();

    public Learner(String first, String last, String emailAddress) {
        super(first, last, emailAddress);
    }

    public void register(Subject subject) {
        registeredSubjects.add(subject);
    }

    public void attend(Lesson lesson) {
        if (!isAttending()) {
            if (isRegisteredForEnoughSubjects()) {
                this.setAttending(true);
                this.lessonsAttended.add(lesson);
            }
        }
    }

    public ArrayList<Subject> getRegisteredSubjects() {
        return registeredSubjects;
    }

    public boolean isAttending() {
        return isAttending;
    }

    public void setAttending(boolean attending) {
        isAttending = attending;
    }

    public void updateLessonNotes(Notes notes) {
        lessonNotes.add(notes);
    }

    public ArrayList<Notes> getLessonNotes() {
        return lessonNotes;
    }

    public void purchaseLessonNotes(Learner learner, Notes notes) {
        if (hasLessonNotes(learner,notes)) {
            if (isRegisteredFor(notes.getSubject())) {
                this.useTokens(3);
                learner.earnTokens(3);
                updateBoughtNotes(notes);
                return;
            }
            this.useTokens(5);
            learner.earnTokens(5);
            updateBoughtNotes(notes);
            return;
        }
    }

    public boolean hasLessonNotes(Learner learner,Notes notes){
        return learner.getLessonNotes().contains(notes);
    }

    public void updateBoughtNotes(Notes notes) {
        boughtNotes.add(notes);
    }

    public ArrayList<Notes> getBoughtNotes() {
        return boughtNotes;
    }

    public boolean isRegisteredFor(Subject subject) {
        return getRegisteredSubjects().contains(subject);
    }

    public boolean isRegisteredForEnoughSubjects(){
        return getRegisteredSubjects().size() >= 3;
    }

    public void attendedLesson(Notes notes, boolean isAttending, int tokens) {
        updateLessonNotes(notes);
        setAttending(isAttending);
        earnTokens(tokens);
    }

}
