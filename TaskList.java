import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final List<String> tasks = new ArrayList<>();
    private boolean done = false;

    public synchronized void addTask(String task) {
        tasks.add(task);
        System.out.println(task + " added to the list.");
        notify();
    }

    public synchronized void setDone() {
        done = true;
        notifyAll();
    }

    public synchronized String getTask() {
        while (tasks.isEmpty() && !done) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error: Interrupted while waiting for tasks to finish. " + e);
            }
        }

        if (!tasks.isEmpty()) {
            return tasks.remove(0);  // return the next task if available
        } else if (done) {
            return null;
        }

        return null; // fallback mechanism
    }
}
