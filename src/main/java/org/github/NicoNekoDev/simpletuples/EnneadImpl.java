package org.github.NicoNekoDev.simpletuples;

import java.util.Objects;

class EnneadImpl<T1, T2, T3, T4, T5, T6, T7, T8, T9> extends OctetImpl<T1, T2, T3, T4, T5, T6, T7, T8> {
    protected final T9 value9;

    protected EnneadImpl(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9) {
        super(value1, value2, value3, value4, value5, value6, value7, value8);
        this.value9 = value9;
    }

    public final T9 getNinthValue() {
        return this.value9;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EnneadImpl<?, ?, ?, ?, ?, ?, ?, ?, ?> that = (EnneadImpl<?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(this.value9, that.value9);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value9);
    }
}
