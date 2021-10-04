package io.github.NicoNekoDev.SimpleTuples;

import java.util.Objects;

class SextetImpl<T1, T2, T3, T4, T5, T6> extends QuintetImpl<T1, T2, T3, T4, T5> {
    protected final T6 value6;

    protected SextetImpl(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6) {
        super(value1, value2, value3, value4, value5);
        this.value6 = value6;
    }

    public T6 getSixthValue() {
        return this.value6;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SextetImpl<?, ?, ?, ?, ?, ?> that = (SextetImpl<?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(this.value6, that.value6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value6);
    }
}
