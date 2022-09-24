package Task1.components;

public class A {
    private final int a;

    public A(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object other) {
        return true;
    }

    @Override
    public int hashCode() {
        return this.a;
    }
}
