package glenmaddern.gmfs;

public final class Converters {
    public static final F<String, Integer> STRING_TO_INT = new F<String, Integer>() {
        public Integer f(final String string) {
            return Integer.valueOf(string);
        }
    };
    public static final F<String, Double> STRING_TO_DOUBLE = new F<String, Double>() {
        public Double f(final String string) {
            return Double.valueOf(string);
        }
    };
    public static final F<String, Boolean> STRING_TO_BOOL = new F<String, Boolean>() {
        public Boolean f(String string) {
            return Boolean.valueOf(string);
        }
    };

    public static <A> F<A, A> identity() {
        return new F<A, A>() {
            public A f(A a) {
                return a;
            }
        };
    }
}
