package org.github.NicoNekoDev.simpletuples;

import java.util.Arrays;
import java.util.List;

public class Triplet<T1, T2, T3> extends TripletImpl<T1, T2, T3> {

    public Triplet(T1 value1, T2 value2, T3 value3) {
        super(value1, value2, value3);
    }

    public static <T1, T2, T3> Triplet<T1, T2, T3> of(T1 value1, T2 value2, T3 value3) {
        return new Triplet<>(value1, value2, value3);
    }

    public final Object[] toRawArray() {
        return new Object[]{super.value1, super.value2, super.value3};
    }

    public final List<Object> toRawList() {
        return Arrays.asList(this.toRawArray());
    }

    public final Unit<T1> toUnit() {
        return new Unit<>(super.value1);
    }

    public final Pair<T1, T2> toPair() {
        return new Pair<>(super.value1, super.value2);
    }

    // Triplet getter

    public final <T4> Quartet<T1, T2, T3, T4> toQuartet(T4 value4) {
        return new Quartet<>(super.value1, super.value2, super.value3, value4);
    }

    public final <T4, T5> Quintet<T1, T2, T3, T4, T5> toQuintet(T4 value4, T5 value5) {
        return new Quintet<>(super.value1, super.value2, super.value3, value4, value5);
    }

    public final <T4, T5, T6> Sextet<T1, T2, T3, T4, T5, T6> toSextet(T4 value4, T5 value5, T6 value6) {
        return new Sextet<>(super.value1, super.value2, super.value3, value4, value5, value6);
    }

    public final <T4, T5, T6, T7> Septet<T1, T2, T3, T4, T5, T6, T7> toSeptet(T4 value4, T5 value5, T6 value6, T7 value7) {
        return new Septet<>(super.value1, super.value2, super.value3, value4, value5, value6, value7);
    }

    public final <T4, T5, T6, T7, T8> Octet<T1, T2, T3, T4, T5, T6, T7, T8> toOctet(T4 value4, T5 value5, T6 value6, T7 value7, T8 value8) {
        return new Octet<>(super.value1, super.value2, super.value3, value4, value5, value6, value7, value8);
    }

    public final <T4, T5, T6, T7, T8, T9> Ennead<T1, T2, T3, T4, T5, T6, T7, T8, T9> toEnnead(T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9) {
        return new Ennead<>(super.value1, super.value2, super.value3, value4, value5, value6, value7, value8, value9);
    }

    public final <T4, T5, T6, T7, T8, T9, T10> Decade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> toDecade(T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        return new Decade<>(super.value1, super.value2, super.value3, value4, value5, value6, value7, value8, value9, value10);
    }
}
