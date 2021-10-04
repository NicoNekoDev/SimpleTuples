package io.github.NicoNekoDev.SimpleTuples;

import io.github.NicoNekoDev.SimpleTuples.func.SextetConsumer;
import io.github.NicoNekoDev.SimpleTuples.func.SextetFunction;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sextet<T1, T2, T3, T4, T5, T6> extends SextetImpl<T1, T2, T3, T4, T5, T6> implements Serializable {

    public Sextet(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6) {
        super(value1, value2, value3, value4, value5, value6);
    }

    public static <T1, T2, T3, T4, T5, T6> Sextet<T1, T2, T3, T4, T5, T6> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6) {
        return new Sextet<>(value1, value2, value3, value4, value5, value6);
    }

    public final Object[] toRawArray() {
        return new Object[]{super.value1, super.value2, super.value3, super.value4, super.value5, super.value6};
    }

    public final List<Object> toRawList() {
        return Arrays.asList(this.toRawArray());
    }

    public final <R> R apply(SextetFunction<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func) {
        return func.apply(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6);
    }

    public final void accept(SextetConsumer<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> cons) {
        cons.accept(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6);
    }

    public final Unit<T1> toUnit() {
        return new Unit<>(super.value1);
    }

    public final Pair<T1, T2> toPair() {
        return new Pair<>(super.value1, super.value2);
    }

    public final Triplet<T1, T2, T3> toTriplet() {
        return new Triplet<>(super.value1, super.value2, super.value3);
    }

    public final Quartet<T1, T2, T3, T4> toQuartet() {
        return new Quartet<>(super.value1, super.value2, super.value3, super.value4);
    }

    public final Quintet<T1, T2, T3, T4, T5> toQuintet() {
        return new Quintet<>(super.value1, super.value2, super.value3, super.value4, super.value5);
    }

    // Sextet getter

    public final <T7> Septet<T1, T2, T3, T4, T5, T6, T7> toSeptet(T7 value7) {
        return new Septet<>(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6, value7);
    }

    public final <T7, T8> Octet<T1, T2, T3, T4, T5, T6, T7, T8> toOctet(T7 value7, T8 value8) {
        return new Octet<>(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6, value7, value8);
    }

    public final <T7, T8, T9> Ennead<T1, T2, T3, T4, T5, T6, T7, T8, T9> toEnnead(T7 value7, T8 value8, T9 value9) {
        return new Ennead<>(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6, value7, value8, value9);
    }

    public final <T7, T8, T9, T10> Decade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> toDecade(T7 value7, T8 value8, T9 value9, T10 value10) {
        return new Decade<>(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6, value7, value8, value9, value10);
    }

    @Override
    public final String toString() {
        return String.format(
                "<%s>",
                Stream.of(this.toRawArray())
                        .filter(Objects::nonNull)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
