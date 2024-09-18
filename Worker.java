public class Worker extends Thread {
    private final int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.printf("Worker #%d is starting task\n", id);
        try {
            sleep(5000); // Worker is working hard for 5 seconds
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Worker #%d has finished task\n", id);
    }
}
