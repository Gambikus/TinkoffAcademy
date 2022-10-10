package Task13.components;

public class Fraction {
    long numerator;
    long denominator;

    public Fraction(long a, long b) {
        numerator = a;
        denominator = b;
    }

    public Fraction(Fraction other) {
        numerator = other.numerator;
        denominator = other.denominator;
    }

    public void subtract(Fraction other) {
        long x = denominator * other.denominator / gcd(Math.abs(denominator), Math.abs(other.denominator));
        numerator = x / denominator * numerator - x / other.denominator * other.numerator;
        denominator = x;
        this.simplify();
    }

    public void simplify() {
        if (numerator == 0) {
            denominator = 1;
        }
        if (numerator * denominator >= 0) {
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        }
        long x = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= x;
        denominator /= x;
    }
    public void mult(Fraction other) {
        numerator *= other.numerator;
        denominator *= other.denominator;
    }

    public void divide(Fraction other) {
        this.mult(new Fraction(other.denominator, other.numerator));
    }

    private long gcd(long a, long b) {
        if (a >= b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        } else {
            if (a == 0) {
                return b;
            }
            return gcd(a, b % a);
        }
    }

    public long getInt() {
        return numerator / denominator;
    }
}
