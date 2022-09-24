package Task4.components;

public class LinkedList {
    private class Node {
        Node next;
        int value;
        Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public LinkedList() {
        size = 0;
        head = null;
    }

    public void add(int value) {
        Node cur = head;
        while (cur != null && cur.next != null) {
            cur = cur.next;
        }

        if (cur == null) {
            head = new Node(value, null);
        } else {
            cur.next = new Node(value, null);
        }
        size++;
        System.err.println("Элемент добавлен");
    }

    public int deleteMin() {
        if (head == null) {
            return -1;
        }
        Node cur = head;
        int minVal = 100000; // INF
        while (cur != null) {
            minVal = Math.min(minVal, cur.value);
            cur = cur.next;
        }
        deleteItem(minVal);
        return minVal;
    }

    public void printMax() {
        if (head == null) {
            return;
        }
        Node cur = head;
        int maxVal = -1; // -INF
        while (cur != null) {
            maxVal = Math.max(maxVal, cur.value);
            cur = cur.next;
        }
        System.out.println("Максимальный элемент списка имеет значение - " + maxVal);
    }

    public void deleteItem(int value) {
        if (head == null) {
            System.err.println("Элемент не удалось удалить, так как список пуст");
            return;
        }
        if (head.value == value) {
            head = head.next;
        } else {
            Node cur = head;
            while(cur.next != null && cur.next.value != value) {
                cur = cur.next;
            }
            if (cur.next != null) {
                cur.next = cur.next.next;
            } else {
                System.err.println("Элемент не удалось удалить, так как такого элемента нет");
            }
        }
        size--;
        System.err.println("Элемент удален");
    }

    public void printList() {
        System.out.print("Linked list: [");
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value);
            if (cur.next == null) {
                System.out.println("]");
            } else {
                System.out.print(" -> ");
            }
            cur = cur.next;
        }
    }

    public void addInMiddle(int value) {
        int i = 0;
        Node cur = head;
        while (i != size / 2 - 1) {
            i++;
            cur = cur.next;
        }
        Node temp = cur.next;
        cur.next = new Node(value, temp);
    }

}
