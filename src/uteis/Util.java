package uteis;

import java.util.List;

public class Util {
    public static <T> T primeiro(List<T> lista) {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(0);
    }
}
