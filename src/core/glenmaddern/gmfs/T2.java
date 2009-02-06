package glenmaddern.gmfs;

class T2<A, B> implements P2<A, B> {
    private final A a;
    private final B b;

    T2(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A _1() {
        return a;
    }

    public B _2() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T2 t2 = (T2) o;
        return a.equals(t2.a) && b.equals(t2.b);
    }

    @Override
    public int hashCode() {
        return Hash.hashOf(a, b);
    }

    @Override
    public String toString() {
        return "T2[" + a + ", " + b + "]";
    }
}
