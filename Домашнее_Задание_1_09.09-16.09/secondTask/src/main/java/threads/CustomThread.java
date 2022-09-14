package threads;

public class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Hi, I am " + Thread.currentThread().getName());
    }
}
