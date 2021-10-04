package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface DecadeFunction<K1, K2, K3, K4, K5, K6, K7, K8, K9, K10, R> {
    R apply(K1 value1, K2 value2, K3 value3, K4 value4, K5 value5, K6 value6, K7 value7, K8 value8, K9 value9, K10 value10);

    default <V> DecadeFunction<K1, K2, K3, K4, K5, K6, K7, K8, K9, K10, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (K1 value1, K2 value2, K3 value3, K4 value4, K5 value5, K6 value6, K7 value7, K8 value8, K9 value9, K10 value10) -> after.apply(apply(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10));
    }
}
