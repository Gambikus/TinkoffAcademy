import components.SingletonExample;

public class Main {
    public static void main(String[] args) {
        SingletonExample firstExample = SingletonExample.getInstance();
        SingletonExample secondExample = SingletonExample.getInstance();
    }
}
