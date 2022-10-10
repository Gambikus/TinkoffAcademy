package Task1.components;

import java.util.Objects;

public class A {
    private final int a;
    static int count = 0;

    public A(int a) {
        this.a = a;
        count++;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        A otherA = (A)(other);
        return Objects.equals(a, otherA.a);
    }

    @Override
    public int hashCode() {
        return count % 10;
    }
}
