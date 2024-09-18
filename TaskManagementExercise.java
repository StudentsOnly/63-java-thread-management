public class TaskManagementExercise {

  public static void main(String[] args) {

    Worker worker1 = new Worker(1);
    Worker worker2 = new Worker(2);
    Worker worker3 = new Worker(3);
    Worker worker4 = new Worker(4);
    Worker worker5 = new Worker(5);

    worker1.start();
    worker2.start();
    worker3.start();
    worker4.start();
    worker5.start();

    try {
      Thread.sleep(4000);
      worker1.join();
      worker2.join();
      worker3.join();
      worker4.join();
      worker5.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
