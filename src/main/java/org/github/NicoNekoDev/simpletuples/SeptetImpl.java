package org.github.NicoNekoDev.simpletuples;

import java.util.Objects;

class SeptetImpl<T1, T2, T3, T4, T5, T6, T7> extends SextetImpl<T1, T2, T3, T4, T5, T6> {
    protected final T7 value7;

    protected SeptetImpl(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7) {
        super(value1, value2, value3, value4, value5, value6);
        this.value7 = value7;
    }

    public final T7 getSeventhValue() {
        return this.value7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SeptetImpl<?, ?, ?, ?, ?, ?, ?> that = (SeptetImpl<?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(this.value7, that.value7);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value7);
    }
}
