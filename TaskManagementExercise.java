class TaskManagementExercise {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();

        Worker worker1 = new Worker(1, taskList);
        Worker worker2 = new Worker(2, taskList);
        Worker worker3 = new Worker(3, taskList);
        Worker worker4 = new Worker(4, taskList);
        Worker worker5 = new Worker(5, taskList);

        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        worker5.start();

        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        taskList.addTask("Task 3");
        taskList.addTask("Task 4");
        taskList.addTask("Task 5");

        taskList.setDone();

        try {
            worker1.join();
            worker2.join();
            worker3.join();
            worker4.join();
            worker5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All workers have finished. Exiting the program.");
    }
}
