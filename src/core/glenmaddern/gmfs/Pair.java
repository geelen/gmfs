package glenmaddern.gmfs;

public final class Pair<A> {
    private A first;
    private A second;

    private Pair(final A first, final A second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public A getSecond() {
        return second;
    }

    public <B> Pair<B> map(final F<A, B> f) {
        return new Pair<B>(f.f(first), f.f(second));
    }

    public static <T> Pair<T> pair(final T a, final T b) {
        return new Pair<T>(a, b);
    }
}
