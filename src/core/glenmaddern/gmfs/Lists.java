package glenmaddern.gmfs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Lists {
    public static <A> List<A> newArrayList() {
        return new ArrayList<A>();
    }

    public static <A> List<A> newArrayList(final Iterable<A> iterable) {
        return newArrayList(iterable.iterator());
    }

    public static <A> List<A> newArrayList(final Iterator<A> iter) {
        final List<A> result = new ArrayList<A>();
        while (iter.hasNext()) {
            result.add(iter.next());
        }
        return result;
    }

    public static <A> List<A> newArrayListWithExpectedSize(final int i) {
        return new ArrayList<A>(i);
    }
}
