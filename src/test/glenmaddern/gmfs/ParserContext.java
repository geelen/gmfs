package glenmaddern.gmfs;

import static com.googlecode.instinct.expect.Expect.expect;
import com.googlecode.instinct.integrate.junit4.InstinctRunner;
import com.googlecode.instinct.marker.annotate.Specification;
import com.googlecode.instinct.internal.expect.state.matcher.AssertExceptionImpl;
import static glenmaddern.gmfs.Converters.STRING_TO_DOUBLE;
import static glenmaddern.gmfs.Converters.STRING_TO_INT;
import static glenmaddern.gmfs.Converters.STRING_TO_BOOL;
import static glenmaddern.gmfs.T.t;
import org.junit.runner.RunWith;

import static java.util.Arrays.asList;
import java.util.List;

@RunWith(InstinctRunner.class)
public final class ParserContext {
    @Specification
    public void shouldParseOneToken() {
        final String line = "1";
        final List<String> strings = asList(line.split(","));
        final T1<Integer> parsed = Parser.parse(strings, t(STRING_TO_INT));
        expect.that(parsed).isEqualTo(t(1));
    }

    @Specification
    public void shouldParseTwoTokens() {
        final String line = "1,False";
        final List<String> strings = asList(line.split(","));
        final T2<Integer, String> parsed = Parser.parse(strings, t(STRING_TO_INT, Converters.<String>identity()));
        expect.that(parsed).isEqualTo(t(1, "False"));
        final T2<Integer, Boolean> parsedWithBoolean = Parser.parse(strings, t(STRING_TO_INT, STRING_TO_BOOL));
        expect.that(parsedWithBoolean).isEqualTo(t(1, false));
    }

    @Specification
    public void shouldParseThreeTokens() {
        final String line = "1,False,3.0";
        final List<String> strings = asList(line.split(","));
        final T3<Integer, String, Double> parsed = Parser.parse(strings, t(STRING_TO_INT, Converters.<String>identity(), STRING_TO_DOUBLE));
        expect.that(parsed).isEqualTo(t(1, "False", 3.0));
        final T3<Integer, Boolean, Double> parsedWithBoolean = Parser.parse(strings, t(STRING_TO_INT, STRING_TO_BOOL, STRING_TO_DOUBLE));
        expect.that(parsedWithBoolean).isEqualTo(t(1, false, 3.0));
    }

    @Specification
    public void shouldFailWithIncorrectLengthTokens() {
        new AssertExceptionImpl().assertThrows(IllegalArgumentException.class, "Expected list of length 3, got 2", new Runnable() {
            public void run() {
                final String line = "1,False";
                final List<String> strings = asList(line.split(","));
                final T3<Integer, Boolean, Double> parsedWithBoolean = Parser.parse(strings, t(STRING_TO_INT, STRING_TO_BOOL, STRING_TO_DOUBLE));
            }
        });
    }
}