package concutency.example3;



public class ConcurencyExample {

    public static void main(String[] args) {
        System.out.println("Main tread starts!");

        StopWatch sw1 = new StopWatch("SW1");
        StopWatch sw2 = new StopWatch("SW2");

        sw1.start();

        try {
            Thread.sleep(1000);
            sw2.start();

            System.out.println("Main tread is still running");

            Thread.sleep(3000);
            System.out.println("Main tread ends :/");
        } catch (InterruptedException e) {
            System.out.println("Tread was interrputed on sleep");
        }
    }

}
