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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Pair pair = (Pair) o;

        return first.equals(pair.first) && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + second.hashCode();
    }

    @Override
    public String toString() {
        return "Pair[" + first + ", " + second + "]";
    }

    public static <T> Pair<T> pair(final T a, final T b) {
        return new Pair<T>(a, b);
    }
}
