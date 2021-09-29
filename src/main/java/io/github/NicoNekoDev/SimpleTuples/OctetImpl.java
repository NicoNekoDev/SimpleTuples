package io.github.NicoNekoDev.SimpleTuples;

import java.util.Objects;

public class OctetImpl<T1, T2, T3, T4, T5, T6, T7, T8> extends SeptetImpl<T1, T2, T3, T4, T5, T6, T7> {
    protected final T8 value8;

    protected OctetImpl(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8) {
        super(value1, value2, value3, value4, value5, value6, value7);
        this.value8 = value8;
    }

    public final T8 getEightValue() {
        return this.value8;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OctetImpl<?, ?, ?, ?, ?, ?, ?, ?> that = (OctetImpl<?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(this.value8, that.value8);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value8);
    }
}
