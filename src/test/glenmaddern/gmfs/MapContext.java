package glenmaddern.gmfs;

import static com.googlecode.instinct.expect.Expect.expect;
import com.googlecode.instinct.integrate.junit4.InstinctRunner;
import com.googlecode.instinct.marker.annotate.Specification;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Arrays;

@RunWith(InstinctRunner.class)
public final class MapContext {
    @Specification
    public void shouldMapLists() {
        final List<String> inputList = Arrays.asList("1", "2", "3", "4", "5");
        final List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5);
        expect.that(Map.mapList(inputList, Converters.STRING_TO_INT)).isEqualTo(expectedList);
    }

    @Specification
    public void shouldMapIterables() {
        final List<String> inputList = Arrays.asList("1", "2", "3", "4", "5");
        final Iterable<Double> mappedIterable = Map.mapIterable(inputList, Converters.STRING_TO_DOUBLE);
        expect.that(Lists.newArrayList(mappedIterable)).isEqualTo(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
    }
}
