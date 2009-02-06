package glenmaddern.gmfs;

import static com.googlecode.instinct.expect.Expect.expect;
import com.googlecode.instinct.integrate.junit4.InstinctRunner;
import com.googlecode.instinct.marker.annotate.Specification;
import org.junit.runner.RunWith;

@RunWith(InstinctRunner.class)
public final class FunctionsContext {
    @Specification
    public void shouldBeCurryable() {
        final F2<Integer, String, T2<Integer, String>> f2 = new F2<Integer, String, T2<Integer, String>>() {
            public T2<Integer, String> f(Integer integer, String s) {
                return T.t(integer, s);
            }
        };
        expect.that(f2.f(1, "one")).isEqualTo(T.t(1, "one"));
        F<Integer, F<String, T2<Integer, String>>> curriedFunction = Functions.curry(f2);
        final F<String, T2<Integer, String>> partiallyAppliedT2With7 = curriedFunction.f(7);
        expect.that(partiallyAppliedT2With7.f("seven")).isEqualTo(T.t(7, "seven"));
        final F<String, T2<Integer, String>> partiallyAppliedT2With9 = curriedFunction.f(9);
        expect.that(partiallyAppliedT2With9.f("something_else")).isEqualTo(T.t(9, "something_else"));
    }
}