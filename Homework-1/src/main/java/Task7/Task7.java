package Task7;

import Task7.components.SumNumbersClass;
import Task7.components.SumStringsClass;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Пример работы метода sumElements класса SumNumbersClass:");
        Integer[] numbers = {1, 3, 5, 6};
        SumNumbersClass sumNum = new SumNumbersClass();
        System.out.println("sumElements({1, 3, 5, 6}) = " + sumNum.sumElements(numbers));
        System.out.println("Пример работы метода sumElements класса SumStringsClass:");
        String[] strings = {"Puppets", "Are", "The", "Best"};
        SumStringsClass sumStr = new SumStringsClass();
        System.out.println("sumElements({\"Puppets\", \"Are\", \"The\", \"Best\"}) = " + sumStr.sumElements(strings));
    }
}
