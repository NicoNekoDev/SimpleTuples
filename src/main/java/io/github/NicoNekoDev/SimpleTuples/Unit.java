package io.github.NicoNekoDev.SimpleTuples;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unit<T1> extends UnitImpl<T1> implements Serializable {

    public Unit(T1 value1) {
        super(value1);
    }

    public static <T> Unit<T> of(T value) {
        return new Unit<>(value);
    }

    public final Object[] toRawArray() {
        return new Object[]{super.value1};
    }

    public final List<Object> toRawList() {
        return Arrays.asList(this.toRawArray());
    }

    public final <R> R apply(Function<? super T1, ? extends R> func) {
        return func.apply(super.value1);
    }

    public final void accept(Consumer<? super T1> cons) {
        cons.accept(super.value1);
    }

    // Unit getter

    public final <T2> Pair<T1, T2> toPair(T2 value2) {
        return new Pair<>(super.value1, value2);
    }

    public final <T2, T3> Triplet<T1, T2, T3> toTriplet(T2 value2, T3 value3) {
        return new Triplet<>(super.value1, value2, value3);
    }

    public final <T2, T3, T4> Quartet<T1, T2, T3, T4> toQuartet(T2 value2, T3 value3, T4 value4) {
        return new Quartet<>(super.value1, value2, value3, value4);
    }

    public final <T2, T3, T4, T5> Quintet<T1, T2, T3, T4, T5> toQuintet(T2 value2, T3 value3, T4 value4, T5 value5) {
        return new Quintet<>(super.value1, value2, value3, value4, value5);
    }

    public final <T2, T3, T4, T5, T6> Sextet<T1, T2, T3, T4, T5, T6> toSextet(T2 value2, T3 value3, T4 value4, T5 value5, T6 value6) {
        return new Sextet<>(super.value1, value2, value3, value4, value5, value6);
    }

    public final <T2, T3, T4, T5, T6, T7> Septet<T1, T2, T3, T4, T5, T6, T7> toSeptet(T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7) {
        return new Septet<>(super.value1, value2, value3, value4, value5, value6, value7);
    }

    public final <T2, T3, T4, T5, T6, T7, T8> Octet<T1, T2, T3, T4, T5, T6, T7, T8> toOctet(T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8) {
        return new Octet<>(super.value1, value2, value3, value4, value5, value6, value7, value8);
    }

    public final <T2, T3, T4, T5, T6, T7, T8, T9> Ennead<T1, T2, T3, T4, T5, T6, T7, T8, T9> toEnnead(T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9) {
        return new Ennead<>(super.value1, value2, value3, value4, value5, value6, value7, value8, value9);
    }

    public final <T2, T3, T4, T5, T6, T7, T8, T9, T10> Decade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> toDecade(T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        return new Decade<>(super.value1, value2, value3, value4, value5, value6, value7, value8, value9, value10);
    }

    @Override
    public String toString() {
        return String.format(
                "<%s>",
                Stream.of(this.toRawArray())
                        .filter(Objects::nonNull)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
