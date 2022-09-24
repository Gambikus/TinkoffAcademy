package Task5;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 5));
    }
    public static int sumVarargs(int... args) {
        System.err.println("Запущен varargs метод");
        int res = 0;
        for (int el: args) {
            res += el;
        }
        return res;
    }

    public static int sum(int a, int b) {
        return sumVarargs(a, b);
    }

    public static int sum(int a, int b, int c) {
        return sumVarargs(a, b, c);
    }

    public static int sum(int a, int b, int c, int d) {
        return sumVarargs(a, b, c, d);
    }

    public static int sum(int a, int b, int c, int d, int e) {
        return sumVarargs(a, b, c, d, e);
    }
}
