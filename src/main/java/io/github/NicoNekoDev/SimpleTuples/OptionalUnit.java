package io.github.NicoNekoDev.SimpleTuples;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalUnit<T1> extends UnitImpl<Optional<T1>> {

    public OptionalUnit(T1 value1, boolean ofNullable) {
        super(ofNullable ? Optional.ofNullable(value1) : Optional.of(value1));
    }

    public OptionalUnit(T1 value1) {
        this(value1, true);
    }

    public static <T1> OptionalUnit<T1> ofNullable(T1 value1) {
        return new OptionalUnit<>(value1, true);
    }

    public static <T1> OptionalUnit<T1> of(T1 value1) {
        return new OptionalUnit<>(value1, false);
    }

    @Override
    public Optional<T1> getFirstValue() {
        return super.getFirstValue();
    }

    @Override
    public String toString() {
        return String.format(
                "[%s]",
                Stream.of(this.value1)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
