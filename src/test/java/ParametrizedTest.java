import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class ParametrizedTest {


    @ParameterizedTest(name = "Mój test #{index} -- input data: {0} and {1}")
//    @CsvSource({
//            "1,hello",
//            "2,goodbye"
//
//    })
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 0)

    public void test(Integer input1, String input2) {
        System.out.println(input1 + " " + input2);
    }
}
