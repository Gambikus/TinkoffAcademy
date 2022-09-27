package Task1.components;

public class B {
    private final int b;

    public B(int b) {
        this.b = b;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object other) {
        B otherB = (B)(other);
        return b == otherB.b;
    }
}
