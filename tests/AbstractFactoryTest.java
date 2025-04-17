package tests;


import org.junit.jupiter.api.Test;
import src.patterns.abstractfactory.User;
import src.patterns.abstractfactory.UserFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AbstractFactoryTest {

    @Test
    public void testCreateStudent() {
        User student = UserFactory.getUser("student");
        assertNotNull(student);
    }

    @Test
    public void testCreateInvalidUser() {
        User unknown = UserFactory.getUser("admin");
        assertNull(unknown);
    }
}

