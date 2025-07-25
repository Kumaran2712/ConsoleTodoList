import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp{

    public static void main(String[] args){
    System.out.println("Welcome to Todo List App!");
    // Task myTask = new Task("Job Search");
    // System.out.println(myTask);
    // myTask.markAsDone();
    // System.out.println(myTask);
    // TodoList todoList = new TodoList();
    // todoList.addTask("Study");
    // todoList.addTask("Code");
    // todoList.addTask("travel");
    // todoList.viewTasks();

    // todoList.markTaskDone(1);
    // todoList.markTaskDone(3);
    // todoList.removeTask(2);
    // todoList.viewTasks();

    Scanner scanner = new Scanner(System.in);
    TodoList todoList = new TodoList();
    boolean running = true;

    System.out.println("Welcome to Todo List App");

    while(running){
        System.out.println("\nMenu:");
        System.out.println("1. Add task");
        System.out.println("2. View tasks");
        System.out.println("3. Mark task as done");
        System.out.println("4. Remove task");
        System.out.println("5. Exit");
        System.out.print("Choose an option (1-5): ");

        int choice;
        try{
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Please enter a valid number.");
                continue;
        }
        switch (choice){
            case 1:
                System.out.println("Enter the task Description: ");
                String description = scanner.nextLine();
                if(description.trim().isEmpty()){
                    System.out.println("Task description cannot be empty. ");
                }else{
                    todoList.addTask(description);
                    System.out.println("Task added.");
                    break;
                }

            case 2:
                todoList.viewTasks();
                break;
            
            case 3:
                System.out.println("Enter task number to mark as Done");
                try{
                    int index = Integer.parseInt(scanner.nextLine());
                    todoList.markTaskDone(index);
                } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
            case 4:
                    System.out.print("Enter task number to remove: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        todoList.removeTask(index);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;

            case 5: 
            running = false;
            System.out.println("Tataa!!!");
            break;
           default:
                    System.out.println("Invalid option. Choose 1-5."); 
            }
        }
        scanner.close();
    }

    }
    
