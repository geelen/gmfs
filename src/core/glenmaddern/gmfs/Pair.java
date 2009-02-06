package glenmaddern.gmfs;

public final class Pair<A> {
    private final T2<A, A> t2;

    private Pair(final T2<A, A> t2) {
        this.t2 = t2;
    }

    public A getFirst() {
        return t2._1();
    }

    public A getSecond() {
        return t2._2();
    }

    public <B> Pair<B> map(final F<A, B> f) {
        return Pair.pair(f.f(t2._1()), f.f(t2._2()));
    }

    public static <A> Pair<A> pair(final A a, final A b) {
        return new Pair<A>(T.t(a, b));
    }

    public String toString() {
        return t2.toString();
    }

    public int hashCode() {
        return t2.hashCode();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return t2.equals(pair.t2);
    }
}
