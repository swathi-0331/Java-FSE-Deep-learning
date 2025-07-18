public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add tasks
        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Develop Backend", "In Progress"));
        manager.addTask(new Task(3, "Test Features", "Pending"));

        // Display all tasks
        System.out.println("All Tasks:");
        manager.displayTasks();

        // Search a task
        System.out.println("\nSearch for Task ID 2:");
        manager.searchTask(2);

        // Delete a task
        System.out.println("\nDelete Task ID 1:");
        manager.deleteTask(1);

        // Display after deletion
        System.out.println("\nTasks After Deletion:");
        manager.displayTasks();

        // Time complexity explanation
        System.out.println("\nTime Complexity:");
        System.out.println("Add: O(n)");
        System.out.println("Search: O(n)");
        System.out.println("Delete: O(n)");

        System.out.println("\nAdvantages of Linked List:");
        System.out.println("- Dynamic size (no need to define size initially)");
        System.out.println("- Efficient insert/delete operations compared to arrays (no shifting)");
    }
}
