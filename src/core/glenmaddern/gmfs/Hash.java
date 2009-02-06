package glenmaddern.gmfs;

public final class Hash {
    public static int hashOf(final Object ... objects) {
        int hashCode = 0;
        for (Object object : objects) hashCode = 31 * hashCode + object.hashCode();
        return hashCode;
    }
}
