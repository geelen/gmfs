package glenmaddern.gmfs;

class T1<A> implements P1<A> {
    private final A a;

    T1(A a) {
        this.a = a;
    }

    public A _1() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T1 t1 = (T1) o;
        return a.equals(t1.a);
    }

    @Override
    public int hashCode() {
        return Hash.hashOf(a);
    }

    @Override
    public String toString() {
        return "T1[" + a + "]";
    }
}
