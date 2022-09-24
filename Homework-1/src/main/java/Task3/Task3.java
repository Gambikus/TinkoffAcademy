package Task3;

import Task3.components.SingletonExample;

public class Task3 {
    public static void main(String[] args) {
        SingletonExample firstExample = SingletonExample.getInstance();
        SingletonExample secondExample = SingletonExample.getInstance();
    }
}
