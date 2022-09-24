package Task1;

import Task1.components.*;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        A firstA = new A(5);
        A secondA = new A(6);
        B firstB = new B(2);
        B secondB = new B(2);
        System.out.println("firstA.equals(secondA): " + firstA.equals(secondA));
        System.out.println("firstA.hashCode() == secondA.hashCode(): " + (firstA.hashCode() == secondA.hashCode()));
        System.out.println("firstB.equals(secondB): " + firstB.equals(secondB));
        System.out.println("firstB.hashCode() == secondB.hashCode(): " + (firstB.hashCode() == secondB.hashCode()));
        HashMap<Object, Integer> map = new HashMap<>();
        map.put(firstA, 0);
        map.put(firstB, 1);
        map.put(secondA, 2);
        map.put(secondB, 3);
    }
}
