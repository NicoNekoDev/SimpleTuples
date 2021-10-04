package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;

@FunctionalInterface
public interface PairConsumer<K1, K2> {
    void accept(K1 value1, K2 value2);

    default PairConsumer<K1, K2> andThen(PairConsumer<? super K1, ? super K2> after) {
        Objects.requireNonNull(after);
        return (value1, value2) -> {
            accept(value1, value2);
            after.accept(value1, value2);
        };
    }
}
