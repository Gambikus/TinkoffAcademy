package Task9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Среднее время добавления числа в ArrayList, в нанос: " +
                testAddingToArrayList(arrList, arr));
        System.out.println("Среднее время добавления числа в LinkedList, в нанос: " +
                testAddingToLinkedList(linkedList, arr));
        System.out.println("Время удаления первого числа в ArrayList, в нанос: " +
                testDeletingFromArrayList(arrList, 0));
        System.out.println("Время удаления первого числа в LinkedList, в нанос: " +
                testDeletingFromLinkedList(linkedList, 0));
        System.out.println("Время удаления последнего числа в ArrayList, в нанос: " +
                testDeletingFromArrayList(arrList, 8));
        System.out.println("Время удаления последнего числа в LinkedList, в нанос: " +
                testDeletingFromLinkedList(linkedList, 1));
        System.out.println("Время удаления всех чисел больших 2 в ArrayList, в нанос: " +
                testDeleteIfGreater(arrList,3));
        System.out.println("Время удаления всех чисел больших 2 в LinkedList, в нанос: " +
                testDeleteIfGreater(linkedList,3));

        ArrayList<String> arrStr = new ArrayList<>();
        LinkedList<String> linkedStr = new LinkedList<>();
        StringBuilder el = new StringBuilder();
        String[] str = new String[10];
        for (int i = 0; i < 10; i++) {
            el.append('a');
            str[i] = el.toString();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Среднее время добавления строки в ArrayList, в нанос: " +
                testAddingToArrayList(arrStr, str));
        System.out.println("Среднее время добавления строки в LinkedList, в нанос: " +
                testAddingToLinkedList(linkedStr, str));
        System.out.println("Время удаления первой строки в ArrayList, в нанос: " +
                testDeletingFromArrayList(arrStr, 0));
        System.out.println("Время удаления первой строки в LinkedList, в нанос: " +
                testDeletingFromLinkedList(linkedStr, 0));
        System.out.println("Время удаления последней строки в ArrayList, в нанос: " +
                testDeletingFromArrayList(arrStr, 8));
        System.out.println("Время удаления последней строки в LinkedList, в нанос: " +
                testDeletingFromLinkedList(linkedStr, 1));
        System.out.println("Время удаления всех строк длиннее 3 в ArrayList, в нанос: " +
                testDeleteIfGreater(arrStr, 4));
        System.out.println("Время удаления всех строк длиннее 3 в LinkedList, в нанос: " +
                testDeleteIfGreater(linkedStr, 4));
    }

    public static <T> double testAddingToArrayList(ArrayList<T> list, T[] elements) {
        long start, end;
        double res = 0;
        for (T el: elements) {
            start = System.nanoTime();
            list.add(el);
            end = System.nanoTime();
            res += end - start;
        }
        return res / 10;
    }

    public static <T> double testAddingToLinkedList(LinkedList<T> list, T[] elements) {
        long start, end;
        double res = 0;
        for (T el: elements) {
            start = System.nanoTime();
            list.addFirst(el);
            end = System.nanoTime();
            res += end - start;
        }
        return res / 10;
    }
    public static <T> double testDeletingFromArrayList(ArrayList<T> list, int i) {
        long start, end;
        start = System.nanoTime();
        list.remove(i);
        end = System.nanoTime();
        return end - start;
    }

    public static <T> double testDeletingFromLinkedList(LinkedList<T> list, int mode) {
        long start = 0, end = 0;
        if (mode == 1) {
            start = System.nanoTime();
            list.removeLast();
            end = System.nanoTime();
        } else {
            start = System.nanoTime();
            list.removeFirst();
            end = System.nanoTime();
        }
        return end - start;
    }
    public static <T> double testDeleteIfGreater(List<T> list, int x) {
        Iterator<T> it = list.iterator();
        long start = System.nanoTime();
        while (it.hasNext()) {
            T value = it.next();
            if (value.getClass() == String.class) {
                if (((String) value).length() >= x) {
                    it.remove();
                }
            } else {
                if ((Integer) value >= x) {
                    it.remove();
                }
            }
        }
        long end = System.nanoTime();
        return end - start;
    }
}
