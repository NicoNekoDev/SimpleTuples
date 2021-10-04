package io.github.NicoNekoDev.SimpleTuples.func;

import java.util.Objects;

@FunctionalInterface
public interface OctetConsumer<K1, K2, K3, K4, K5, K6, K7, K8> {
    void accept(K1 value1, K2 value2, K3 value3, K4 value4, K5 value5, K6 value6, K7 value7, K8 value8);

    default OctetConsumer<K1, K2, K3, K4, K5, K6, K7, K8> andThen(OctetConsumer<? super K1, ? super K2, ? super K3, ? super K4, ? super K5, ? super K6, ? super K7, ? super K8> after) {
        Objects.requireNonNull(after);
        return (value1, value2, value3, value4, value5, value6, value7, value8) -> {
            accept(value1, value2, value3, value4, value5, value6, value7, value8);
            after.accept(value1, value2, value3, value4, value5, value6, value7, value8);
        };
    }
}
