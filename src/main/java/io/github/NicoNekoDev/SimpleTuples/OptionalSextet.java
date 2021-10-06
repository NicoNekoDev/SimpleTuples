package io.github.NicoNekoDev.SimpleTuples;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalSextet<T1, T2, T3, T4, T5, T6> extends SextetImpl<Optional<T1>, Optional<T2>, Optional<T3>, Optional<T4>, Optional<T5>, Optional<T6>> {

    public OptionalSextet(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, boolean ofNullable) {
        super(ofNullable ? Optional.ofNullable(value1) : Optional.of(value1), ofNullable ? Optional.ofNullable(value2) : Optional.of(value2),
                ofNullable ? Optional.ofNullable(value3) : Optional.of(value3), ofNullable ? Optional.ofNullable(value4) : Optional.of(value4),
                ofNullable ? Optional.ofNullable(value5) : Optional.of(value5), ofNullable ? Optional.ofNullable(value6) : Optional.of(value6));
    }

    public OptionalSextet(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6) {
        this(value1, value2, value3, value4, value5, value6, true);
    }

    public static <T1, T2, T3, T4, T5, T6> OptionalSextet<T1, T2, T3, T4, T5, T6> ofNullable(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6) {
        return new OptionalSextet<>(value1, value2, value3, value4, value5, value6, true);
    }

    public static <T1, T2, T3, T4, T5, T6> OptionalSextet<T1, T2, T3, T4, T5, T6> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6) {
        return new OptionalSextet<>(value1, value2, value3, value4, value5, value6, false);
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
    public Optional<T5> getFifthValue() {
        return super.getFifthValue();
    }

    @Override
    public Optional<T6> getSixthValue() {
        return super.getSixthValue();
    }

    @Override
    public String toString() {
        return String.format(
                "[%s]",
                Stream.of(this.value1, this.value2, this.value3, this.value4, this.value5, this.value6)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
