package io.github.NicoNekoDev.SimpleTuples;

import java.util.Objects;

class PairImpl<T1, T2> extends UnitImpl<T1> {
    protected final T2 value2;

    protected PairImpl(T1 value1, T2 value2) {
        super(value1);
        this.value2 = value2;
    }

    public T2 getSecondValue() {
        return this.value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PairImpl<?, ?> that = (PairImpl<?, ?>) o;
        return Objects.equals(this.value2, that.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value2);
    }
}
