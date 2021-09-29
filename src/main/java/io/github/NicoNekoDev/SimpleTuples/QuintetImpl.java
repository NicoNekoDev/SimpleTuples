package io.github.NicoNekoDev.SimpleTuples;

import java.util.Objects;

class QuintetImpl<T1, T2, T3, T4, T5> extends QuartetImpl<T1, T2, T3, T4> {
    protected final T5 value5;

    protected QuintetImpl(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5) {
        super(value1, value2, value3, value4);
        this.value5 = value5;
    }

    public final T5 getFifthValue() {
        return this.value5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QuintetImpl<?, ?, ?, ?, ?> that = (QuintetImpl<?, ?, ?, ?, ?>) o;
        return Objects.equals(this.value5, that.value5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value5);
    }
}
