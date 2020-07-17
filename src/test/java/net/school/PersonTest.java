package net.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    @Test
    public void PersonTest() {
        Person daiyaan = new Person("Daiyaan", "Davids", "doubled@gmail.com");
        assertTrue(daiyaan instanceof Person);
    }

    @Test
    public void PersonGetFirstName() {
        Person daiyaan = new Person("Daiyaan", "Davids", "doubled@gmail.com");
        assertEquals("Daiyaan", daiyaan.getFirstName());
    }

    @Test
    public void PersonGetLastName() {
        Person daiyaan = new Person("Daiyaan", "Davids", "doubled@gmail.com");
        assertEquals("Davids", daiyaan.getLastName());
    }

    @Test
    public void PersonGetEmail() {
        Person daiyaan = new Person("Daiyaan", "Davids", "doubled@gmail.com");
        assertEquals("doubled@gmail.com", daiyaan.getEmail());
    }

    @Test
    public void PersonGetTokens() {
        Person daiyaan = new Person("Daiyaan", "Davids", "doubled@gmail.com");
        assertEquals(0.0, daiyaan.getTokens());
    }

    @Test
    public void personEarnTokens() {
        Person mike = new Person("Mike", "Dave", "mikedave@gmail.com");
        mike.earnTokens(5);
        assertEquals(5, mike.getTokens());
    }

    @Test
    public void personUseTokens() {
        Person mike = new Person("Mike", "Dave", "mikedave@gmail.com");
        mike.earnTokens(5);
        mike.useTokens(2.5);
        assertEquals(2.5, mike.getTokens());
    }
}
