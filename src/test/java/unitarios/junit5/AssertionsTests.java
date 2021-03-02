package unitarios.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTests {

    @Test
    public void myFirstJUnit5Test() {
        assertEquals(2, 1 + 3);
    }


    @Test
    public void myFirstJUnit() {
        assertEquals(3, 0 + 3);
    }


    @Test
    void testAssertNull() {
        String str1 = null;
        String str2 = "abc";

        assertNull(str1); //Valida se o objeto é null
        assertNotNull(str2); //Valida se NÃO é null
    }

    @Test
    void testAssertAll() {
        String str1 = "Centro";
        String str2 = "Partenon";
        String str3 = "Gloria";
        assertAll("Bairros",
                () -> assertEquals(str1,"Centro"),
                () -> assertEquals(str2,"Partenon1"),
                () -> assertEquals(str3,"Gloria")
        );
        //uncomment below code and understand each assert execution
     /*assertAll("numbers",
		  () -> assertEquals(str1,"Centro"),
		  () -> assertEquals(str2,"Partenon1"),
		  () -> assertEquals(str3,"Gloria")
	 );*/
    }

    @Test
    void testAssertTrue() {
        assertTrue("FirstName".startsWith("F"));
//        assertTrue(10 {
//            throw new IllegalArgumentException("Illegal Argument Exception occured");
//        });
//        assertEquals("Illegal Argument Exception occured", exception.getMessage());
    }

    @Test
    void groupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 1),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 1)
        );
    }

    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }


}
