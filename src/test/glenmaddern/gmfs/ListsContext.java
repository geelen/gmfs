package glenmaddern.gmfs;

import static com.googlecode.instinct.expect.Expect.expect;
import com.googlecode.instinct.integrate.junit4.InstinctRunner;
import com.googlecode.instinct.marker.annotate.Specification;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(InstinctRunner.class)
public final class ListsContext {
    @Specification
    public void shouldCreateAnEmptyArrayList() {
        final List<String> emptyList = Lists.newArrayList();
        expect.that(emptyList).isEmpty();
        expect.that(emptyList).isOfType(ArrayList.class);
    }

    @Specification
    public void shouldCreateAnArrayListWithSize() {
        final List<String> emptyList = Lists.newArrayListWithExpectedSize(5);
        expect.that(emptyList).isEmpty();
        expect.that(emptyList).isOfType(ArrayList.class);
        //how to check capacity??
    }

    @Specification
    public void shouldCreateAnArrayListFromAnIterable() {
        final List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        final List<Integer> outputList = Lists.newArrayList(inputList);
        expect.that(outputList).isNotTheSameInstanceAs(inputList);
        expect.that(outputList).isEqualTo(inputList);
    }

    @Specification
    public void shouldCreateAnArrayListFromAnIterator() {
        final List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        final List<Integer> outputList = Lists.newArrayList(inputList.iterator());
        expect.that(outputList).isNotTheSameInstanceAs(inputList);
        expect.that(outputList).isEqualTo(inputList);
    }
}
