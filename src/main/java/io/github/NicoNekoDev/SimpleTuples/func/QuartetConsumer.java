package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;

@FunctionalInterface
public interface QuartetConsumer<K1, K2, K3, K4> {
    void accept(K1 value1, K2 value2, K3 value3, K4 value4);

    default QuartetConsumer<K1, K2, K3, K4> andThen(QuartetConsumer<? super K1, ? super K2, ? super K3, ? super K4> after) {
        Objects.requireNonNull(after);
        return (value1, value2, value3, value4) -> {
            accept(value1, value2, value3, value4);
            after.accept(value1, value2, value3, value4);
        };
    }
}
