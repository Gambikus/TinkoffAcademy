package Task6;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Пример работы инкремента для числа 6 - " + inc(6));
        System.out.println("Пример работы инкремента для символа f - " + inc('f'));
        System.out.println("Пример работы инкремента для символа z - " + inc('z'));
        System.out.println("Пример работы инкремента для значения false - " + inc(false));
        System.out.println("Пример работы суммы чисел 6 и 7 - " + sum(6, 7));
    }

    public static int inc(int a) {
        return  a + 1;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static char inc(char c) {
        char start = '0', end = '9';
        if (c >= 'A' && c <= 'Z') {
            start = 'A';
            end = 'Z';
        } else if (c >= 'a' && c <= 'z') {
            start = 'a';
            end = 'z';
        }
        return (char)((c - start + 1) % (end - start + 1) + start);
    }

    public static boolean inc(boolean f) {
        return true;
    }
}
