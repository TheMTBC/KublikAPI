package com.github.laefye.kublik.api.sql;

public abstract class WrappedQueryResult {
    public abstract String getString(int n);
    public abstract long getLong(int n);
    public abstract int getInt(int n);
    public abstract boolean getBoolean(int n);
    public abstract boolean next();
    public abstract void close();
}
