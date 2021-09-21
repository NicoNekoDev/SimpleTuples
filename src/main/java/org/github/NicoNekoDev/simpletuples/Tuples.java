package org.github.NicoNekoDev.simpletuples;

public class Tuples {

    public static <T1> Unit<T1> of(T1 value1) {
        return Unit.of(value1);
    }

    public static <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {
        return Pair.of(value1, value2);
    }

    public static <T1, T2, T3> Triplet<T1, T2, T3> of(T1 value1, T2 value2, T3 value3) {
        return Triplet.of(value1, value2, value3);
    }

    public static <T1, T2, T3, T4> Quartet<T1, T2, T3, T4> of(T1 value1, T2 value2, T3 value3, T4 value4) {
        return Quartet.of(value1, value2, value3, value4);
    }

    public static <T1, T2, T3, T4, T5> Quintet<T1, T2, T3, T4, T5> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5) {
        return Quintet.of(value1, value2, value3, value4, value5);
    }

    public static <T1, T2, T3, T4, T5, T6> Sextet<T1, T2, T3, T4, T5, T6> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6) {
        return Sextet.of(value1, value2, value3, value4, value5, value6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Septet<T1, T2, T3, T4, T5, T6, T7> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7) {
        return Septet.of(value1, value2, value3, value4, value5, value6, value7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Octet<T1, T2, T3, T4, T5, T6, T7, T8> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8) {
        return Octet.of(value1, value2, value3, value4, value5, value6, value7, value8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Ennead<T1, T2, T3, T4, T5, T6, T7, T8, T9> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9) {
        return Ennead.of(value1, value2, value3, value4, value5, value6, value7, value8, value9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Decade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        return Decade.of(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10);
    }
}
