package io.github.NicoNekoDev.SimpleTuples.mutable;

import java.util.Objects;

class MutableUnitImpl<T1> {
    protected T1 value1;

    protected MutableUnitImpl(T1 value1) {
        this.value1 = value1;
    }

    public T1 getFirstValue() {
        return this.value1;
    }

    public MutableUnitImpl<T1> setFirstValue(T1 value1) {
        this.value1 = value1;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableUnitImpl<?> that = (MutableUnitImpl<?>) o;
        return Objects.equals(this.value1, that.value1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value1);
    }
}
