package Task14.components;

public class QueueWithFixedLength {
    Node head;
    Node tail;
    int size;
    static final int MAX_SIZE = 10;

    public QueueWithFixedLength() {
        size = 0;
        head = null;
        tail = null;
    }

    public int add(int val) {
        if (head == null) {
            head = new Node(null, val);
        } else if (tail == null) {
            tail = new Node(null, val);
            head.next = tail;
        } else {
            if (size == 10) {
                poll();
            }
            Node cur = new Node(null, val);
            tail.next = cur;
            tail = cur;
        }
        size++;
        return getMultiplication();
    }

    public void print() {
        Node cur = head;
        while (cur != null) {
            if (cur == tail) {
                System.out.println(cur.value);
            } else {
                System.out.print(cur.value + " <= ");
            }
            cur = cur.next;
        }
    }

    public int getMultiplication() {
        Node cur = head;
        int res = 1;
        while(cur != null) {
            res *= cur.value;
            cur = cur.next;
        }
        return res;
    }

    public int poll() {
        int res = head.value;
        if (tail == null) {
            head = null;
        } else {
            head = head.next;
            if (head.next == null) {
                tail = null;
            }
        }
        size--;
        return res;
    }
}
