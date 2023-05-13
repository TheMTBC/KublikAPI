package com.github.laefye.kublik.api.sql;

public abstract class WrappedStatement {
    public abstract WrappedStatement setString(String value);
    public abstract WrappedStatement setLong(long value);
    public abstract WrappedStatement setInt(int value);
    public abstract void execute();
    public abstract WrappendQueryResult executeQuery();
}
