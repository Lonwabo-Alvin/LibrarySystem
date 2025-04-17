package tests;

import org.junit.jupiter.api.Test;
import src.patterns.singleton.LibrarySystem;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        LibrarySystem s1 = LibrarySystem.getInstance();
        LibrarySystem s2 = LibrarySystem.getInstance();
        assertSame(s1, s2);
    }
}
