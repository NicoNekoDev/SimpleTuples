package io.github.NicoNekoDev.SimpleTuples;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalOctet<T1, T2, T3, T4, T5, T6, T7, T8> extends OctetImpl<Optional<T1>, Optional<T2>, Optional<T3>, Optional<T4>, Optional<T5>, Optional<T6>, Optional<T7>, Optional<T8>> {

    public OptionalOctet(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, boolean ofNullable) {
        super(ofNullable ? Optional.ofNullable(value1) : Optional.of(value1), ofNullable ? Optional.ofNullable(value2) : Optional.of(value2),
                ofNullable ? Optional.ofNullable(value3) : Optional.of(value3), ofNullable ? Optional.ofNullable(value4) : Optional.of(value4),
                ofNullable ? Optional.ofNullable(value5) : Optional.of(value5), ofNullable ? Optional.ofNullable(value6) : Optional.of(value6),
                ofNullable ? Optional.ofNullable(value7) : Optional.of(value7), ofNullable ? Optional.ofNullable(value8) : Optional.of(value8));
    }

    public OptionalOctet(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8) {
        this(value1, value2, value3, value4, value5, value6, value7, value8, true);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> OptionalOctet<T1, T2, T3, T4, T5, T6, T7, T8> ofNullable(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8) {
        return new OptionalOctet<>(value1, value2, value3, value4, value5, value6, value7, value8, true);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> OptionalOctet<T1, T2, T3, T4, T5, T6, T7, T8> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8) {
        return new OptionalOctet<>(value1, value2, value3, value4, value5, value6, value7, value8, false);
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
    public Optional<T7> getSeventhValue() {
        return super.getSeventhValue();
    }

    @Override
    public Optional<T8> getEightValue() {
        return super.getEightValue();
    }

    @Override
    public String toString() {
        return String.format(
                "[%s]",
                Stream.of(this.value1, this.value2, this.value3, this.value4, this.value5, this.value6, this.value7, this.value8)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
