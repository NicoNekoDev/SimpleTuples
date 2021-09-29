package io.github.NicoNekoDev.SimpleTuples;

/**
 * Constructor for tuple types.
 */
public class Tuples {

    /**
     * Creates a new {@link Unit}.
     *
     * @param <T1>   the type parameter
     * @param value1 the value 1
     * @return the unit
     */
    public static <T1> Unit<T1> of(T1 value1) {
        return Unit.of(value1);
    }

    /**
     * Of pair.
     *
     * @param <T1>   the type parameter
     * @param <T2>   the type parameter
     * @param value1 the value 1
     * @param value2 the value 2
     * @return the pair
     */
    public static <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {
        return Pair.of(value1, value2);
    }

    /**
     * Of triplet.
     *
     * @param <T1>   the type parameter
     * @param <T2>   the type parameter
     * @param <T3>   the type parameter
     * @param value1 the value 1
     * @param value2 the value 2
     * @param value3 the value 3
     * @return the triplet
     */
    public static <T1, T2, T3> Triplet<T1, T2, T3> of(T1 value1, T2 value2, T3 value3) {
        return Triplet.of(value1, value2, value3);
    }

    /**
     * Of quartet.
     *
     * @param <T1>   the type parameter
     * @param <T2>   the type parameter
     * @param <T3>   the type parameter
     * @param <T4>   the type parameter
     * @param value1 the value 1
     * @param value2 the value 2
     * @param value3 the value 3
     * @param value4 the value 4
     * @return the quartet
     */
    public static <T1, T2, T3, T4> Quartet<T1, T2, T3, T4> of(T1 value1, T2 value2, T3 value3, T4 value4) {
        return Quartet.of(value1, value2, value3, value4);
    }

    /**
     * Of quintet.
     *
     * @param <T1>   the type parameter
     * @param <T2>   the type parameter
     * @param <T3>   the type parameter
     * @param <T4>   the type parameter
     * @param <T5>   the type parameter
     * @param value1 the value 1
     * @param value2 the value 2
     * @param value3 the value 3
     * @param value4 the value 4
     * @param value5 the value 5
     * @return the quintet
     */
    public static <T1, T2, T3, T4, T5> Quintet<T1, T2, T3, T4, T5> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5) {
        return Quintet.of(value1, value2, value3, value4, value5);
    }

    /**
     * Of sextet.
     *
     * @param <T1>   the type parameter
     * @param <T2>   the type parameter
     * @param <T3>   the type parameter
     * @param <T4>   the type parameter
     * @param <T5>   the type parameter
     * @param <T6>   the type parameter
     * @param value1 the value 1
     * @param value2 the value 2
     * @param value3 the value 3
     * @param value4 the value 4
     * @param value5 the value 5
     * @param value6 the value 6
     * @return the sextet
     */
    public static <T1, T2, T3, T4, T5, T6> Sextet<T1, T2, T3, T4, T5, T6> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6) {
        return Sextet.of(value1, value2, value3, value4, value5, value6);
    }

    /**
     * Of septet.
     *
     * @param <T1>   the type parameter
     * @param <T2>   the type parameter
     * @param <T3>   the type parameter
     * @param <T4>   the type parameter
     * @param <T5>   the type parameter
     * @param <T6>   the type parameter
     * @param <T7>   the type parameter
     * @param value1 the value 1
     * @param value2 the value 2
     * @param value3 the value 3
     * @param value4 the value 4
     * @param value5 the value 5
     * @param value6 the value 6
     * @param value7 the value 7
     * @return the septet
     */
    public static <T1, T2, T3, T4, T5, T6, T7> Septet<T1, T2, T3, T4, T5, T6, T7> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7) {
        return Septet.of(value1, value2, value3, value4, value5, value6, value7);
    }

    /**
     * Of octet.
     *
     * @param <T1>   the type parameter
     * @param <T2>   the type parameter
     * @param <T3>   the type parameter
     * @param <T4>   the type parameter
     * @param <T5>   the type parameter
     * @param <T6>   the type parameter
     * @param <T7>   the type parameter
     * @param <T8>   the type parameter
     * @param value1 the value 1
     * @param value2 the value 2
     * @param value3 the value 3
     * @param value4 the value 4
     * @param value5 the value 5
     * @param value6 the value 6
     * @param value7 the value 7
     * @param value8 the value 8
     * @return the octet
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Octet<T1, T2, T3, T4, T5, T6, T7, T8> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8) {
        return Octet.of(value1, value2, value3, value4, value5, value6, value7, value8);
    }

    /**
     * Of ennead.
     *
     * @param <T1>   the type parameter
     * @param <T2>   the type parameter
     * @param <T3>   the type parameter
     * @param <T4>   the type parameter
     * @param <T5>   the type parameter
     * @param <T6>   the type parameter
     * @param <T7>   the type parameter
     * @param <T8>   the type parameter
     * @param <T9>   the type parameter
     * @param value1 the value 1
     * @param value2 the value 2
     * @param value3 the value 3
     * @param value4 the value 4
     * @param value5 the value 5
     * @param value6 the value 6
     * @param value7 the value 7
     * @param value8 the value 8
     * @param value9 the value 9
     * @return the ennead
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Ennead<T1, T2, T3, T4, T5, T6, T7, T8, T9> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9) {
        return Ennead.of(value1, value2, value3, value4, value5, value6, value7, value8, value9);
    }

    /**
     * Of decade.
     *
     * @param <T1>    the type parameter
     * @param <T2>    the type parameter
     * @param <T3>    the type parameter
     * @param <T4>    the type parameter
     * @param <T5>    the type parameter
     * @param <T6>    the type parameter
     * @param <T7>    the type parameter
     * @param <T8>    the type parameter
     * @param <T9>    the type parameter
     * @param <T10>   the type parameter
     * @param value1  the value 1
     * @param value2  the value 2
     * @param value3  the value 3
     * @param value4  the value 4
     * @param value5  the value 5
     * @param value6  the value 6
     * @param value7  the value 7
     * @param value8  the value 8
     * @param value9  the value 9
     * @param value10 the value 10
     * @return the decade
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Decade<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        return Decade.of(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10);
    }
}
