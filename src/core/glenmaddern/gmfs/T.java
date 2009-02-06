package glenmaddern.gmfs;

public final class T {
    public static <A> T1<A> t(final A a) {
        return new T1<A>() {
            public A _1() {
                return a;
            }
        };
    }
}
