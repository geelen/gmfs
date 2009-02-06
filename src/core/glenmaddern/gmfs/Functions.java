package glenmaddern.gmfs;

public final class Functions {
    public static <A, B, C> F<A, F<B, C>> curry(final F2<A, B, C> f2) {
        return new F<A, F<B, C>>() {
            public F<B, C> f(final A a) {
                return new F<B, C>() {
                    public C f(final B b) {
                        return f2.f(a, b);
                    }
                };
            }
        };
    }
}
