package glenmaddern.gmfs;

import java.util.HashMap;
import java.util.Map;

public final class Maps {

    public static <K,V> Map<K, V> newHashMap() {
        return new HashMap<K,V>();
    }
}
