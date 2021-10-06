package io.github.NicoNekoDev.SimpleTuples;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDecade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends DecadeImpl<Optional<T1>, Optional<T2>, Optional<T3>, Optional<T4>, Optional<T5>, Optional<T6>, Optional<T7>, Optional<T8>, Optional<T9>, Optional<T10>> {

    public OptionalDecade(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10, boolean ofNullable) {
        super(ofNullable ? Optional.ofNullable(value1) : Optional.of(value1), ofNullable ? Optional.ofNullable(value2) : Optional.of(value2),
                ofNullable ? Optional.ofNullable(value3) : Optional.of(value3), ofNullable ? Optional.ofNullable(value4) : Optional.of(value4),
                ofNullable ? Optional.ofNullable(value5) : Optional.of(value5), ofNullable ? Optional.ofNullable(value6) : Optional.of(value6),
                ofNullable ? Optional.ofNullable(value7) : Optional.of(value7), ofNullable ? Optional.ofNullable(value8) : Optional.of(value8),
                ofNullable ? Optional.ofNullable(value9) : Optional.of(value9), ofNullable ? Optional.ofNullable(value10) : Optional.of(value10));
    }

    public OptionalDecade(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, true);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> OptionalDecade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> ofNullable(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        return new OptionalDecade<>(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, true);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> OptionalDecade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        return new OptionalDecade<>(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, false);
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
    public Optional<T9> getNinthValue() {
        return super.getNinthValue();
    }

    @Override
    public Optional<T10> getTenthValue() {
        return super.getTenthValue();
    }

    @Override
    public String toString() {
        return String.format(
                "[%s]",
                Stream.of(this.value1, this.value2, this.value3, this.value4, this.value5, this.value6, this.value7, this.value8, this.value9, this.value10)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
