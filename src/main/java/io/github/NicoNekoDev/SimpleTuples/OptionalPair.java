package io.github.NicoNekoDev.SimpleTuples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalPair<T1, T2> extends PairImpl<Optional<T1>, Optional<T2>> {

    public OptionalPair(T1 value1, T2 value2, boolean ofNullable) {
        super(ofNullable ? Optional.ofNullable(value1) : Optional.of(value1), ofNullable ? Optional.ofNullable(value2) : Optional.of(value2));
    }

    public OptionalPair(T1 value1, T2 value2) {
        this(value1, value2, true);
    }

    public static <T1, T2> OptionalPair<T1, T2> ofNullable(T1 value1, T2 value2) {
        return new OptionalPair<>(value1, value2, true);
    }

    public static <T1, T2> OptionalPair<T1, T2> of(T1 value1, T2 value2) {
        return new OptionalPair<>(value1, value2, false);
    }

    @Override
    public Optional<T1> getFirstValue() {
        return super.getFirstValue();
    }

    @Override
    public Optional<T2> getSecondValue() {
        return super.getSecondValue();
    }

    @Override
    public String toString() {
        return String.format(
                "[%s]",
                Stream.of(this.value1, this.value2)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
