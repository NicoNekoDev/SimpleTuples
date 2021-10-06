package io.github.NicoNekoDev.SimpleTuples;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalQuartet<T1, T2, T3, T4> extends QuartetImpl<Optional<T1>, Optional<T2>, Optional<T3>, Optional<T4>> {

    public OptionalQuartet(T1 value1, T2 value2, T3 value3, T4 value4, boolean ofNullable) {
        super(ofNullable ? Optional.ofNullable(value1) : Optional.of(value1), ofNullable ? Optional.ofNullable(value2) : Optional.of(value2),
                ofNullable ? Optional.ofNullable(value3) : Optional.of(value3), ofNullable ? Optional.ofNullable(value4) : Optional.of(value4));
    }

    public OptionalQuartet(T1 value1, T2 value2, T3 value3, T4 value4) {
        this(value1, value2, value3, value4, true);
    }

    public static <T1, T2, T3, T4> OptionalQuartet<T1, T2, T3, T4> ofNullable(T1 value1, T2 value2, T3 value3, T4 value4) {
        return new OptionalQuartet<>(value1, value2, value3, value4, true);
    }

    public static <T1, T2, T3, T4> OptionalQuartet<T1, T2, T3, T4> of(T1 value1, T2 value2, T3 value3, T4 value4) {
        return new OptionalQuartet<>(value1, value2, value3, value4, false);
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
    public Optional<T3> getThirdValue() {
        return super.getThirdValue();
    }

    @Override
    public Optional<T4> getForthValue() {
        return super.getForthValue();
    }

    @Override
    public String toString() {
        return String.format(
                "[%s]",
                Stream.of(this.value1, this.value2, this.value3, this.value4)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
