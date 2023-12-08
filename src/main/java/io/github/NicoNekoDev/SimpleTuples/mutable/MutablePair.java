package io.github.NicoNekoDev.SimpleTuples.mutable;

import io.github.NicoNekoDev.SimpleTuples.func.PairConsumer;
import io.github.NicoNekoDev.SimpleTuples.func.PairFunction;

import java.util.Arrays;
import java.util.List;

public class MutablePair<T1, T2> extends MutablePairImpl<T1, T2> {

    protected MutablePair(T1 value1, T2 value2) {
        super(value1, value2);
    }

    public static <T1, T2> MutablePair<T1, T2> of(T1 value1, T2 value2) {
        return new MutablePair<>(value1, value2);
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
}
