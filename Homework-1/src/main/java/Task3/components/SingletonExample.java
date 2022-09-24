package Task3.components;

public class SingletonExample {
    private SingletonExample() {
        System.out.println("Экземпляр синглетона создан!!!");
    }

    private static class SingletonHolder {
        private final static SingletonExample instance = new SingletonExample();
    }

    public static SingletonExample getInstance() {
        System.err.println("Обращение к классу!!!");
        return SingletonHolder.instance;
    }
}
