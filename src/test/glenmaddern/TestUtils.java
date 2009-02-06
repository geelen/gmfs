package glenmaddern;

import static com.googlecode.instinct.expect.Expect.expect;
import com.googlecode.instinct.internal.expect.state.matcher.AssertException;
import com.googlecode.instinct.internal.expect.state.matcher.AssertExceptionImpl;
import com.googlecode.instinct.internal.util.Reflector;

import java.lang.reflect.Method;

public final class TestUtils {
    public static final AssertException ASSERT_EXCEPTION = new AssertExceptionImpl();

    public static <T> void expectEqualsHashCodeAndToStringAreDefinedInClass(final Class<T> cls) {
        final Method equalsMethod = Reflector.getMethod(cls, "equals", Object.class);
        expect.that(equalsMethod.getDeclaringClass().equals(cls)).isTrue();
        final Method hashCodeMethod = Reflector.getMethod(cls, "hashCode");
        expect.that(hashCodeMethod.getDeclaringClass().equals(cls)).isTrue();
        final Method toStringMethod = Reflector.getMethod(cls, "toString");
        expect.that(toStringMethod.getDeclaringClass().equals(cls)).isTrue();
    }

    public static <T> void assertException(final Class<T> exception, final String message, final Runnable block) {
        ASSERT_EXCEPTION.assertThrows(exception, message, block);
    }
}
