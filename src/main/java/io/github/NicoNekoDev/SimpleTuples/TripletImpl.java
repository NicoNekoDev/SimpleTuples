package io.github.NicoNekoDev.SimpleTuples;

import java.util.Objects;

class TripletImpl<T1, T2, T3> extends PairImpl<T1, T2> {
    protected final T3 value3;

    protected TripletImpl(T1 value1, T2 value2, T3 value3) {
        super(value1, value2);
        this.value3 = value3;
    }

    public final T3 getThirdValue() {
        return this.value3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TripletImpl<?, ?, ?> that = (TripletImpl<?, ?, ?>) o;
        return Objects.equals(this.value3, that.value3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value3);
    }
}
