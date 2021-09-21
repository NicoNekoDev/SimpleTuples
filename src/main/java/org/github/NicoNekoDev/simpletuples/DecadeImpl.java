package org.github.NicoNekoDev.simpletuples;

import java.util.Objects;

class DecadeImpl<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends EnneadImpl<T1, T2, T3, T4, T5, T6, T7, T8, T9> {
    protected final T10 value10;

    protected DecadeImpl(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6, T7 value7, T8 value8, T9 value9, T10 value10) {
        super(value1, value2, value3, value4, value5, value6, value7, value8, value9);
        this.value10 = value10;
    }

    public final T10 getTenthValue() {
        return this.value10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DecadeImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (DecadeImpl<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(this.value10, that.value10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value10);
    }
}
