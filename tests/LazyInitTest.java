package tests;

import org.junit.jupiter.api.Test;
import src.patterns.lazyinit.Configuration;

import static org.junit.jupiter.api.Assertions.*;

public class LazyInitTest {

    @Test
    public void testLazyInit() {
        Configuration config = Configuration.getInstance();
        assertNotNull(config);
        assertTrue(config.getDbUrl().contains("localhost"));
    }
}
