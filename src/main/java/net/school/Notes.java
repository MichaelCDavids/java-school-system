package net.school;

public class Notes {

    private Subject subject;

    public Notes(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public String view() {
        return "Viewing " + subject.name().toLowerCase() + " notes";
    }
}
