package net.school;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Lesson {
    private Subject subject;
    private LocalDateTime lessonDateTime;
    private Teacher teacher;
    private Notes notes;
    private ArrayList<Learner> learners = new ArrayList<>();
    private School school;

    public Lesson(Teacher teacher, LocalDateTime time, Subject subject, School school) {
        this.school = school;
        this.subject = subject;
        this.lessonDateTime = time;
        this.teacher = acceptTeacher(teacher);
        this.notes = new Notes(subject);
    }

    private Teacher acceptTeacher(Teacher teacher) {
        if (teacher.getQualifiedSubjects().contains(this.subject)) {
            teacher.setTeaching(true);
            return teacher;
        }
        school.updateLessonsCancelled();
        return teacher;
    }

    public boolean acceptLearner(Learner learner) {
        if (learner.getRegisteredSubjects().size() >= 3) {
            if (learner.getRegisteredSubjects().contains(subject)) {
                if (!learner.isAttending()) {
                    learners.add(learner);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean start() {
        if (learners.size() >= 5) {
            for (Learner learner : learners) {
                learner.attend(this);
            }
            return true;
        }
        return false;
    }

    public void end() {
        for (Learner learner : learners) {
            learner.updateLessonNotes(notes);
            learner.setAttending(false);
            learner.earnTokens(3);
        }
        teacher.incrementNumberOfLessonsTaught();
        teacher.earnTokens(5);
        teacher.setTeaching(false);
        school.addSubjectsTaught(subject);
    }
}
