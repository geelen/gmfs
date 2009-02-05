package glenmaddern.gmfs;

import static com.googlecode.instinct.expect.Expect.expect;
import com.googlecode.instinct.integrate.junit4.InstinctRunner;
import com.googlecode.instinct.marker.annotate.Specification;
import org.junit.runner.RunWith;

import java.util.Arrays;

@RunWith(InstinctRunner.class)
public final class ConvertersContext {
    @Specification
    public void shouldHaveAStringToInt() {
        for (final String s : Arrays.asList("1", "2", "100")) {
            expect.that(Converters.STRING_TO_INT.f(s)).isEqualTo(Integer.parseInt(s));
        }
    }

    @Specification
    public void shouldHaveAStringToDouble() {
        for (final String s : Arrays.asList("1", "2.0", "10.65095")) {
            expect.that(Converters.STRING_TO_DOUBLE.f(s)).isEqualTo(Double.parseDouble(s));
        }
    }
}
