package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface SextetFunction<K1, K2, K3, K4, K5, K6, R> {
    R apply(K1 value1, K2 value2, K3 value3, K4 value4, K5 value5, K6 value6);

    default <V> SextetFunction<K1, K2, K3, K4, K5, K6, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (K1 value1, K2 value2, K3 value3, K4 value4, K5 value5, K6 value6) -> after.apply(apply(value1, value2, value3, value4, value5, value6));
    }
}
