package io.github.NicoNekoDev.SimpleTuples.mutable;

import java.util.Objects;

public class MutablePairImpl<T1, T2> extends MutableUnitImpl<T1> {
    protected T2 value2;

    protected MutablePairImpl(T1 value1, T2 value2) {
        super(value1);
        this.value2 = value2;
    }

    public T2 getSecondValue() {
        return this.value2;
    }

    public MutablePairImpl<T1, T2> setSecondValue(T2 value2) {
        this.value2 = value2;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MutablePairImpl<?, ?> that = (MutablePairImpl<?, ?>) o;
        return Objects.equals(this.value2, that.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value2);
    }
}
