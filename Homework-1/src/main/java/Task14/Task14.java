package Task14;

import Task14.components.QueueWithFixedLength;

public class Task14 {
    public static void main(String[] main) {
        QueueWithFixedLength queue = new QueueWithFixedLength();
        for (int i = 1; i < 10; i++) {
            System.out.println("Добавление в очередь " + i + ", произведение элементов: " + queue.add(i));
            System.out.println("Текущеее состояние очереди: ");
            queue.print();
        }
        for (int i = -5; i < 1; i++) {
            System.out.println("Добавление в очередь " + i + ", произведение элементов: " + queue.add(i));
            System.out.println("Текущеее состояние очереди: ");
            queue.print();
        }
    }
}
