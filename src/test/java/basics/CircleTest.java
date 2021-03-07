package basics;

import fundamentals_tasting.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void shouldCalculateCirclePerimeter() {
        //given
        Circle circle = new Circle(10);

        //when
        int result = circle.calculateCircleLenght();

        //then
        Assertions.assertEquals(62, result);
    }

    @Test
    public void shouldCalculateCircleArea(){
        Circle circle = new Circle(20);

        int result = circle.calculateCircleArea();

        Assertions.assertEquals(1256, result);
    }
}
