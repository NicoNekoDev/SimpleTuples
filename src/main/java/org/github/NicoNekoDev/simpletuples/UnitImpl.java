package org.github.NicoNekoDev.simpletuples;

import java.util.Objects;

class UnitImpl<T1> {
    protected final T1 value1;

    protected UnitImpl(T1 value1) {
        this.value1 = value1;
    }

    public final T1 getFirstValue() {
        return this.value1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitImpl<?> that = (UnitImpl<?>) o;
        return Objects.equals(this.value1, that.value1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value1);
    }
}
