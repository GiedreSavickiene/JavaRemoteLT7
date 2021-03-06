package concutency.example1;

public class ConcurencyExample {

    public static void main(String[] args) {
        System.out.println("Main tread starts!");

        try {
            Thread.sleep(2000);
        System.out.println("Main tread is still running");

        Thread.sleep(3000);
        System.out.println("Main tread ends :/");
        }catch (InterruptedException e) {
            System.out.println("Tread was interrputed on sleep");
        }

    }
}
