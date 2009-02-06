package glenmaddern.gmfs;

import glenmaddern.gmfs.concrete.MappingIterator;

import java.util.List;
import java.util.Iterator;

public final class Map {
    public static <A,B> List<B> mapList(final Iterable<A> as, final F<A,B> fs) {
        return Lists.newArrayList(mapIterable(as, fs));
    }

    public static <A, B> Iterable<B> mapIterable(final Iterable<A> as, final F<A, B> fs) {
        return new Iterable<B>() {
            public Iterator<B> iterator() {
                return mapIterator(as.iterator(), fs);
            }
        };
    }

    public static <A,B> Iterator<B> mapIterator(final Iterator<A> iter, final F<A,B> fs) {
        return new MappingIterator<A,B>(iter, fs);
    }
}
