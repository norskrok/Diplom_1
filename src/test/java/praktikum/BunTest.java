package praktikum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BunTest {
    @Test
    public void bunGetMethodsTest() {
        Bun bun = new Bun("black bun", 100);
        assertEquals("black bun", bun.getName());
        assertEquals(100, bun.getPrice(), 0.001f);
    }
}