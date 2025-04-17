package tests;

import org.junit.jupiter.api.Test;
import src.Book;
import src.patterns.builder.BookBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {

    @Test
    public void testBuildBook() {
        Book book = new BookBuilder()
                .setTitle("Effective Java")
                .setAuthor("Joshua Bloch")
                .setIsbn("123456789")
                .build();

        assertNotNull(book);
        assertEquals("Effective Java", book.getTitle());
        assertEquals("Available", book.getStatus());
    }

    @Test
    public void testBuilderWithMissingTitle() {
        Book book = new BookBuilder().setAuthor("Someone").setIsbn("XYZ").build();
        assertNull(book.getTitle());
    }
}
