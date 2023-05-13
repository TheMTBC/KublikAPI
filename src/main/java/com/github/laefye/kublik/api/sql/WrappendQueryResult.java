package com.github.laefye.kublik.api.sql;

public abstract class WrappendQueryResult {
    public abstract String getString(int n);
    public abstract long getLong(int n);
    public abstract int getInt(int n);
}
