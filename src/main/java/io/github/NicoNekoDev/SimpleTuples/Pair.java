package io.github.NicoNekoDev.SimpleTuples;

import io.github.NicoNekoDev.SimpleTuples.func.PairConsumer;
import io.github.NicoNekoDev.SimpleTuples.func.PairFunction;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pair<T1, T2> extends PairImpl<T1, T2> implements Serializable {

    public Pair(T1 value1, T2 value2) {
        super(value1, value2);
    }

    public static <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {
        return new Pair<>(value1, value2);
    }

    public final Object[] toRawArray() {
        return new Object[]{super.value1, super.value2};
    }

    public final List<Object> toRawList() {
        return Arrays.asList(this.toRawArray());
    }

    public final <R> R apply(PairFunction<? super T1, ? super T2, ? extends R> func) {
        return func.apply(super.value1, super.value2);
    }

    public final void accept(PairConsumer<? super T1, ? super T2> cons) {
        cons.accept(super.value1, super.value2);
    }

    public final Unit<T1> toUnit() {
        return new Unit<>(super.value1);
    }

    // Pair getter

    public final <T3> Triplet<T1, T2, T3> toTriplet(T3 value3) {
        return new Triplet<>(super.value1, super.value2, value3);
    }

    public final <T3, T4> Quartet<T1, T2, T3, T4> toQuartet(T3 value3, T4 value4) {
        return new Quartet<>(super.value1, super.value2, value3, value4);
    }

    public final <T3, T4, T5> Quintet<T1, T2, T3, T4, T5> toQuintet(T3 value3, T4 value4, T5 value5) {
        return new Quintet<>(super.value1, super.value2, value3, value4, value5);
    }

    public final <T3, T4, T5, T6> Sextet<T1, T2, T3, T4, T5, T6> toSextet(T3 value3, T4 value4, T5 value5, T6 value6) {
        return new Sextet<>(super.value1, super.value2, value3, value4, value5, value6);
    }

    public final <T3, T4, T5, T6, T7> Septet<T1, T2, T3, T4, T5, T6, T7> toSeptet(T3 value3, T4 value4, T5 value5, T6 value6, T7 value7) {
        return new Septet<>(super.value1, super.value2, value3, value4, value5, value6, value7);
    }

    public final <T3, T4, T5, T6, T7, T8> Octet<T1, T2, T3, T4, T5, T6, T7, T8> toOctet(T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8) {
        return new Octet<>(super.value1, super.value2, value3, value4, value5, value6, value7, value8);
    }

    public final <T3, T4, T5, T6, T7, T8, T9> Ennead<T1, T2, T3, T4, T5, T6, T7, T8, T9> toEnnead(T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9) {
        return new Ennead<>(super.value1, super.value2, value3, value4, value5, value6, value7, value8, value9);
    }

    public final <T3, T4, T5, T6, T7, T8, T9, T10> Decade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> toDecade(T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        return new Decade<>(super.value1, super.value2, value3, value4, value5, value6, value7, value8, value9, value10);
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
