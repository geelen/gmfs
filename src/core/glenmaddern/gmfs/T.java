package glenmaddern.gmfs;

public final class T {
    public static <A> T1<A> t(final A a) {
        return new T1<A>(a);
    }

    public static <A,B> T2<A,B> t(final A a, final B b) {
        return new T2<A, B>(a, b);
    }

    public static <A,B,C> T3<A,B,C> t(final A a, final B b, final C c) {
        return new T3<A, B, C>(a, b, c);
    }
}
