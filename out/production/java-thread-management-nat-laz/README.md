## Exercise: Creation and Management of Threads

#### Objective:
The objective of this exercise is to create a program that simulates a simple task management system with multiple workers (threads) performing tasks concurrently.

#### Instructions:

1.	Create a Java class named TaskManagementExercise with a main method.
2.	Create a class named Worker that extends the Thread class. Each worker represents a thread that performs a task.
3.	Implement the run method in the Worker class. In the run method, simulate the worker performing a simple task by printing a message (e.g., "Worker <worker-id> is performing a task").
4.	In the main method of the TaskManagementExercise class, create multiple instances of the Worker class (e.g., 5 workers).
5.	Start all the worker threads to simulate concurrent task execution.
6.	Print messages indicating when each worker is performing a task.
