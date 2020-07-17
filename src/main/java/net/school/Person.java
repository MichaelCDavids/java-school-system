package net.school;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private double tokens;

    public Person(String first, String last, String emailAddress) {
        firstName = first;
        lastName = last;
        email = emailAddress;
        tokens = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getTokens() {
        return tokens;
    }

    public void earnTokens(int tokenAmount) {
        tokens += tokenAmount;
    }

    public void useTokens(double tokenAmount) {
        tokens -= tokenAmount;
    }
}
