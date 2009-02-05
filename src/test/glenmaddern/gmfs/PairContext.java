package glenmaddern.gmfs;

import static com.googlecode.instinct.expect.Expect.expect;
import com.googlecode.instinct.integrate.junit4.InstinctRunner;
import com.googlecode.instinct.marker.annotate.Specification;
import org.junit.runner.RunWith;

@RunWith(InstinctRunner.class)
public final class PairContext {
    @Specification
    public void shouldWorkWithInts() {
        final Pair<Integer> intPair = Pair.pair(1, 7);
        expect.that(intPair.getA()).isEqualTo(1);
        expect.that(intPair.getB()).isEqualTo(7);
    }

    @Specification
    public void shouldWorkWithStrings() {
        final String string1 = "one";
        final String string7 = "seven";
        final Pair<String> stringPair = Pair.pair(string1, string7);
        expect.that(stringPair.getA()).isTheSameInstanceAs(string1);
        expect.that(stringPair.getB()).isTheSameInstanceAs(string7);
    }
}
