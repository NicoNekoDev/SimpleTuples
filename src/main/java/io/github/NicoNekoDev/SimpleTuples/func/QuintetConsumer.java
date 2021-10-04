package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;

@FunctionalInterface
public interface QuintetConsumer<K1, K2, K3, K4, K5> {
    void accept(K1 value1, K2 value2, K3 value3, K4 value4, K5 value5);

    default QuintetConsumer<K1, K2, K3, K4, K5> andThen(QuintetConsumer<? super K1, ? super K2, ? super K3, ? super K4, ? super K5> after) {
        Objects.requireNonNull(after);
        return (value1, value2, value3, value4, value5) -> {
            accept(value1, value2, value3, value4, value5);
            after.accept(value1, value2, value3, value4, value5);
        };
    }
}
