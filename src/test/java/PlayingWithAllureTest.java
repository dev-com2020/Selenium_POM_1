import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayingWithAllureTest {

    @Test
    void successTest() {
        assertTrue(true);
    }
    @Test
    void failureTest() {
        fail();
    }
    @Test
    void brokenTest() {
        throw new RuntimeException("To jest broken test");
    }

    @Test
    void slowSuccessTest() throws InterruptedException {
        Thread.sleep(500);
    }

    @Test
    void myTest() {
        String message = "1+1 should be equal to 2";
        System.out.println(message);
        assertEquals(2,1+1,message);
    }

}
