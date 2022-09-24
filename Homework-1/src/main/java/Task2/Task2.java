package Task2;

import Task2.threads.CustomThread;

public class Task2 {
    public static void main(String[] args) {
        CustomThread[] boys = {
                new CustomThread("John"),
                new CustomThread("Paul"),
                new CustomThread("George"),
                new CustomThread("Ringo")};
        for (CustomThread boy: boys) {
            boy.start();
        }
    }
}
