package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface TripletFunction<K1, K2, K3, R> {
    R apply(K1 value1, K2 value2, K3 value3);

    default <V> TripletFunction<K1, K2, K3, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (K1 value1, K2 value2, K3 value3) -> after.apply(apply(value1, value2, value3));
    }
}
