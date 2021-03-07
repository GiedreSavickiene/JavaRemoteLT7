package basics;

import fundamentals_tasting.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionExample {

    @Test
    public void testAssertEquals(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(5, 115);

        //then
        assertEquals(120, result);
    }

    @Test
    public void testCalculatosSubtraction(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.sutract(5, 115);

        //then
        assertEquals(-110, result);
    }

    @Test
    public void testingCalculatoDaugyba(){

        Calculator calculator = new Calculator();
        int result = calculator.daugyba(5, 5);
        assertEquals(25, result);
    }

    @Test
    public void testingCalculatosDalyba(){
        Calculator calculator = new Calculator();
        int result = calculator.dalyba(25, 5);
        assertEquals(5, result);
    }

    @Test
    public void testAssertTrueFalce(){
        //given
        int firstNum = 5;
        int secondNum = 15;

        //when
        boolean condition = firstNum == secondNum;

        //then
        assertTrue(firstNum != secondNum);
        assertFalse(condition);
    }
    @Test
    public void testAssertNulOrNotNul(){
        //given
        String emtyText = null;
        String text = "sekmadienis";

        //when

        //then
        assertNull(emtyText);
        assertNotNull(text);
    }
    @Test
    public void testArrayEquals(){
        //given
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {1, 2, 3};

        //when

        //then
        assertArrayEquals(firstArr, secondArr);
    }
    @Test
    public void testSameOrNotSame(){
        //given
        String text1 = "abc"; //string pool
        String text2 = "abc"; //string pool

        String text3 = new String("abc"); //heap

        //when

        //then
        assertSame(text1, text2);
        assertSame(text2, text1);
    }


}
