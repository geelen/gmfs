package glenmaddern.gmfs;

import java.util.List;

public final class Parser {
    public static <K, A> T1<A> parse(List<K> ks, T1<F<K, A>> fs) {
        checkLength(ks, 1);
        return T.t(fs._1().f(ks.get(0)));
    }

    public static <K, A, B> T2<A, B> parse(List<K> ks, T2<F<K, A>, F<K, B>> fs) {
        checkLength(ks, 2);
        return T.t(fs._1().f(ks.get(0)), fs._2().f(ks.get(1)));
    }

    public static <K, A, B, C> T3<A, B, C> parse(List<K> ks, T3<F<K, A>, F<K, B>, F<K, C>> fs) {
        checkLength(ks, 3);
        return T.t(fs._1().f(ks.get(0)), fs._2().f(ks.get(1)), fs._3().f(ks.get(2)));
    }

    private static <K> void checkLength(List<K> ks, int length) {
        if (ks.size() != length) throw new IllegalArgumentException("Expected list of length " + length + ", got " + ks.size());
    }
}
