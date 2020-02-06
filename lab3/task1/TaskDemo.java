class Task {
    private String name;
    private boolean isCompleted;

    public void setName(String name) {
        this.name = name;
    }

    public void markAsComplete() {
        this.isCompleted = true;
    }
}

public class TaskDemo {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();
        t2.markAsComplete();
    }
}