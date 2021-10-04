package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;

@FunctionalInterface
public interface DecadeConsumer<K1, K2, K3, K4, K5, K6, K7, K8, K9, K10> {
    void accept(K1 value1, K2 value2, K3 value3, K4 value4, K5 value5, K6 value6, K7 value7, K8 value8, K9 value9, K10 value10);

    default DecadeConsumer<K1, K2, K3, K4, K5, K6, K7, K8, K9, K10> andThen(DecadeConsumer<? super K1, ? super K2, ? super K3, ? super K4, ? super K5, ? super K6, ? super K7, ? super K8, ? super K9, ? super K10> after) {
        Objects.requireNonNull(after);
        return (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10) -> {
            accept(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10);
            after.accept(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10);
        };
    }
}
