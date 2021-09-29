package io.github.NicoNekoDev.SimpleTuples;

import java.util.Objects;

class QuartetImpl<T1, T2, T3, T4> extends TripletImpl<T1, T2, T3> {
    protected final T4 value4;

    protected QuartetImpl(T1 value1, T2 value2, T3 value3, T4 value4) {
        super(value1, value2, value3);
        this.value4 = value4;
    }

    public final T4 getForthValue() {
        return this.value4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QuartetImpl<?, ?, ?, ?> that = (QuartetImpl<?, ?, ?, ?>) o;
        return Objects.equals(this.value4, that.value4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value4);
    }
}
