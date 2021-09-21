package org.github.NicoNekoDev.simpletuples;

import java.util.Arrays;
import java.util.List;

public class Decade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends DecadeImpl<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {

    public Decade(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        super(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Decade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        return new Decade<>(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10);
    }

    public final Object[] toRawArray() {
        return new Object[]{super.value1, super.value2, super.value3, super.value4, super.value5, super.value6, super.value7, super.value8, super.value9, super.value10};
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

    public final Triplet<T1, T2, T3> toTriplet() {
        return new Triplet<>(super.value1, super.value2, super.value3);
    }

    public final Quartet<T1, T2, T3, T4> toQuartet() {
        return new Quartet<>(super.value1, super.value2, super.value3, super.value4);
    }

    public final Quintet<T1, T2, T3, T4, T5> toQuintet() {
        return new Quintet<>(super.value1, super.value2, super.value3, super.value4, super.value5);
    }

    public final Sextet<T1, T2, T3, T4, T5, T6> toSextet() {
        return new Sextet<>(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6);
    }

    public final Septet<T1, T2, T3, T4, T5, T6, T7> toSeptet() {
        return new Septet<>(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6, super.value7);
    }

    public final Octet<T1, T2, T3, T4, T5, T6, T7, T8> toOctet() {
        return new Octet<>(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6, super.value7, super.value8);
    }

    public final Ennead<T1, T2, T3, T4, T5, T6, T7, T8, T9> toEnnead() {
        return new Ennead<>(super.value1, super.value2, super.value3, super.value4, super.value5, super.value6, super.value7, super.value8, super.value9);
    }

    // Decade getter
}
