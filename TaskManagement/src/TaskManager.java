public class TaskManager {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode temp = head;
        while (temp != null) {
            temp.task.display();
            temp = temp.next;
        }
    }

    public void searchTask(int taskId) {
        TaskNode temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId) {
                System.out.println("Task Found:");
                temp.task.display();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        TaskNode current = head;
        TaskNode prev = null;

        while (current != null && current.task.taskId != taskId) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            prev.next = current.next;
            System.out.println("Task deleted.");
        }
    }
}
