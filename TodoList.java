import java.util.*;
public class TodoList{
    private ArrayList<Task> tasks;

    public TodoList(){
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(String description){
        tasks.add(new Task(description));
    }

    public void viewTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks in the list");
            return;
        }

        for(int i = 0; i< tasks.size();i++){
            System.out.println((i+1)+ ". "+ tasks.get(i));
        }
    }

    public void markTaskDone(int index){
        if(index < 1  || index > tasks.size()){
            System.out.println("Invalid task number");
            return;
        }

        tasks.get(index - 1).markAsDone();
        System.out.println("Task "+ tasks.get(index - 1).getDescription()+ " marked as done.");

    }

    public void removeTask(int index){
        if(index < 1  || index > tasks.size()){
            System.out.println("Invalid task number");
            return;
        }
        String description = tasks.get(index - 1).getDescription();

        tasks.remove(index - 1);
        System.out.println("Task "+ description + " is removed.");
    }
}