package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface PairFunction<K1, K2, R> {
    R apply(K1 value1, K2 value2);

    default <V> PairFunction<K1, K2, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (K1 value1, K2 value2) -> after.apply(apply(value1, value2));
    }
}
