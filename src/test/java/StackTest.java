import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@DisplayName("Stack test")
public class StackTest {

    @Test
    @DisplayName("to jest test 1")
    void isInstantiated(){}
}

@Nested
@DisplayName("when empty")
class WhenNew {

    @Test
    @DisplayName("is empty")
    void isEmpty() {
    }

    @Test
    @DisplayName("throws Exception when popped")
    void throwsExceptionWhenPopped() {
    }

    @Nested
    @DisplayName("after pushing an element")
    class AfterPushing {


        @Test
        @DisplayName("it is no longer empty")
        void isNotEmpty() {

        }
        @DisplayName("Repetead")
        @RepeatedTest(2)
        void test() {
            System.out.println("Test który się powtarza");
        }
    }
}
