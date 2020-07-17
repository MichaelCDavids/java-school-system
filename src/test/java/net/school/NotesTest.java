package net.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotesTest {

    @Test
    public void NotesTest() {
        Notes notes = new Notes(Subject.ENGLISH);
        assertTrue(notes instanceof Notes);
    }

    @Test
    public void getSubject() {
        Notes notes = new Notes(Subject.ENGLISH);
        assertEquals(Subject.ENGLISH, notes.getSubject());
    }

    @Test
    public void view() {
        Notes notes = new Notes(Subject.ENGLISH);
        assertEquals("Viewing english notes", notes.view());
    }
}
