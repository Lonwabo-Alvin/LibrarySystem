package tests;

import org.junit.jupiter.api.Test;
import src.patterns.prototype.BookPrototype;
import src.Book;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {

    @Test
    public void testCloneBook() {
        Book original = new Book("B101", "Original Book", "Author A", "123");
        BookPrototype prototype = new BookPrototype(original);
        Book clone = prototype.cloneBook();

        assertNotNull(clone);
        assertNotEquals(original.getBookId(), clone.getBookId());
        assertEquals(original.getTitle(), clone.getTitle());
    }
}