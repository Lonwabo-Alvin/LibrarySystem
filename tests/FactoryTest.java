package tests;

import org.junit.jupiter.api.Test;
import src.Book;
import src.patterns.factory.BookFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FactoryTest {

    @Test
    public void testCreateNovelBook() {
        Book novel = BookFactory.createBook("novel");
        assertNotNull(novel);
        assertEquals("The Great Gatsby", novel.getTitle());
        assertEquals("Available", novel.getStatus());
    }

    @Test
    public void testUnknownBookType() {
        Book unknown = BookFactory.createBook("unknown");
        assertEquals("General Book", unknown.getTitle());
    }
}
