package Task1.components;

public class A {
    private final int a;
    static int count = 0;

    public A(int a) {
        this.a = a;
        count++;
    }

    @Override
    public boolean equals(Object other) {
        A otherA = (A)(other);
        return a == otherA.a;
    }

    @Override
    public int hashCode() {
        return count % 10;
    }
}
