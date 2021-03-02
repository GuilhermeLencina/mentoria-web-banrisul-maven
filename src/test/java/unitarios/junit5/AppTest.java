package unitarios.junit5;

import org.junit.jupiter.api.*;

public class AppTest {
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @Test
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }

    //@Disabled
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }

//    @Test
//    void testCase()
//    {
//        //Test will pass
//        Assertions.assertEquals(4, Calculator.add(2, 2));
//
//        //Test will fail
//        Assertions.assertEquals(3, Calculator.add(2, 2), "Calculator.add(2, 2) test failed");
//
//        //Test will fail
//        Supplier<String> messageSupplier  = ()-> "Calculator.add(2, 2) test failed";
//        Assertions.assertEquals(3, Calculator.add(2, 2), messageSupplier);
//    }

}
