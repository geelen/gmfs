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
}
