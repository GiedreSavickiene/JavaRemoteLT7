package concutency.example3;



    public class StopWatch extends Thread {

        private String threadName;

        public StopWatch(String getThreadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 0; i< 10; i++){
                System.out.println("Stop watch: " + i);



                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


