import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {


//    @Test
//    public void testIfNamesAreEqual(){
//        String name = "Jane";
//        String input = "jane";
//
//        assertEquals(name,input);
//    }
//
//    @Test
//    public void testIfNumbersAreEqual(){
//        int myNumber = 5;
//        int userInput = 5;
//        assertEquals(myNumber,userInput);
//    }
//
//
//    @Test
//    public void testIfChangeIsCorrect() {
//        Double price = 10.0;
//        Double discount = 4.5;
//
//        assertEquals(5.5, price - discount, 0);
//        assertEquals(5.1, price - discount, 0.5);
//        assertNotEquals(4.9, price - discount, 0.5);
//    }
//
//
//    @Test
//    public void testIfObjectsAreDifferent() {
//        Object dog = new Object();
//        Object sheep = new Object();
//        Object clonnedSheep = sheep;
//
//        assertNotSame(sheep, dog);
//        assertSame(sheep, clonnedSheep);
//    }
//
//    @Test
//    public void testIfArrayEquals() {
//        char[] expected = {'J','u','n','i','t'};
//        char[] actual = "Junit".toCharArray();
//
//        assertArrayEquals(expected, actual);
//    }
//
//
//    @Test
//    public void testIfGreaterOrLesserThanWorks() {
//
//        boolean learningTDD = true;
//
//        assertTrue(learningTDD);
//        assertTrue("5 is greater than 4", 5 > 4);
//        assertFalse("5 is not greater than 6", 5 > 6);
//    }
//
//    @Test
//    public void testIfInstanceIsNull() {
//        Object phone = new Object();
//        Object laptop = null;
//        assertNull(null);
//        assertNotNull(phone);
//    }



    @Test
    public void testIfNamesAreEqual(){
        String name = "Codeup";
        String input = "CodeUp";

        assertNotEquals(name,input);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);

    }

    @Test
    public void testIfArrayEquals() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }


    @Test
    public void testIfGreaterOrLesserThanWorks() {
        String language = "PHP";

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));

    }
}
