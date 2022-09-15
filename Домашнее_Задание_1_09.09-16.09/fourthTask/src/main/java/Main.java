import components.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 101));
        }
        System.out.println("Создан список из 10 элементов");
        list.printList();
        System.out.println("Удален минимальный элемент со значением - " + list.deleteMin());
        list.printMax();
        list.printList();
        int newVal = (int)(Math.random() * 101);
        list.addInMiddle(newVal);
        System.out.println("Список с добавленным в центр элементов со значение - " + newVal);
        list.printList();
    }
}
