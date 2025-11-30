import org.example.Main;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void addNumbers_shouldReturnCorrectResult() {
        int result = Main.add(2, 3);
        assertEquals(5, result);
    }
}
