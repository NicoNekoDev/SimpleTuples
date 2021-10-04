package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface OctetFunction<K1, K2, K3, K4, K5, K6, K7, K8, R> {
    R apply(K1 value1, K2 value2, K3 value3, K4 value4, K5 value5, K6 value6, K7 value7, K8 value8);

    default <V> OctetFunction<K1, K2, K3, K4, K5, K6, K7, K8, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (K1 value1, K2 value2, K3 value3, K4 value4, K5 value5, K6 value6, K7 value7, K8 value8) -> after.apply(apply(value1, value2, value3, value4, value5, value6, value7, value8));
    }
}
