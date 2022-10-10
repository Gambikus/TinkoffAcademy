package Task10;

import Task8.components.ArrayModificationException;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3};
        System.out.println("Запуск первого алгоритма");
        arr = firstAlgorithm(arr);
        System.out.println("Исходный массив после работы первого алгоритма - " + Arrays.toString(arr));
        System.out.println("Запуск второго алгоритма");
        secondAlgorithm(arr);
    }

    public static int[] firstAlgorithm(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
        try {
            throw new ArrayModificationException();
        } catch (ArrayModificationException e) {
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
            return newArr;
        }
    }

    public static void secondAlgorithm(int[] arr) {
        for (int el : arr) {
            try {
                System.out.println(arr[el]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Значение не найдено");
            }
        }
    }
}
