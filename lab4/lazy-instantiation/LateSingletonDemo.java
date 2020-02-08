class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) 
            instance = new Singleton();
        return instance;    
    }

}

public class LateSingletonDemo {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    } 
}