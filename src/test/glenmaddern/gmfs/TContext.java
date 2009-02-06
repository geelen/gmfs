package glenmaddern.gmfs;

import static com.googlecode.instinct.expect.Expect.expect;
import com.googlecode.instinct.integrate.junit4.InstinctRunner;
import com.googlecode.instinct.marker.annotate.Specification;
import glenmaddern.TestUtils;
import org.junit.runner.RunWith;

@RunWith(InstinctRunner.class)
public final class TContext {
    @Specification
    public void shouldHaveT1s() {
        String str = "Something";
        T1<String> t1 = T.t(str);
        expect.that(t1._1()).isTheSameInstanceAs(str);
        TestUtils.expectEqualsHashCodeAndToStringAreDefinedInClass(T1.class);
    }

    @Specification
    public void shouldHaveT2s() {
        String str = "Something";
        Double d = 5.7;
        T2<String, Double> t2 = T.t(str, d);
        expect.that(t2._1()).isTheSameInstanceAs(str);
        expect.that(t2._2()).isTheSameInstanceAs(d);
        TestUtils.expectEqualsHashCodeAndToStringAreDefinedInClass(T2.class);
    }

    @Specification
    public void shouldHaveT3s() {
        String str = "Something";
        Double d = 5.7;
        Integer[] i = new Integer[]{1, 2, 3};
        P3<String, Double, Integer[]> t3 = T.t(str, d, i);
        expect.that(t3._1()).isTheSameInstanceAs(str);
        expect.that(t3._2()).isTheSameInstanceAs(d);
        expect.that(t3._3()).isTheSameInstanceAs(i);
        TestUtils.expectEqualsHashCodeAndToStringAreDefinedInClass(T3.class);
    }
}