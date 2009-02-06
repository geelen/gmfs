package glenmaddern;

import com.googlecode.instinct.internal.util.Reflector;
import static com.googlecode.instinct.expect.Expect.expect;

import java.lang.reflect.Method;

public final class TestUtils {
    public static <T> void expectEqualsHashCodeAndToStringAreDefinedInClass(final Class<T> cls) {
        final Method equalsMethod = Reflector.getMethod(cls, "equals", Object.class);
        expect.that(equalsMethod.getDeclaringClass().equals(cls)).isTrue();
        final Method hashCodeMethod = Reflector.getMethod(cls, "hashCode");
        expect.that(hashCodeMethod.getDeclaringClass().equals(cls)).isTrue();
        final Method toStringMethod = Reflector.getMethod(cls, "toString");
        expect.that(toStringMethod.getDeclaringClass().equals(cls)).isTrue();
    }
}
