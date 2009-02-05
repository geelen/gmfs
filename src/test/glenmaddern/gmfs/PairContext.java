package glenmaddern.gmfs;

import static com.googlecode.instinct.expect.Expect.expect;
import com.googlecode.instinct.integrate.junit4.InstinctRunner;
import com.googlecode.instinct.marker.annotate.Specification;
import org.junit.runner.RunWith;

import glenmaddern.TestUtils;

@RunWith(InstinctRunner.class)
public final class PairContext {
    @Specification
    public void shouldHaveEqualsHashCodeAndToString() {
        TestUtils.expectEqualsHashCodeAndToStringAreDefinedInClass(Pair.class);
    }

    @Specification
    public void shouldWorkWithInts() {
        final Pair<Integer> intPair = Pair.pair(1, 7);
        expect.that(intPair.getFirst()).isEqualTo(1);
        expect.that(intPair.getSecond()).isEqualTo(7);
    }

    @Specification
    public void shouldWorkWithStrings() {
        final String string1 = "one";
        final String string7 = "seven";
        final Pair<String> stringPair = Pair.pair(string1, string7);
        expect.that(stringPair.getFirst()).isTheSameInstanceAs(string1);
        expect.that(stringPair.getSecond()).isTheSameInstanceAs(string7);
    }

    @Specification
    public void shouldMap() {
        final Pair<String> stringPair = Pair.pair("1", "7");
        final Pair<Integer> intPair = stringPair.map(Converters.STRING_TO_INT);
        expect.that(intPair).isEqualTo(Pair.pair(1, 7));
    }
}
