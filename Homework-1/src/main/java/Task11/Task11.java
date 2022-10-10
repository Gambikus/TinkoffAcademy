package Task11;

import Task11.components.LRUCache;


public class Task11 {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache();
        while (true) {
            Integer id = (int)(Math.random() * 9 + 1);
            System.out.println("В ячейке под номером " + id + " лежит: " + cache.get(id).toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
