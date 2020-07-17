package net.school;

import java.util.ArrayList;

public class School {
    private int lessonsCancelled;
    private ArrayList<Subject> subjectsTaught = new ArrayList<>();

    public int getLessonsCancelled() {
        return lessonsCancelled;
    }

    public void updateLessonsCancelled() {
        lessonsCancelled++;
    }

    public int getSubjectsTaught() {
        return subjectsTaught.size();
    }

    public void addSubjectsTaught(Subject subject) {
        if (!subjectsTaught.contains(subject)) {
            subjectsTaught.add(subject);
        }
    }
}
