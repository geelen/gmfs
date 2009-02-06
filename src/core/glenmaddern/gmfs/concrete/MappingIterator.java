package glenmaddern.gmfs.concrete;

import glenmaddern.gmfs.F;

import java.util.Iterator;

public class MappingIterator<A,B> implements Iterator<B> {
    private final Iterator<A> iter;
    private final F<A, B> fs;

    public MappingIterator(final Iterator<A> iter, final F<A, B> fs) {
        this.iter = iter;
        this.fs = fs;
    }

    public boolean hasNext() {
        return iter.hasNext();
    }

    public B next() {
        return fs.f(iter.next());
    }

    public void remove() {
        iter.remove();
    }
}
