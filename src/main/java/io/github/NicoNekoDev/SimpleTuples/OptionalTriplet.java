package io.github.NicoNekoDev.SimpleTuples;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalTriplet<T1, T2, T3> extends TripletImpl<Optional<T1>, Optional<T2>, Optional<T3>> {

    public OptionalTriplet(T1 value1, T2 value2, T3 value3, boolean ofNullable) {
        super(ofNullable ? Optional.ofNullable(value1) : Optional.of(value1), ofNullable ? Optional.ofNullable(value2) : Optional.of(value2),
                ofNullable ? Optional.ofNullable(value3) : Optional.of(value3));
    }

    public OptionalTriplet(T1 value1, T2 value2, T3 value3) {
        this(value1, value2, value3, true);
    }

    public static <T1, T2, T3> OptionalTriplet<T1, T2, T3> ofNullable(T1 value1, T2 value2, T3 value3) {
        return new OptionalTriplet<>(value1, value2, value3, true);
    }

    public static <T1, T2, T3> OptionalTriplet<T1, T2, T3> of(T1 value1, T2 value2, T3 value3) {
        return new OptionalTriplet<>(value1, value2, value3, false);
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
    public String toString() {
        return String.format(
                "[%s]",
                Stream.of(this.value1, this.value2, this.value3)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
