package glenmaddern.gmfs;

public final class Pair<T> {
    private T a;
    private T b;

    private Pair(final T a, final T b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public static <T> Pair<T> pair(final T a, final T b) {
        return new Pair<T>(a, b);
    }
}
