package glenmaddern.gmfs;

class T3<A, B, C> implements P3<A,B,C> {
    private final A a;
    private final B b;
    private final C c;

    T3(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A _1() {
        return a;
    }

    public B _2() {
        return b;
    }

    public C _3() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T3 t3 = (T3) o;
        return a.equals(t3.a) && b.equals(t3.b) && c.equals(t3.c);
    }

    @Override
    public int hashCode() {
        return Hash.hashOf(a, b, c);
    }

    @Override
    public String toString() {
        return "T3[" + a + ", " + b + ", " + c + "]";
    }
}
