package basic;

import fundamentals_tasting.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionExample {

    @Test
    public void testAssertEquals(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(5, 115);

        //then
        Assertions.assertEquals(120, result);
    }

    @Test
    public void testCalculatosSubtraction(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(5, 115);

        //then
        Assertions.assertEquals(-110, result);
    }

    @Test
    public void testingCalculatoDaugyba(){

        Calculator calculator = new Calculator();
        int result = calculator.add(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void testingCalculatosDalyba(){
        Calculator calculator = new Calculator();
        int result = calculator.add(25, 5);
        Assertions.assertEquals(5, result);
    }

}
