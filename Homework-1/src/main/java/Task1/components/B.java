package Task1.components;

import java.util.Objects;

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
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        B otherB = (B)(other);
        return Objects.equals(b, otherB.b);
    }
}
