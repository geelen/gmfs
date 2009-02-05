package glenmaddern.gmfs;

public final class Converters {
    public static final F<String, Integer> STRING_TO_INT = new F<String, Integer>() {
        public Integer f(final String string) {
            return Integer.valueOf(string);
        }
    };
}
