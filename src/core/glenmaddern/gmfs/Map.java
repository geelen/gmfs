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

    public static <K,A,B> java.util.Map<K,B> mapValues(final java.util.Map<K,A> map, final F<A,B> f) {
        final java.util.Map<K,B> result = Maps.newHashMap();
        for (final java.util.Map.Entry<K, A> entry : map.entrySet()) {
            result.put(entry.getKey(), f.f(entry.getValue()));
        }
        return result;
    }
}
