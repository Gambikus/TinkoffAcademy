package Task8;

import Task8.components.ArrayModificationException;

import java.util.Arrays;

public class Task8 {
    public static void main(String[]args) {
        int[] arr = {1, 2, 3, 7, 5};
        System.out.println("Исходный массив - " + Arrays.toString(arr));
        System.out.println("Запускаем первый алгоритм:");
        try {
            arr = firstAlgorithm(arr);
        } catch (ArrayModificationException e) {
            System.err.println("ArrayModificationException");
        }
        System.out.println("Массив после работы первого алгоритма:" + Arrays.toString(arr));
        System.out.println("Запускаем второй алгоритм:");
        arr = secondAlgorithm(arr);
        System.out.println("Массив после работы второго алгоритма:" + Arrays.toString(arr));
        System.out.println("Запускаем третий алгоритм:");
        thirdAlgorithm(arr);
        System.out.println("Запускаем четвертый алгоритм:");
        fourthAlgorithm(arr);
    }

    public static int[] firstAlgorithm(int[] arr) throws ArrayModificationException {
        int max = -100;
        for (int el: arr) {
            max = Math.max(max, el);
        }
        System.out.println(max);
        int[] newArr = new int[arr.length - 1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                newArr[i - k] = arr[i];
            } else {
                k = 1;
            }
        }
        arr = new int[arr.length - 1];
        System.arraycopy(newArr, 0, arr, 0, arr.length);
        throw new ArrayModificationException();
    }

    public static int[] secondAlgorithm(int[] arr) {
        int max = -100;
        for (int el: arr) {
            max = Math.max(max, el);
        }
        System.out.println(max);
        int[] newArr = new int[arr.length - 1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                newArr[i - k] = arr[i];
            } else {
                k = 1;
            }
        }
        arr = new int[arr.length - 1];
        System.arraycopy(newArr, 0, arr, 0, arr.length);
        return arr;
    }

    public static void thirdAlgorithm(int[] arr) {
        for (int el : arr) {
            System.out.println(arr[el]);
        }
    }

    public static void fourthAlgorithm(int[] arr) {
        for (int el : arr) {
            if (el >= 0 && el < arr.length) {
                System.out.println(arr[el]);
            } else {
                System.out.println("Значение не найдено!");
            }
        }
    }
}
