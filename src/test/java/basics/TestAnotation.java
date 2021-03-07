package basics;

import org.junit.jupiter.api.*;

public class TestAnotation {
//ctrl + alt + o - suskleidzia ir isskleidzia metodis

    @BeforeAll
    public static void stUp(){
        System.out.println("This message will be display once before executing all test methods");
    }

    @BeforeEach
    public void init(){
        System.out.println("This message will be shown before each test methods");
    }



    @AfterAll
    public static void tearDown(){
        System.out.println("This message will be dispayed once after executingall test methods");
    }

    @AfterEach
    public void tear(){
        System.out.println("This mesage will be shoun after all test");
    }

    @Test
    public void firstTest() {
        System.out.println("Executing first test...");
    }
    @Test
    public void secondTest(){
        System.out.println("Executing second test...");
    }

    @Test
    @DisplayName("Thirs test")
    public void thirdTest(){
        System.out.println("Executing third test... ");
    }

    @Test
    @Disabled
    public void fourthTest() {
        System.out.println("Executing third test..");
    }

}
