class Worker extends Thread {

    private int workerId;
    private TaskList taskList;

    public Worker(int workerId, TaskList taskList) {
        this.workerId = workerId;
        this.taskList = taskList;
    }

    @Override
    public void run() {
        while (true) {
            String task = taskList.getTask();
            if (task == null) {
                break;
            }
            System.out.println("Worker " + workerId + " is performing " + task);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Worker " + workerId + " was interrupted.");
            }
        }
    }
}