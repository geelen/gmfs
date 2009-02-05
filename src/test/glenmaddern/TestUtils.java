package glenmaddern;

import com.googlecode.instinct.internal.util.Reflector;

import java.lang.reflect.Method;

public final class TestUtils {
    public static <T> void expectEqualsHashCodeAndToStringAreDefinedInClass(final Class<T> cls) {
        final Method equalsMethod = Reflector.getMethod(cls, "equals", Object.class);
        com.googlecode.instinct.expect.Expect.expect.that(equalsMethod.getDeclaringClass().equals(cls)).isTrue();
        final Method hashCodeMethod = Reflector.getMethod(cls, "hashCode");
        com.googlecode.instinct.expect.Expect.expect.that(hashCodeMethod.getDeclaringClass().equals(cls)).isTrue();
        final Method toStringMethod = Reflector.getMethod(cls, "toString");
        com.googlecode.instinct.expect.Expect.expect.that(toStringMethod.getDeclaringClass().equals(cls)).isTrue();
    }
}
