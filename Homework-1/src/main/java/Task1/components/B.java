package Task1.components;

public class B {
    private final int b;

    public B(int b) {
        this.b = b;
    }

    @Override
    public int hashCode() {
        return this.b;
    }

    @Override
    public boolean equals(Object other) {
        return false;
    }
}
