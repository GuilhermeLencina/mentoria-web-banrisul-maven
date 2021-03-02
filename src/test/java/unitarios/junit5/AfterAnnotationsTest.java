package unitarios.junit5;

import org.junit.jupiter.api.*;

public class AfterAnnotationsTest {
    @DisplayName("Add operation test")
    @RepeatedTest(5)
    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo)
    {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }

    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }
}
