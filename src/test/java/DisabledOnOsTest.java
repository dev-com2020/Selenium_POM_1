import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.WINDOWS;


public class DisabledOnOsTest {

    @DisabledOnOs({ WINDOWS,LINUX })
    @Test
    void conditionalTest(){
        System.out.println("Ten test będzie wyłączony na MAC i LINUX");
    }
}
