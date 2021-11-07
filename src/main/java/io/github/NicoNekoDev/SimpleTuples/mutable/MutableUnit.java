package io.github.NicoNekoDev.SimpleTuples.mutable;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MutableUnit<T1> extends MutableUnitImpl<T1> {

    public MutableUnit(T1 value1) {
        super(value1);
    }

    public static <T> MutableUnit<T> of(T value) {
        return new MutableUnit<>(value);
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
}
