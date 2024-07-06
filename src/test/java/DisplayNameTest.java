import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Dawno i nie prawda...")
public class DisplayNameTest {

    @Test
    @DisplayName("Tutaj jest miejsca na opis nazwy testu")
    void testNumerJeden() {}

    @Test
    @DisplayName("Tutaj jest miejsca na opis nazwy 2 testu \uD83D\uDC13")
    void testNumerDwa() {}
}
