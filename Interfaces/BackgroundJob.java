package interfaces;

public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> {
            try {
                System.out.println("Job started...");
                Thread.sleep(2000);
                System.out.println("Job completed successfully!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(job);
        thread.start();
    }
}

